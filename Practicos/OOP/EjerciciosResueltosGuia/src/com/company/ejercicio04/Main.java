package com.company.ejercicio04;

/**
 * Created by arcangel on 16/11/16.
 */
public class Main {
    public static void main(String [] args){
        Account account1 = new Account("1","Arcangel Andres Artigue");
        Account account2 = new Account("2","Jorge Sampaoli",10000);

        System.out.println(account1);
        System.out.println(account2);

        account2.transferTo(account1,5070);

        System.out.println(account1);
        System.out.println(account2);

        account1.transferTo(account2,11000);

        System.out.println(account1);
        System.out.println(account2);
    }
}
