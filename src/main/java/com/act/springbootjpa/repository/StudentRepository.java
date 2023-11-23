package com.act.springbootjpa.repository;

import com.act.springbootjpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByFirstNameContainingOrLastNameContainingOrEmailContaining(String search, String search1, String search2);
}
