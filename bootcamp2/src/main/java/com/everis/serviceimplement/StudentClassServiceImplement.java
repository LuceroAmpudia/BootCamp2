package com.everis.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.everis.entity.StudentClass;
import com.everis.repository.StudentClassRepository;
import com.everis.service.StudentClassService;

public class StudentClassServiceImplement implements StudentClassService {

	@Autowired
	private StudentClassRepository studentClassRepository;
	
	@Override
	public Optional<StudentClass> get(Integer idStudentClass) {
		return studentClassRepository.findById(idStudentClass);
	}

	@Override
	public StudentClass save(StudentClass pattern) {
		return studentClassRepository.save(pattern);
	}

	@Override
	public List<StudentClass> findAll(StudentClass pattern) {
		return studentClassRepository.findAll();
	}

	@Override
	public StudentClass update(StudentClass pattern) {
		return studentClassRepository.save(pattern);
	}

	@Override
	public void delete(Integer idStudentClass) {
		studentClassRepository.deleteById(idStudentClass);

	}

}
