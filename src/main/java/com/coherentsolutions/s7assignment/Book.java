package com.coherentsolutions.s7;
// ----------------------------------------------
// Section: Assignment
// ----------------------------------------------

/*
- 'public': Accessible from any location.
- 'private': Restricted to its own class.
*/

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
