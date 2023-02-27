package com.xworkz.icecream.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.icecream.dto.IceCreamDTO;
import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepository;

@Service
public class IceCreamServiceImpl implements IceCreamService{
	
	@Autowired
	private IceCreamRepository iceCreamRepository;

	@Override
	public Set<ConstraintViolation<IceCreamDTO>> validateAndSave(IceCreamDTO dto) {
		System.out.println("Running validateAndSave in IceCreamServiceImpl.......");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<IceCreamDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation(s) in dto : " + dto);
			return violations;
		} else {
			System.out.println("violation is not there in dto, can save");

			IceCreamEntity iceCreamEntity = new IceCreamEntity();
			iceCreamEntity.setName(dto.getName());
			iceCreamEntity.setBrandName(dto.getBrandName());
			iceCreamEntity.setColor(dto.getColor());
			iceCreamEntity.setType(dto.getType());
			iceCreamEntity.setPrice(dto.getPrice());

			boolean saved = iceCreamRepository.save(iceCreamEntity);
			System.out.println("Entity saved : " + saved);
			return Collections.emptySet();
		}

	}

	@Override
	public IceCreamDTO findById(int id) {
		if (id > 0) {
			IceCreamEntity entity = this.iceCreamRepository.find(id);
			if (entity != null) {
				System.out.println("entity is found in service for id" + id);
				IceCreamDTO dto = new IceCreamDTO();
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

}
