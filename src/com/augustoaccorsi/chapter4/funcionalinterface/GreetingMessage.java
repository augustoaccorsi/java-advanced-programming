package com.augustoaccorsi.chapter4.funcionalinterface;

@FunctionalInterface
public interface GreetingMessage {
    public abstract void greet(String name);
}