package com.coherentsolutions.s3classobject;

// Demo: Simple Class and Object

// Define a simple class named 'Person'
public class Person {
    // Attributes
    private String name;
    private int age;

    // Construction
    public Person() {
    }

    // Getters and Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int age) {
        if (age >= 0) { // Validate age
            this.age = age;
        }
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}