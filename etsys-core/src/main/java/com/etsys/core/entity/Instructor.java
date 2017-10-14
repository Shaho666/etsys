package com.etsys.core.entity;

public class Instructor {

	private String instructorId;
	
	private String instructorName;
	
	private String instructorPlace;
	
	private String instructorTel;
	
	private String instructorEmail;
	
	private Integer instructorAge;

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getInstructorPlace() {
		return instructorPlace;
	}

	public void setInstructorPlace(String instructorPlace) {
		this.instructorPlace = instructorPlace;
	}

	public String getInstructorTel() {
		return instructorTel;
	}

	public void setInstructorTel(String instructorTel) {
		this.instructorTel = instructorTel;
	}

	public String getInstructorEmail() {
		return instructorEmail;
	}

	public void setInstructorEmail(String instructorEmail) {
		this.instructorEmail = instructorEmail;
	}

	public Integer getInstructorAge() {
		return instructorAge;
	}

	public void setInstructorAge(Integer instructorAge) {
		this.instructorAge = instructorAge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instructorId == null) ? 0 : instructorId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instructor other = (Instructor) obj;
		if (instructorId == null) {
			if (other.instructorId != null)
				return false;
		} else if (!instructorId.equals(other.instructorId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", instructorName=" + instructorName + ", instructorPlace="
				+ instructorPlace + ", instructorTel=" + instructorTel + ", instructorEmail=" + instructorEmail
				+ ", instructorAge=" + instructorAge + "]";
	}
	
}
