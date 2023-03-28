package com.xworkz.icecream.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.icecream.dto.IceCreamDTO;
import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IceCreamServiceImpl implements IceCreamService {

	@Autowired
	private IceCreamRepository iceCreamRepository;

	@Override
	public Set<ConstraintViolation<IceCreamDTO>> validateAndSave(IceCreamDTO dto) {
		log.info("Running validateAndSave in IceCreamServiceImpl.......");

		Set<ConstraintViolation<IceCreamDTO>> violations = validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation(s) in dto : " + dto);
			return violations;
		} else {
			log.info("violation is not there in dto, can save");

			IceCreamEntity iceCreamEntity = new IceCreamEntity();
			iceCreamEntity.setName(dto.getName());
			iceCreamEntity.setBrandName(dto.getBrandName());
			iceCreamEntity.setColor(dto.getColor());
			iceCreamEntity.setType(dto.getType());
			iceCreamEntity.setPrice(dto.getPrice());

			boolean saved = iceCreamRepository.save(iceCreamEntity);
			log.info("Entity saved : " + saved);
			return Collections.emptySet();
		}

	}

	private Set<ConstraintViolation<IceCreamDTO>> validate(IceCreamDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<IceCreamDTO>> violations = validator.validate(dto);
		return violations;
	}

	@Override
	public IceCreamDTO findById(int id) {
		if (id > 0) {
			IceCreamEntity entity = this.iceCreamRepository.find(id);
			if (entity != null) {
				log.info("entity is found in service for id" + id);
				IceCreamDTO dto = new IceCreamDTO();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setBrandName(entity.getBrandName());
				dto.setColor(entity.getColor());
				dto.setType(entity.getType());
				dto.setPrice(entity.getPrice());
				return dto;
			}
		}
		return IceCreamService.super.findById(id);
	}

	@Override
	public List<IceCreamDTO> findByBrandName(String brandName) {
		log.info("Running findByBrandName........" + brandName);

		if (brandName != null && !brandName.isEmpty()) {
			log.info("BrandName is valid.... calling repo");
			List<IceCreamEntity> entites = this.iceCreamRepository.findByBrandName(brandName);
			List<IceCreamDTO> listOfdto = new ArrayList<IceCreamDTO>();
			for (IceCreamEntity entity : entites) {
				IceCreamDTO dto = new IceCreamDTO();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setBrandName(entity.getBrandName());
				dto.setColor(entity.getColor());
				dto.setType(entity.getType());
				dto.setPrice(entity.getPrice());
				listOfdto.add(dto);
			}
			log.info("Size of dtos " + listOfdto.size());
			log.info("Size of entites " + entites.size());
			return listOfdto;

		} else {
			System.err.println("BrandName is invalid....");
		}

		return IceCreamService.super.findByBrandName(brandName);
	}

	@Override
	public Set<ConstraintViolation<IceCreamDTO>> validateAndUpdate(IceCreamDTO dto) {
		log.info("Running validateAndUpdate in IceCreamServiceImpl.......");

		Set<ConstraintViolation<IceCreamDTO>> violations = validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation(s) in dto : " + dto);
			return violations;
		} else {
			log.info("violation is not there in dto, can save");

			IceCreamEntity iceCreamEntity = new IceCreamEntity();
			iceCreamEntity.setId(dto.getId());
			iceCreamEntity.setName(dto.getName());
			iceCreamEntity.setBrandName(dto.getBrandName());
			iceCreamEntity.setColor(dto.getColor());
			iceCreamEntity.setType(dto.getType());
			iceCreamEntity.setPrice(dto.getPrice());

			boolean updated = iceCreamRepository.update(iceCreamEntity);
			log.info("Entity updated : " + updated);
			return Collections.emptySet();
		}
	}

	@Override
	public IceCreamDTO deleteById(int id) {
		if (id > 0) {
			IceCreamEntity entity = this.iceCreamRepository.deleteById(id);
			if (entity != null) {
				log.info("Entity is found in service for id " + id);
				IceCreamDTO dto = new IceCreamDTO();
				dto.setName(entity.getName());
				dto.setBrandName(entity.getBrandName());
				dto.setColor(entity.getColor());
				dto.setType(entity.getType());
				dto.setPrice(entity.getPrice());
				return dto;
			}
		}
		return IceCreamService.super.deleteById(id);
	}

	@Override
	public List<IceCreamDTO> findByNameAndPrice(String name, double price) {
		log.info("Running findByNameAndPrice........" + name + price);

		log.info("Name, Price is valid.... calling repo");
		List<IceCreamEntity> entites = this.iceCreamRepository.findByNameAndPrice(name, price);
		List<IceCreamDTO> listOfdto = new ArrayList<IceCreamDTO>();
		for (IceCreamEntity entity : entites) {
			IceCreamDTO dto = new IceCreamDTO();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setBrandName(entity.getBrandName());
			dto.setColor(entity.getColor());
			dto.setType(entity.getType());
			dto.setPrice(entity.getPrice());
			listOfdto.add(dto);
		}
		log.info("Size of dtos " + listOfdto.size());
		log.info("Size of entites " + entites.size());
		return listOfdto;

	}

	@Override
	public List<IceCreamDTO> findAll() {
		log.info("Running findAll........");
		List<IceCreamEntity> entites = this.iceCreamRepository.findAll();
		List<IceCreamDTO> listOfdto = new ArrayList<IceCreamDTO>();
		for (IceCreamEntity entity : entites) {
			IceCreamDTO dto = new IceCreamDTO();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setBrandName(entity.getBrandName());
			dto.setColor(entity.getColor());
			dto.setType(entity.getType());
			dto.setPrice(entity.getPrice());
			listOfdto.add(dto);
		}
		log.info("Size of dtos " + listOfdto.size());
		log.info("Size of entites " + entites.size());
		return listOfdto;
	}
}
