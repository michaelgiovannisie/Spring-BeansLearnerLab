package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    private Students students;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testCurrentStudents() {
        assertNotNull(students);
        assertEquals(3, students.size());
    }

    @Test
    public void testPreviousStudents() {
        assertNotNull(previousStudents);
        assertEquals(3, previousStudents.size());
    }
}