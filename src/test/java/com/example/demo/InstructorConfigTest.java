package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
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