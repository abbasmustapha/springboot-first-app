package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("James","Bond");
    }

    // http://localhost:8080/students
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Steeve","McQueen"));
        students.add(new Student("John","Wagne"));
        students.add(new Student("Paul","Bismuth"));
        students.add(new Student("Jack","London"));
        return students;
    }

    // http://localhost:8080/student/james/bond
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName1,@PathVariable("lastName") String lastName){
        return new Student(firstName1,lastName);
    }

    // build rest api to handle query parameters
    // http://localhost:8080/student?firstName=Bond&lastName=James

    @GetMapping("/student/query")
    public Student getStudentQueryParam(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name="lastName") String lastName){
        return new Student(firstName,lastName);
    }

}
