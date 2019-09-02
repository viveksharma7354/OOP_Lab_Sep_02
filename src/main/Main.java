package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Person admi = new Person(s.next(),s.nextInt(),s.next().charAt(0));
        Student bacha = new Student(admi.getName(),admi.getAge(),admi.getGender(),s.nextLong(),s.next());
        System.out.println(admi.toString());
        System.out.println(bacha.toString());
    }
}
