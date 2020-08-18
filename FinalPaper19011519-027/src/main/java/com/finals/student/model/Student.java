package com.finals.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.finals.course.model.Course;

@Entity
@Table(name="tbl_student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="studentID")
	private int studentID;
	
	@Column(name="studentName")
	private String studentName;
	
	@Column(name="studentSemester")
	private int studentSemester;
	
	@Column(name="studentRollNumber")
	private String studentRollNumber;
	
	@Column(name="studentCGPA")
	private double studentCGPA;
	
	@Column(name="studentIsActive")
	private boolean studentIsActive;

	@ManyToOne
	private Course course;
	
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

	public int getStudentSemester() {
		return studentSemester;
	}

	public void setStudentSemester(int studentSemester) {
		this.studentSemester = studentSemester;
	}

	public String getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public double getStudentCGPA() {
		return studentCGPA;
	}

	public void setStudentCGPA(double studentCGPA) {
		this.studentCGPA = studentCGPA;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public boolean isStudentIsActive() {
		return studentIsActive;
	}

	public void setStudentIsActive(boolean studentIsActive) {
		this.studentIsActive = studentIsActive;
	}

	


}
