package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student("James","Bond");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Steeve","McQueen"));
        students.add(new Student("John","Wagne"));
        students.add(new Student("Paul","Bismuth"));
        students.add(new Student("Jack","London"));

        return students;

    }
}
