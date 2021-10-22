package com.augustoaccorsi.chapter4.lambdas;

import com.augustoaccorsi.chapter4.funcionalinterface.GreetingMessage;

public class Main {
    public static void main(String[] args) {
        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String name){
                System.out.println("Hello "+name);
            }
        };

        greetingMessage.greet("Guto");

        GreetingMessage greetingMessage2 = (String name) -> {
            System.out.println("Hello "+name);
        };
        greetingMessage.greet("Accorsi");

        MessagePrinter messagePrinter = () -> {
            System.out.println("This is a message");
        };

        messagePrinter.printMessage();
    }
}
