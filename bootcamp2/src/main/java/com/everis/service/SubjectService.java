package com.everis.service;

import java.util.List;
import java.util.Optional;


import com.everis.entity.Subject;

public interface SubjectService {

	Optional<Subject> get(Integer idSubject);
	Subject save(Subject pattern);
	List<Subject> findAll(Subject pattern);
	Subject update (Subject pattern);
	void delete(Integer idSubject);
}
