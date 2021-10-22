package com.augustoaccorsi.chapter4.funcionalinterface;

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
    }
}
