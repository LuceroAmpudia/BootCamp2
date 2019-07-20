package com.everis.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentClass")
public class StudentClass {

	
	// Here my identifier is defined as the primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Date dateFrom;
	
	// With the annotation @Column I name each column of the database

	
	@Column(name ="date_to")
	private Date dateTo;
}
