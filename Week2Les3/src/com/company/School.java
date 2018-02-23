package com.company;

public class School {
    private String naam;

    public School(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return this.naam;
    }
}
