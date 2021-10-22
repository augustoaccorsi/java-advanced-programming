package com.augustoaccorsi.chapter4.lambdas;

@FunctionalInterface
public interface GreetingMessage {
    public abstract void greet(String name);
}