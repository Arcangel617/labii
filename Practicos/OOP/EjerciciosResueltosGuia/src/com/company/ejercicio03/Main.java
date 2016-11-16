package com.company.ejercicio03;

/**
 * Created by arcangel on 16/11/16.
 */
public class Main {
    public static void main(String [] args){
        Author author1 = new Author("Arcangel Andres Artigue","artigue_arcangel@hotmail.com",'m');
        Author author2 = new Author("Maria Nakamura","marial@nakamura.com",'f');
        Author author3 = new Author("Alien","soydel@otroplanta.com",'k');

        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println(author3.toString());

    }
}
