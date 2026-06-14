package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClassroomConfigTest {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void testCurrentCohort() {
        assertNotNull(currentCohort);
        assertEquals(3, currentCohort.getStudents().size());
    }

    @Test
    public void testPreviousCohort() {
        assertNotNull(previousCohort);
        assertEquals(3, previousCohort.getStudents().size());
    }
}