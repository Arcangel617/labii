package com.company.ejericicio01;

/**
 * Created by arcangel on 16/11/16.
 */
public class Circle {
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        if (radius < 1){
            this.radius = 1.0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString(){
        return "Circle[radius="+this.radius+"]";
    }
}
