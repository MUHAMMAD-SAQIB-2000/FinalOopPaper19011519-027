package com.finals.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finals.course.model.Course;
import com.finals.course.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Course saveOne(Course course) {
		return courseRepository.save(course);
	}
	
	public List<Course> saveOne(List<Course> courses) {
		return courseRepository.saveAll(courses);
	}

	public List<Course> getAll(){
		return courseRepository.findAll();
	}
	
	public Course getById(int id) {
		return courseRepository.findById(id).orElse(null);
	}
	
	public List<Course> getByIsActive(boolean courseIsActive){
		return courseRepository.findByCourseIsActive(courseIsActive);
	}
	
	
	public String deleteByID(int id) {
		courseRepository.deleteById(id);
		return "Record deleted!!!";
	}
	
	public Course updateByCourse(Course course) {
		Course existingcourse = courseRepository.findById(course.getCourseID()).orElse(null);
		existingcourse.setCourseTitle(course.getCourseTitle());
		existingcourse.setCourseCode(course.getCourseCode());
		existingcourse.setCourseCreditHour(course.getCourseCreditHour());
		existingcourse.setCourseCode(course.getCourseCode());
		existingcourse.setCourseAssignmentTopic(course.getCourseAssignmentTopic());
		existingcourse.setCourseIsActive(course.isCourseIsActive());
		return courseRepository.save(existingcourse);
	}
}
