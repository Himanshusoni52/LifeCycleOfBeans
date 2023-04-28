package com.springboot.Beans;

public class Student {
	
	private String studentName;
	private String studentaddress;
	private int studentID;

	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	
	
	public Student(int studentID, String studentName, String studentaddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentaddress = studentaddress;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentaddress=" + studentaddress
				+ "]";
	}
	
	

}
