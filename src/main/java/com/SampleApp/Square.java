package com.SampleApp;

public class Square implements IFigure, IDrawable {
    private final int width;

    protected IOutput output;
    protected ILogger logger;

    public Square(int width, IOutput output, ILogger logger) {
        this.width = width;
        this.output = output;
        this.logger = logger;

        this.logger.log("Created a new square");
    }

    public int getWidth() {
        return this.width;
    }

    public int Perimeter() {
        return 4 * getWidth();
    }

    public int Area() {
        return getWidth() * getWidth();
    }

    @Override
    public void plotToConsole() {
        //let's imagine it really draws the square with strings
        String image = String.format("Square with side %s",
                                     getWidth());
        this.output.write(image);

        this.logger.log("Drew the square");
    }
}
