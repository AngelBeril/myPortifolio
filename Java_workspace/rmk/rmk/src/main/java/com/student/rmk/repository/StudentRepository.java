package com.student.rmk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.rmk.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
