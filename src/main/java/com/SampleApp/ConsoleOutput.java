package com.SampleApp;

public class ConsoleOutput implements IOutput {
    
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
