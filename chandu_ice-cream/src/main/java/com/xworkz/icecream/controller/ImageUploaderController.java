package com.xworkz.icecream.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ImageUploaderController {

	public ImageUploaderController() {
		log.info("Create " + this.getClass().getSimpleName());
	}
	
	@PostMapping("/upload")
	public String onUpload(@RequestParam("pic") MultipartFile multipartFile) throws IOException {
		log.info("MultipartFile" +multipartFile);
		log.info(multipartFile.getOriginalFilename());
		log.info(""+multipartFile.getContentType());
		log.info(""+multipartFile.getSize());
		log.info(""+multipartFile.getBytes());
		
		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("D:\\IC_Image\\" +multipartFile.getOriginalFilename());
		Files.write(path, bytes);
		return "ImageUpload";
	}
	
	@GetMapping("/display")
	public void onDowload(HttpServletResponse response) throws IOException {
		response.setContentType("image/jpeg");
		String fileName = "icecream.jpg";
		File file = new File("D:\\IC_Image\\" +fileName);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();
	}
}
