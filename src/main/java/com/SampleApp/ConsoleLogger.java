package com.SampleApp;

public class ConsoleLogger implements IOutputAndLog {
    @Override
    public void write(String text) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void log(String text) {
        System.out.println(text);
    }
}
