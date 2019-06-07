package com.example.thatsthespirit.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Docent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String voornaam;
	String achternaam;
	long telefoonnummer;

}
