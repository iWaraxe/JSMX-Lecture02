package com.coherentsolutions.s4encapsulation;
// ----------------------------------------------
// Section: Encapsulation
// ----------------------------------------------

/*
- Encapsulation:
  - It's about bundling data (attributes) and methods together.
  - It restricts direct access to some of the object's components.
*/

/*
- Implementing Encapsulation in Java:
  - Use 'private' access modifier for attributes.
  - Provide public 'get' and 'set' methods to access and modify the attributes.
*/

// Example of a class with encapsulation

import com.coherentsolutions.s3classobject.Vehicle;

import java.util.List;

public class Student {
    private String name;

    private List<Vehicle> vehicleList;
    private int age;

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
        if (age > 0 && age < 125) {
            this.age = age;
        }
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
