package com.act.springbootjpa.controller;


import com.act.springbootjpa.entity.Student;
import com.act.springbootjpa.repository.StudentRepository;
import com.act.springbootjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;





    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudetns();
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable("id") Long studentId){
        return studentService.getStudentById(studentId);
    }


    @PutMapping("/updateStudent/{id}")
    public String  updateStudent(@PathVariable("id") Long studentId, @RequestBody Student student){
         studentService.updateStudent(studentId, student);

         return "Update Successfuly";
    }


//    Save Student || POST

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student){
         studentService.saveStudent(student);

         return "User Registered Successfully!.";
    }


    @PostMapping("/saveStudents")
    public String saveStudents(@RequestBody List<Student> students){
         studentService.saveStudents(students);

         return "Registration Success!.";
    }


    @DeleteMapping("/deleteStudet/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId){
         studentService.deleteStudentById(studentId);

         return "Student deleted Successfully!.";
    }


    @GetMapping("/searchStudent/{search}")
    public List<Student> searchStudent(@PathVariable("search") String search) {
        return studentRepository.findByFirstNameContainingOrLastNameContainingOrEmailContaining(search, search, search);
    }

}
