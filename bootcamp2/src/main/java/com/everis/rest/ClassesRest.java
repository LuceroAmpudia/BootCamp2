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

import com.everis.entity.Classes;
import com.everis.service.ClassesService;




@RestController
@RequestMapping("/classes")
public class ClassesRest {

	@Autowired
	ClassesService classesService;
	
	@GetMapping("/get/{idClasses}")
	public Optional<Classes> get(@PathVariable("idClasses") int idClasses)
	{
		return classesService.get(idClasses);
	}
	
	@PostMapping("/save")
	public Classes save(@RequestBody Classes classes)
	{
		return classesService.save(classes);
	}
	
	@GetMapping("/get")
	public List<Classes> findAll()
	{
		return classesService.findAll(null);
	}
	
	
	@DeleteMapping("/delete/{idClasses}")
	public void delete(@PathVariable("idClasses") int idClasses)
	{
		classesService.delete(idClasses);
	}
	
	
	@PutMapping("/update")
	public Classes update(@RequestBody Classes classes)
	{
		return classesService.update(classes);
	}
	
}
