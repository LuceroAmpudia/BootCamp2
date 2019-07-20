package com.everis.service;

import java.util.List;
import java.util.Optional;


import com.everis.entity.StudentClass;

public interface StudentClassService {

	Optional<StudentClass> get(Integer idStudentClass);
	StudentClass save(StudentClass pattern);
	List<StudentClass> findAll(StudentClass pattern);
	StudentClass update (StudentClass pattern);
	void delete(Integer idStudentClass);
	
}
