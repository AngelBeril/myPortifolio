package com.student.rmk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.rmk.entity.Student;
import com.student.rmk.service.StudentService;

@RestController
@RequestMapping("/student/")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudentDetails(@PathVariable Long id) {

		Student student = studentService.getStudentsDetailsByID(id);

		return new ResponseEntity<Student>(student, HttpStatus.ACCEPTED);

	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Student>> getAllStudentDetails() {

		List<Student> students = studentService.getAllStudentsDetailsByID();

		return new ResponseEntity<List<Student>>(students, HttpStatus.ACCEPTED);

	}

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudentDetails(@RequestBody Student student) {

		Student saveStudent = studentService.saveStudentsDetails(student);

		return new ResponseEntity<Student>(saveStudent, HttpStatus.ACCEPTED);
	}

	@PutMapping("/update")
	public ResponseEntity<Student> updateStudentDetails(@RequestBody Student student) {

		Student updateStudent = studentService.updateStudentsDetails(student);

		return new ResponseEntity<Student>(updateStudent, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudentDetails(@PathVariable Long id) {

		studentService.deleteStudentsDetailsByID(id);

		return new ResponseEntity<String>("Removed Successfully", HttpStatus.ACCEPTED);
	}
}
