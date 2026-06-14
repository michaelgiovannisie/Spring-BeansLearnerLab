package com.example.demo;

public class Students extends People<Student>{
    public Students(Student... student) {
        super(student);
    }
}
