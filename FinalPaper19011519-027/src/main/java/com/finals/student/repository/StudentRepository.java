package com.finals.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.finals.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	public List<Student> findByStudentIsActive(boolean courseIsActive);
}
