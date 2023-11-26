package com.techmeskills.homework_7.Task_1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director(111);
        Employer employer = new Employer(444);
        Accountant accountant = new Accountant(555);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input code ");
        int codePosition = sc.nextInt();

        if (codePosition == director.codePosition1) {
            director.doOutput();
        } else if (codePosition == employer.codePosition2) {
            employer.doOutput();
        } else if (codePosition == accountant.codePosition3) {
            accountant.doOutput();
        } else {
            System.out.println("it's wrong number");

        }
    }
}
