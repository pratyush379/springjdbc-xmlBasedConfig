package com.pratyush.spring_jdbc.dao;

import java.util.List;

import com.pratyush.spring_jdbc.Entity.Student;

public interface StudentDao {

	public int insert(Student student);
	public int change(Student student);
	public int delete(int id);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
}
