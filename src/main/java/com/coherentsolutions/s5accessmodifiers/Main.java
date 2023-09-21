package com.coherentsolutions.s5accessmodifiers;

public class Main {
    public static void main(String[] args) {
        // Create an object and use public methods
        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);
        student.publicMethod();
        // student.privateMethod();  // This will cause a compilation error

    }
}
