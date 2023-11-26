package com.techmeskills.homework_7.Task_1;

public class Director implements Definable {
    int codePosition1;

    //to create constructor
    public Director(int codePosition1) {
        this.codePosition1 = codePosition1;
    }

    public void doOutput() {
        System.out.println("Director ");
    }
}
