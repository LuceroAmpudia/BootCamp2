package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.entity.Classes;
public interface ClassesService {

	Optional<Classes> get(Integer idClasses);
	Classes save(Classes pattern);
	List<Classes> findAll(Classes pattern);
	Classes update (Classes pattern);
	void delete(Integer idClasses);
}
