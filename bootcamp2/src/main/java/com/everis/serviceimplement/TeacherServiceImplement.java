package com.everis.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.everis.entity.Teacher;
import com.everis.repository.TeacherRepository;
import com.everis.service.TeacherService;

public class TeacherServiceImplement implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public Optional<Teacher> get(Integer idTeacher) {
		return teacherRepository.findById(idTeacher);
	}

	@Override
	public Teacher save(Teacher pattern) {
		return teacherRepository.save(pattern);
	}

	@Override
	public List<Teacher> findAll(Teacher pattern) {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher update(Teacher pattern) {
		return teacherRepository.save(pattern);
	}

	@Override
	public void delete(Integer idTeacher) {
		teacherRepository.deleteById(idTeacher);

	}
}
