package com.act.springbootjpa.service;

import com.act.springbootjpa.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);

    public List<Student> getStudetns();

    public Student getStudentById(Long studentId);

    public Student updateStudent(Long studentId, Student student);

    public void deleteStudentById(Long studentId);

//    public List<Student> saveStudents(Student student);

    List<Student> saveStudents(List<Student> students);


//    public Optional<Student> getStudentById(Long studentId);
}
