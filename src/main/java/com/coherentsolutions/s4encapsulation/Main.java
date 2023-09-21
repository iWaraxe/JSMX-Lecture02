package com.coherentsolutions.s4encapsulation;

public class Main {
    public static void main(String[] args) {
        // Demo: Class Using Encapsulation

        // Create an object of the Student class
        Student student1 = new Student();

        // Use 'set' methods to set attributes
        student1.setName("Alice");
        student1.setAge(20);

        // Use 'get' methods to access and display attributes
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());

    }
}
