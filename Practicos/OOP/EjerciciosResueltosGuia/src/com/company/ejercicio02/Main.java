package com.company.ejercicio02;

/**
 * Created by arcangel on 16/11/16.
 */
public class Main {
    public static void main(String [] args){
        Employee employee1 = new Employee(1,"Arcangel Andres","Artigue",5075);
        Employee employee2 = new Employee(2,"Cacho","Nakamura",7085);
        Employee employee3 = new Employee(3,"Jorge","Sampaoli",10342);

        actions(employee1);
        actions(employee2);
        actions(employee3);


    }

    public static void actions(Employee e){
        System.out.println(e.toString());
        System.out.println("Salario Anual -> "+e.getAnnualSalary());
        System.out.println("Salario Mensual -> "+e.getSalary());
        int inc = (int)Math.round(Math.random()*100);
        System.out.println("Incremento del "+inc+"% -> "+e.raiseSalary(inc));
        System.out.println("========================================");


    }
}
