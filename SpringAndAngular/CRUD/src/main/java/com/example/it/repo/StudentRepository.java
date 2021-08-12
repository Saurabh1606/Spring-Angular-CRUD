package com.example.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.it.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
