package com.student.rmk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.rmk.entity.Student;
import com.student.rmk.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public Student getStudentsDetailsByID(Long id) {
		// TODO Auto-generated method stub
		
		Optional<Student> student = studentRepository.findById(id);
		return student.get();
	}

	public Student saveStudentsDetails(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public Student updateStudentsDetails(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public void deleteStudentsDetailsByID(Long id) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(id);
		
	}

	public List<Student> getAllStudentsDetailsByID() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	
	

}
