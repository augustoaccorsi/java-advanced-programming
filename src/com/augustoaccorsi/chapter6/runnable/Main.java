package com.augustoaccorsi.chapter6.runnable;

import com.augustoaccorsi.chapter6.threads.ThreadExemple;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableExemple());
        thread1.setName("My First Runnable Thread");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i <= 100){
                    System.out.println(i+" "+ Thread.currentThread().getName());
                    i++;
                }
            }
        });

        thread2.setName("My Second Runnable Thread");
        thread2.start();
    }
}
