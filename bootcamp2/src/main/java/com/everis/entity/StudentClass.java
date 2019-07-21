package com.everis.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.everis.key.CompositeKeyStudentClass;


@Entity
@Table(name = "studentClass")
@IdClass(value = CompositeKeyStudentClass.class)
public class StudentClass{

	
	// Here my identifier is defined as the primary key
	@ManyToOne   
	@JoinColumn(name="id_student",referencedColumnName = "idStudent")	
	@Id
    private Student idStudent;
	
	@ManyToOne                
	@JoinColumn(name="id_classes",referencedColumnName = "idClasses")
	@Id
    private Classes idClasses;
	
	@Column(name = "date_from")
	@Id
	private Date dateFrom;

	// With the annotation @Column I name each column of the database
	@Column(name ="date_to")
	private Date dateTo;

	public Student getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Student idStudent) {
		this.idStudent = idStudent;
	}

	public Classes getIdClasses() {
		return idClasses;
	}

	public void setIdClasses(Classes idClasses) {
		this.idClasses = idClasses;
	}

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
	
	
	

	



	 
    

	
	
	
	
	
	
    
    
    
}
