package com.jdbc.student;

public class student {
	
	private int studentID;
	private String StudentName;
	private String StudentPhone;
	private String StudentCity;
	public student(int studentID, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentID = studentID;
		this.StudentName = studentName;
		this.StudentPhone = studentPhone;
		this.StudentCity = studentCity;
	}
	
	public student(String studentName, String studentPhone, String studentCity) {
		super();
		this.StudentName = studentName;
		this.StudentPhone = studentPhone;
		this.StudentCity = studentCity;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentPhone() {
		return StudentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}

	public String getStudentCity() {
		return StudentCity;
	}

	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "student [studentID=" + studentID + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
				+ ", StudentCity=" + StudentCity + "]";
	}
		
	
}
