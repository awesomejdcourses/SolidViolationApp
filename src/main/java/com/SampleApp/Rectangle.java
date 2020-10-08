package com.SampleApp;

public class Rectangle implements IFigure, IDrawable {
    private final int width;
    private final int height;

    private final IOutput output;
    private final ILogger logger;

    public Rectangle(int width, int height, IOutput output, ILogger logger) {
        this.width = width;
        this.height = height;
        this.output = output;
        this.logger = logger;

        this.logger.log("Created a new rectangle");
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int Perimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public int Area() {
        return getWidth() * getHeight();
    }

    public void plotToConsole() {
        //let's imagine it really draws the rectangle with strings
        String image = String.format("Rectangle %dx%d",
                                     getWidth(),
                                     getHeight());
        this.output.write(image);

        this.logger.log("Drew the rectangle");
    }
}
