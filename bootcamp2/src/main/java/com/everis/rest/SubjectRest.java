package com.everis.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.entity.Subject;
import com.everis.service.SubjectService;


@RestController
@RequestMapping("/subject")
public class SubjectRest {

	@Autowired
	SubjectService subjectService;
	
	@GetMapping("/get/{idSubject}")
	public Optional<Subject> get(@PathVariable("idSubject") int idSubject)
	{
		return subjectService.get(idSubject);
	}
	
	@PostMapping("/save")
	public Subject save(@RequestBody Subject subject)
	{
		return subjectService.save(subject);
	}
	
	@GetMapping("/get")
	public List<Subject> findAll()
	{
		return subjectService.findAll(null);
	}
	
	
	@DeleteMapping("/delete/{idSubject}")
	public void delete(@PathVariable("idSubject") int idSubject)
	{
		subjectService.delete(idSubject);
	}
	
	
	@PutMapping("/update")
	public Subject update(@RequestBody Subject subject)
	{
		return subjectService.update(subject);
	}
	
}
