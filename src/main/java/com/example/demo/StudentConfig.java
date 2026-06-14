package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(
                new Student(1, "Michael"),
                new Student(2, "Joe"),
                new Student(3, "Collin")
        );
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        return new Students(
                new Student(4, "Anitra"),
                new Student(5, "Prachi"),
                new Student(6, "Shocka")
        );
    }

}
