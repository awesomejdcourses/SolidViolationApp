package com.SampleApp;

public class Rectangle {
    private int width;
    private int height;

    protected ConsoleOutput output;
    protected ConsoleLogger logger;

    public Rectangle() {
        this.output = new ConsoleOutput();
        this.logger = new ConsoleLogger();

        logger.log("Created a new rectangle");
    }

    public int getWidth() { return this.width; }
    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return this.height; }
    public void setHeight(int height) { this.height = height; }

    public int Perimeter() { return 2 * (getWidth() + getHeight()); }
    public int Area() { return getWidth() * getHeight(); }

    public void plotToConsole()
    {
        //let's imagine it really draws the rectangle with strings
        String image = String.format("Rectangle %dx%d", getWidth(), getHeight());
        this.output.write(image);

        this.logger.log("Drew the rectangle");
    }
}
