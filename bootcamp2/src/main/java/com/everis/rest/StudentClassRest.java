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


import com.everis.entity.StudentClass;
import com.everis.service.StudentClassService;


@RestController
@RequestMapping("/studentClass")
public class StudentClassRest {

	@Autowired
	StudentClassService studentClassService;
	
	@GetMapping("/get/{idStudent}")
	public Optional<StudentClass> get(@PathVariable("idStudentClass") int idStudentClass)
	{
		return studentClassService.get(idStudentClass);
	}
	
	@PostMapping("/save")
	public StudentClass save(@RequestBody StudentClass studentClass)
	{
		return studentClassService.save(studentClass);
	}
	
	@GetMapping("/get")
	public List<StudentClass> findAll()
	{
		return studentClassService.findAll(null);
	}
	
	
	@DeleteMapping("/delete/{idStudentClass}")
	public void delete(@PathVariable("idStudentClass") int idStudentClass)
	{
		studentClassService.delete(idStudentClass);
	}
	
	
	@PutMapping("/update")
	public StudentClass update(@RequestBody StudentClass studentClass)
	{
		return studentClassService.update(studentClass);
	}
	
}
