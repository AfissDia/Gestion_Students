package com.dia.student.service;

import java.util.List;

import com.dia.student.entity.Student;

public interface StudentService {
List<Student> getAllStudents();

Student saveStudent(Student student);

Student getStudentById(Long id);
Student updateStudent(Student student);

void delecteStudentById(Long id);
}
