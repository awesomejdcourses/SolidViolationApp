package com.SampleApp;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        rectangle.plotToConsole();

        Square square = new Square();
        square.setWidth(5);
        square.setHeight(5);
        square.plotToConsole();
    }
}
