package com.act.springbootjpa.service;

import com.act.springbootjpa.entity.Student;
import com.act.springbootjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudetns() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        Student stuDV = studentRepository.findById(studentId).get();

        if(Objects.nonNull(student.getFirstName()) && !"".equalsIgnoreCase(student.getFirstName())){
            stuDV.setFirstName(student.getFirstName());
        }

        if(Objects.nonNull(student.getLastName()) && !"".equalsIgnoreCase(student.getLastName())){
            stuDV.setFirstName(student.getLastName());
        }

        if(Objects.nonNull(student.getEmail()) && !"".equalsIgnoreCase(student.getEmail())){
            stuDV.setFirstName(student.getEmail());
        }

        if(Objects.nonNull(student.getPassword()) && !"".equalsIgnoreCase(student.getPassword())){
            stuDV.setFirstName(student.getPassword());
        }

        return studentRepository.save(stuDV);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
    }

//    @Override
//    public List<Student> saveStudents(List <Student> students) {
//        return studentRepository.saveAll(students);
//    }


    @Override
    public List<Student> saveStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }


//    @Override
//    public Optional<Student> getStudentById(Long id) {
//        return studentRepository.findById(id);
//    }
}
