package com.example.thatsthespirit.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.thatsthespirit.domein.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
