package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
