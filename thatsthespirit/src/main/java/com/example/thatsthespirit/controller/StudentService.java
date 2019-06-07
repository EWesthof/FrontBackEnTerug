package com.example.thatsthespirit.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thatsthespirit.domein.Student;

@Service
@Transactional
public class StudentService {
	@Autowired 		//dit zorgt voor het automatisch instantieren van een nieuw object, is nodig omdat alles in het framework moet gaan werken
	StudentRepository sRepository;
	
	public void studentOpslaan() {
		Student tiny = new Student();
	//	tiny.voornaam = "tiny";
	//	tiny.leeftijd = 12;
		sRepository.save(tiny);
	}
	
	public Iterable<Student> geefAlleStudenten() {
		Iterable<Student> lijst = sRepository.findAll();
		return lijst;
	}
	
	public void studentInDatabase(Student student) {
		sRepository.save(student);
	}
}
