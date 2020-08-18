package com.finals.course.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="courseID")
	private int courseID;
	
	@Column(name="courseTitle")
	private String courseTitle;
	
	@Column(name="courseCreditHour")
	private String courseCreditHour;
	
	@Column(name="courseCode")
	private String courseCode;
	
	@Column(name="courseAssignmentTopic")
	private String courseAssignmentTopic;
	
	@Column(name="courseIsActive")
	private boolean courseIsActive;

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseCreditHour() {
		return courseCreditHour;
	}

	public void setCourseCreditHour(String courseCreditHour) {
		this.courseCreditHour = courseCreditHour;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseAssignmentTopic() {
		return courseAssignmentTopic;
	}

	public void setCourseAssignmentTopic(String courseAssignmentTopic) {
		this.courseAssignmentTopic = courseAssignmentTopic;
	}

	public boolean isCourseIsActive() {
		return courseIsActive;
	}

	public void setCourseIsActive(boolean courseIsActive) {
		this.courseIsActive = courseIsActive;
	}

	
	
	
	
}
