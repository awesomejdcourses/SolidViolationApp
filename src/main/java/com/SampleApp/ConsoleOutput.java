package com.SampleApp;

public class ConsoleOutput implements IOutputAndLog {
    @Override
    public void write(String text) {
        System.out.println(text);
    }

    @Override
    public void log(String text) {
        throw new UnsupportedOperationException();
    }
}
