package com.example;

public class App {

    public static String calculateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks should be between 0 and 100");
        }

        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int marks = 85;
        String grade = calculateGrade(marks);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}