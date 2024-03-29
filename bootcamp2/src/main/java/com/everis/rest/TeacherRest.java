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

import com.everis.entity.Teacher;
import com.everis.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherRest {

	@Autowired
	TeacherService teacherService;
	
	@GetMapping("/get/{idTeacher}")
	public Optional<Teacher> get(@PathVariable("idTeacher") int idTeacher)
	{
		return teacherService.get(idTeacher);
	}
	
	@PostMapping("/save")
	public Teacher save(@RequestBody Teacher teacher)
	{
		return teacherService.save(teacher);
	}
	
	@GetMapping("/get")
	public List<Teacher> findAll()
	{
		return teacherService.findAll(null);
	}
	
	
	@DeleteMapping("/delete/{idTeacher}")
	public void delete(@PathVariable("idTeacher") int idTeacher)
	{
		teacherService.delete(idTeacher);
	}
	
	
	@PutMapping("/update")
	public Teacher update(@RequestBody Teacher teacher)
	{
		return teacherService.update(teacher);
	}
	
}
