package com.finals.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finals.student.model.Student;
import com.finals.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveOne(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getAll(){
		return studentRepository.findAll();
	}
	
	public Student getById(int id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	public List<Student> getAllActive(boolean studentIsActive){
		return studentRepository.findByStudentIsActive(studentIsActive);
	}
	
	public String deleteByID(int id) {
		studentRepository.deleteById(id);
		return "Record deleted!!!";
	}
	
	public Student updateByStudent(Student student) {
		Student existingStudent = studentRepository.findById(student.getStudentID()).orElse(null);
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setStudentRollNumber(student.getStudentRollNumber());
		existingStudent.setStudentSemester(student.getStudentSemester());
		existingStudent.setStudentCGPA(student.getStudentCGPA());
		existingStudent.setStudentIsActive(student.isStudentIsActive());
		existingStudent.setCourse(student.getCourse());
		return studentRepository.save(existingStudent);
	}
}
