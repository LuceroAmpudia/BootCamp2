package com.everis.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "classes") //With this annotation I create my table in the database
public class Classes {

	// Here my identifier is defined as the primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClasses;
	
	// With the annotation @Column I name each column of the database
	@Column(name ="classes_code")
	private String classCode;
	
	@Column(name ="classes_name")
	private String className;
	
	@Column(name ="date_from")
	private Date dateFrom;
	
	@Column(name ="date_to")
	private Date dateTo;

	// With the annotation @ManyToOne I establish the relationship of many with one.
		@ManyToOne                   
		@JoinColumn(name="id_teacher",referencedColumnName = "idTeacher")	
		private Teacher idTeacher;

		@ManyToOne                   
		@JoinColumn(name="id_subject",referencedColumnName = "idSubject")	
		private Subject idSubject;

		// Here the getters and setters are generated


		public String getClassCode() {
			return classCode;
		}

		public int getIdClasses() {
			return idClasses;
		}

		public void setIdClasses(int idClasses) {
			this.idClasses = idClasses;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}

		public String getClassName() {
			return className;
		}

		public void setClassName(String className) {
			this.className = className;
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

		public Teacher getIdTeacher() {
			return idTeacher;
		}

		public void setIdTeacher(Teacher idTeacher) {
			this.idTeacher = idTeacher;
		}

		public Subject getIdSubject() {
			return idSubject;
		}

		public void setIdSubject(Subject idSubject) {
			this.idSubject = idSubject;
		}

	
	
	
}
