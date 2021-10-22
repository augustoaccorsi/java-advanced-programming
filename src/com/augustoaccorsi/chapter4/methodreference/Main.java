package com.augustoaccorsi.chapter4.methodreference;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);

        Shapes shapes = Square::calculateArea;

        System.out.println("Area: "+shapes.getArea(square));
    }
}
