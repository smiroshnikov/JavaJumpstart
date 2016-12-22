package com.teamtreehouse;

import java.util.Date;


public class Treet {
    private String author;
    private String description;
    private Date dateWasSet;

    public Treet(String author, String description, Date dateWasSet) {
        this.author = author;
        this.description = description;
        this.dateWasSet = dateWasSet;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    @Override // help the compiler to understand that understand that method of super type is overridden
    public String toString() {
        return "Treet : \"" + description + "\" -@" + author;
    }

    public Date getDateWasSet() {
        return dateWasSet;
    }
}
