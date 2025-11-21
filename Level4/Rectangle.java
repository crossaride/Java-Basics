
package com.example.Java_Basics.model.Level4;

public class Rectangle {
    
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }
    
    public double getArea(){
        return getWidth() * getHeight();
    }
    
    public double getPerimeter(){
        return 2 * (getWidth() + getHeight());
    }
}
