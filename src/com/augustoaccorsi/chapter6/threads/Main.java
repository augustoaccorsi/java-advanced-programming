package com.augustoaccorsi.chapter6.threads;

public class Main {
    public static void main(String[] args) {

        ThreadExemple thread1 = new ThreadExemple();
        thread1.setName("My first Thread");
        thread1.start();

        ThreadExemple thread2 = new ThreadExemple();
        thread2.setName("My second  Thread");
        thread2.start();
    }
}
