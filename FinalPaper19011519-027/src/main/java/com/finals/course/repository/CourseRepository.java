package com.finals.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.finals.course.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
	public List<Course> findByCourseIsActive(boolean courseIsActive);

}
