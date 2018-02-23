package com.company;

public class Main {

    public static void main(String[] args) {
        School deshool = new School("ICA");

        Student student1 = new Student("Ivor", 1, deshool);
        System.out.println(deshool);
    }
}
