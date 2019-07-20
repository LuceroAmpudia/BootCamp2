package com.everis.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


import com.everis.key.CompositeKeyStudentClass;


@Entity
@Table(name = "studentClass")
@IdClass(value = CompositeKeyStudentClass.class)
public class StudentClass{

	
	// Here my identifier is defined as the primary key

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Date dateFrom;

	// With the annotation @Column I name each column of the database
	@Column(name ="date_to")
	private Date dateTo;

	
	                 
	@JoinColumn(name="id_student",referencedColumnName = "idStudent")	
    private CompositeKeyStudentClass idStudent;
	
	
	                 
	@JoinColumn(name="id_classes",referencedColumnName = "idClasses")
    private CompositeKeyStudentClass idClasses;


	public Date getDateFrom() {
		return dateFrom;
	}


	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}


	public Date getDateTo() {
		return dateTo;
	}


	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}


	public CompositeKeyStudentClass getIdStudent() {
		return idStudent;
	}


	public void setIdStudent(CompositeKeyStudentClass idStudent) {
		this.idStudent = idStudent;
	}


	public CompositeKeyStudentClass getIdClasses() {
		return idClasses;
	}


	public void setIdClasses(CompositeKeyStudentClass idClasses) {
		this.idClasses = idClasses;
	}


	 
    

	
	
	
	
	
	
    
    
    
}
