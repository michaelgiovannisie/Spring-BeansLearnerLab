package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(
            Instructors instructors,
            @Qualifier("students") Students students
    ) {
        return new Classroom(students, instructors);
    }

    @Bean
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(
            Instructors instructors,
            @Qualifier("previousStudents") Students previousStudents
    ) {
        return new Classroom(previousStudents, instructors);
    }
}