package com.company.ejericicio01;

/**
 * Created by arcangel on 16/11/16.
 */
public class Main {
    public static void main(String [] args){
        Circle circulo1 = new Circle();
        Circle circulo2 = new Circle(10);
        Circle circulo3 = new Circle(25);
        Circle circulo4 = new Circle(3);
        Circle circulo5 = new Circle(5);

        actions(circulo1);
        actions(circulo2);
        actions(circulo3);
        actions(circulo4);
        actions(circulo5);
    }

    public static void actions(Circle c){
        System.out.println("=================================");
        System.out.println(c);
        System.out.println("Area -> "+c.getArea());
        System.out.println("Circumference -> "+c.getCircumference());
        c.setRadius(c.getRadius()+1.5);
        System.out.println("New value -> "+c.getRadius());
        System.out.println("Area -> "+c.getArea());
        System.out.println("Circumference -> "+c.getCircumference());
        System.out.println("Done.");
    }
}
