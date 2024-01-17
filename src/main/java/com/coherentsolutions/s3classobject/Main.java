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
        Vehicle myCar1 = new Vehicle();
        Vehicle myCar2 = new Vehicle();
        Vehicle myCar3 = new Vehicle();

        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);


        // Create an object of the Person class
        Person person1 = new Person();
        // Assign values to attributes
        person1.displayInfo();
        person1.setName("John");
        person1.setAge(-2_100_000_030);

        // Call the method to display information
        person1.displayInfo();
    }
}
