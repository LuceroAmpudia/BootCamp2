package com.everis.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.entity.School;
import com.everis.repository.SchoolRepository;
import com.everis.service.SchoolService;

public class SchoolServiceImplement implements SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	@Override
	public Optional<School> get(Integer idSchool) {
		return schoolRepository.findById(idSchool);
	}

	@Override
	public School save(School pattern) {
		return schoolRepository.save(pattern);
	}

	@Override
	public List<School> findAll(School pattern) {
		return schoolRepository.findAll();
	}

	@Override
	public School update(School pattern) {
		return schoolRepository.save(pattern);
	}

	@Override
	public void delete(Integer idSchool) {
		schoolRepository.deleteById(idSchool);

	}
}
