package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    
    @Bean
    public Instructors tcUsaInstructors() {
        return new Instructors (
                new Instructor(1, "Kris"),
                new Instructor(2, "Paul"),
                new Instructor(3, "Brian")
        );
    }

    @Bean
    public Instructors tcUkInstructors() {
        return new Instructors (
                new Instructor(4, "Dan"),
                new Instructor(5, "Gloria"),
                new Instructor(6, "Cassie")
        );
    }

    @Bean
    @Primary
    public Instructors instructors() {
        return new Instructors(
                new Instructor(7, "Desa"),
                new Instructor(8, "Maryah"),  
                new Instructor(9, "Jessica")
        );
    }
}
