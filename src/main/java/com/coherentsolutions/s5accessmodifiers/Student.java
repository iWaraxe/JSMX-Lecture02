package com.coherentsolutions.s5accessmodifiers;
// ------------------------------------------------
// Section: Access Modifiers: public and private
// ------------------------------------------------

/*
- What are Access Modifiers?
  - Keywords that set the accessibility of classes, interfaces, and other members.
  - They control who can access these components.
*/

/*
- Importance of 'public' and 'private' Access Modifiers:
  - 'public': Accessible from any location, promotes availability.
  - 'private': Restricted to its own class, enhances security.
*/

// Demo: Modify the Encapsulation class to demonstrate 'public' and 'private'

// Class definition
public class Student {
    // Private attributes
    private String name;
    private int age;

    // Public 'get' and 'set' methods for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Public 'get' and 'set' methods for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Private method to show how private works
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Public method to demonstrate calling a private method
    public void publicMethod() {
        System.out.println("This is a public method.");
        privateMethod();
    }
}

