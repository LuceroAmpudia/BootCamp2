package com.everis.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.entity.Student;
import com.everis.service.StudentService;
import com.everis.repository.StudentRepository;

public class StudentServiceImplement implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Optional<Student> get(Integer idStudent) {
		return studentRepository.findById(idStudent);
	}

	@Override
	public Student save(Student pattern) {
		return studentRepository.save(pattern);
	}

	@Override
	public List<Student> findAll(Student pattern) {
		return studentRepository.findAll();
	}

	@Override
	public Student update(Student pattern) {
		return studentRepository.save(pattern);
	}

	@Override
	public void delete(Integer idStudent) {
		studentRepository.deleteById(idStudent);

	}

}
