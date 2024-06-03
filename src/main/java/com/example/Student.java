package com.example;

// Starter code for Student class
public class Student {
    // Attributes
    private String name;
    private int age;
    private String studentId;
    private String major;

    // Add a constructor here
    // public Student(String name, int age, String studentId, String major) { ... }

    // Add getter and setter methods here
    // public String getName() { ... }
    // public void setName(String name) { ... }
    // public int getAge() { ... }
    // public void setAge(int age) { ... }
    // public String getStudentId() { ... }
    // public void setStudentId(String studentId) { ... }
    // public String getMajor() { ... }
    // public void setMajor(String major) { ... }

    // Method to display student details
    public void displayStudentDetails() {
        // TODO: Implement this method
        System.out.println("Name of the Student : " + name);
        System.out.println("Age of the student : " + age);
        System.out.println("Student Id : " + studentId);
        System.out.println("Major : " + major);
    }

    public Student(String name, int age, String studentId, String major) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Method to update major
    public void updateMajor(String newMajor) {
        // TODO: Implement this method
    }
}
