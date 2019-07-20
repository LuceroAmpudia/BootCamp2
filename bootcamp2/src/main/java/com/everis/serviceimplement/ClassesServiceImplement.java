package com.everis.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.entity.Classes;
import com.everis.repository.ClassesRepository;
import com.everis.service.ClassesService;

public class ClassesServiceImplement implements ClassesService {

	@Autowired
	private ClassesRepository classesRepository;
	
	@Override
	public Optional<Classes> get(Integer idClasses) {
		return classesRepository.findById(idClasses);
	}

	@Override
	public Classes save(Classes pattern) {
		return classesRepository.save(pattern);
	}

	@Override
	public List<Classes> findAll(Classes pattern) {
		return classesRepository.findAll();
	}

	@Override
	public Classes update(Classes pattern) {
		return classesRepository.save(pattern);
	}

	@Override
	public void delete(Integer idClasses) {
		classesRepository.deleteById(idClasses);

	}
}
