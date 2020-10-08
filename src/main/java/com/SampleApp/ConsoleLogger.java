package com.SampleApp;

public class ConsoleLogger implements ILogger {

    @Override
    public void log(String text) {
        System.out.println(text);
    }
}
