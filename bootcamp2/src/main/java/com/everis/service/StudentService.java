package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.entity.Student;

public interface StudentService {

	Optional<Student> get(Integer idStudent);
	Student save(Student pattern);
	List<Student> findAll(Student pattern);
	Student update (Student pattern);
	void delete(Integer idStudent);
}
