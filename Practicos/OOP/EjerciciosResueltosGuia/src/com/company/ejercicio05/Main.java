package com.company.ejercicio05;

import com.company.ejercicio03.Author;

/**
 * Created by arcangel on 16/11/16.
 */
public class Main {
    public static void main(String [] args){

        Author autores1[] = {
                new Author("Alirio Suarez","alirio@suarez.com",'m'),
                new Author("Alejandro Jimenez","alejandro@jimenez.com",'m'),
                new Author("Marianela Cordero","marianela@cordero.com",'f')
        };

        Author autores2[] = {
                new Author("Marcelo Camero","marcelo@camero.com",'m'),
                new Author("Maria Aurora Zambrano","maurora@zambrano.com",'f'),
                new Author("Jose Manuel Herrera","josemanuel@herrrea.com",'m')
        };

        Book book1 = new Book("LabProgII",autores1,50,2);
        Book book2 = new Book("OtroLibro",autores2,250);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        System.out.println(book1.getAuthorNames());
        System.out.println(book2.getAuthorNames());
    }
}
