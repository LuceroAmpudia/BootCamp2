package com.everis.key;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;



@SuppressWarnings("serial")
public class CompositeKeyStudentClass implements Serializable{

	private Date dateFrom;
    private int idStudent;
    private int idClasses;
	 
	    @Override
	    public int hashCode() {
	        int hash = 7;
	        hash = 59 * hash + Objects.hashCode(this.idStudent);
	        hash = 59 * hash + Objects.hashCode(this.idClasses);
	        hash = 59 * hash + Objects.hashCode(this.dateFrom);
	        return hash;
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final CompositeKeyStudentClass other = (CompositeKeyStudentClass) obj;
	        if (!Objects.equals(this.idClasses, other.idClasses)) {
	            return false;
	        }
	        if (!Objects.equals(this.idStudent, other.idStudent)) {
	            return false;
	        }
	        if (!Objects.equals(this.idStudent, other.dateFrom)) {
	            return false;
	        }
	        return true;
	    }

		public Date getDateFrom() {
			return dateFrom;
		}

		public void setDateFrom(Date dateFrom) {
			this.dateFrom = dateFrom;
		}

		public int getIdStudent() {
			return idStudent;
		}

		public void setIdStudent(int idStudent) {
			this.idStudent = idStudent;
		}

		public int getIdClasses() {
			return idClasses;
		}

		public void setIdClasses(int idClasses) {
			this.idClasses = idClasses;
		}

		
		
	    
	    
	    
}
