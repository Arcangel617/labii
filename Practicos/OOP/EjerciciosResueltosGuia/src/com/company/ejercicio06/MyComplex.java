package com.company.ejercicio06;

/**
 * Created by arcangel on 16/11/16.
 */
public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){}

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + this.real + "," + this.imag + "i)";
    }

    public boolean isReal(){
        return true;
    }

    public boolean isImaginary(){
        return true;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public MyComplex add(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();

        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex c1 = new MyComplex(this.real, this.imag);
        c1.add(right);
        return c1;
    }

    public MyComplex substract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();

        return this;
    }
}
