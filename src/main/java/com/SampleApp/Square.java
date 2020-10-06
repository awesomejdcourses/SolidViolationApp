package com.SampleApp;

public class Square extends Rectangle {

    @Override
    public void plotToConsole() {
        //let's imagine it really draws the square with strings
        String image = String.format("Square with side %s", getWidth()) ;
        this.output.write(image);

        this.logger.log("Drew the square");
    }
}
