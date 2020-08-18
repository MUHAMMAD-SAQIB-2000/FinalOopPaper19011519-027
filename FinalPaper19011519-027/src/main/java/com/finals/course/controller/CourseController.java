package com.finals.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finals.course.model.Course;
import com.finals.course.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/saveOneCourse")
	public Course saveOneCourse(@RequestBody Course course) {
		return courseService.saveOne(course);
	}
	
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourses(){
		return courseService.getAll();
	}
	
	@GetMapping("/getCourseById/{id}")
	public Course getCourseById(@PathVariable int id) {
		return courseService.getById(id);
	}
	
	@GetMapping("/getAllActiveCourses/{value}")
	public List<Course> getAllActiveCourses(@PathVariable boolean value){
		return courseService.getByIsActive(value);
	}
	
	@DeleteMapping("/deleteCourse/{id}")
	public String deleteCourse(@PathVariable int id) {
		courseService.deleteByID(id);
		return "Course With ID =" +id+ " is deleted!!!";
	}
	
	@PutMapping("/updateCourse")
	public Course updateStudent(@RequestBody Course course) {
		return courseService.updateByCourse(course);
	}
	
}
