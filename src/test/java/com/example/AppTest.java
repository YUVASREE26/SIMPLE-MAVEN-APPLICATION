package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testGradeA() {
        assertEquals("A", App.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", App.calculateGrade(85));
    }

    @Test
    void testGradeC() {
        assertEquals("C", App.calculateGrade(75));
    }

    @Test
    void testGradeD() {
        assertEquals("D", App.calculateGrade(65));
    }

    @Test
    void testGradeF() {
        assertEquals("F", App.calculateGrade(40));
    }

    @Test
    void testInvalidMarks() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.calculateGrade(150);
        });
    }
}