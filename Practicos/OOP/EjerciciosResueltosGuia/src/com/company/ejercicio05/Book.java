package com.company.ejercicio05;

import com.company.ejercicio03.Author;

import java.util.Arrays;

/**
 * Created by arcangel on 16/11/16.
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }

    public String getAuthorNames(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            if (i+1 == authors.length){
                sb.append(authors[i].getName());
            } else {
                sb.append(authors[i].getName()+",");
            }
        }
        return sb.toString();
    }
}
