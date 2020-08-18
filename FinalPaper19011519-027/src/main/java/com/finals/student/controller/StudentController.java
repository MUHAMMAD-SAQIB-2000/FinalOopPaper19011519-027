package com.finals.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finals.course.repository.CourseRepository;
import com.finals.student.model.Student;
import com.finals.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseRepository courseRepository;
	
	@PostMapping("/saveOneStudent/{id}")
	public Student saveOneStudent(@RequestBody Student student , @PathVariable int id) {
		student.setCourse(courseRepository.findById(id).orElse(null));
		return studentService.saveOne(student);
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		return studentService.getAll();
	}
	
	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentService.getById(id);
	}
	
	@GetMapping("/getAllActiveStudents/{value}")
	public List<Student> getAllActiveStudents(@PathVariable boolean value){
		return studentService.getAllActive(value);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentService.deleteByID(id);
		return "Student With ID =" +id+ " is deleted!!!";
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateByStudent(student);
	}
}
