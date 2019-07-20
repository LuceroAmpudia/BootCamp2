package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
