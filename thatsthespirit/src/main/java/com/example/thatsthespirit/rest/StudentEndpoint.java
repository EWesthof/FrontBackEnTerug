package com.example.thatsthespirit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.thatsthespirit.controller.StudentService;
import com.example.thatsthespirit.domein.Student;

@RestController
public class StudentEndpoint {
	@Autowired
	StudentService sService;
	
	@GetMapping("hallo")
	public String go() {
		System.out.println("ff checken");
		sService.studentOpslaan();
		return "Het is gelukt";
	}
	
	@GetMapping("alleStudenten")
	public Iterable<Student> toonAlleStudenten() {
		System.out.println("De studenten worden getoond");
		return sService.geefAlleStudenten();
	}
	@PostMapping("voegstudenttoe")
	public String voegStudentToe(@RequestBody Student student) {
		System.out.println(student.getVoornaam());
		sService.studentInDatabase(student);
		return "hallo";
	}
}
