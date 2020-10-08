package com.SampleApp;

public class Main {

    public static void main(String[] args) {
        ILogger consoleLogger = new ConsoleLogger();
        IOutput consoleOutput = new ConsoleOutput();

        new Rectangle(10,
                      5,
                      consoleOutput,
                      consoleLogger).plotToConsole();

        new Square(5,
                   consoleOutput,
                   consoleLogger).plotToConsole();
    }
}
