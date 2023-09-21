package com.coherentsolutions.s3classobject;

/*
- Object:
  - An object is an instance of a class.
  - It is a concrete realization of the class blueprint.
*/


public class Main {
    public static void main(String[] args) {
        /*
        - Creating an Object in Java:
        Syntax:
        ClassName objectName = new ClassName();
        */
        Vehicle myCar = new Vehicle();

        // Create an object of the Person class
        Person person1 = new Person();
        // Assign values to attributes
        person1.name = "John";
        person1.age = 30;
        // Call the method to display information
        person1.displayInfo();
    }
}
