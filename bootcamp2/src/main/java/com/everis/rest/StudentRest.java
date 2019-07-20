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

import com.everis.entity.Student;
import com.everis.service.StudentService;



@RestController
@RequestMapping("/student")
public class StudentRest {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/get/{idStudent}")
	public Optional<Student> get(@PathVariable("idStudent") int idStudent)
	{
		return studentService.get(idStudent);
	}
	
	@PostMapping("/save")
	public Student save(@RequestBody Student student)
	{
		return studentService.save(student);
	}
	
	@GetMapping("/get")
	public List<Student> findAll()
	{
		return studentService.findAll(null);
	}
	
	
	@DeleteMapping("/delete/{idStudent}")
	public void delete(@PathVariable("idStudent") int idStudent)
	{
		studentService.delete(idStudent);
	}
	
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student)
	{
		return studentService.update(student);
	}
	
}
