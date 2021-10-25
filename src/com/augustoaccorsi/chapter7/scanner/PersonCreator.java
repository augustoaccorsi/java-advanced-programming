package com.augustoaccorsi.chapter7.scanner;

import java.util.Scanner;

public class PersonCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name, age and phone: ");
        String name = scanner.next();
        int age = scanner.nextInt();
        long phone = scanner.nextLong();

        Person person = new Person(name, age, phone);
    }
}
