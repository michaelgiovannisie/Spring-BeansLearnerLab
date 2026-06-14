package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InstructorConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Test
    public void testTcUsaInstructors() {
        assertNotNull(tcUsaInstructors);
        assertEquals(3, tcUsaInstructors.size());
    }

    @Test
    public void testTcUkInstructors() {
        assertNotNull(tcUkInstructors);
        assertEquals(3, tcUkInstructors.size());
    }

    @Test
    public void testInstructors() {
        assertNotNull(instructors);
        assertEquals(3, instructors.size());
    }
}