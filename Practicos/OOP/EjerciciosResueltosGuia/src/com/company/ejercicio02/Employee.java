package com.company.ejercicio02;

import java.util.StringTokenizer;

/**
 * Created by arcangel on 16/11/16.
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName+" "+lastName;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent){
        return Math.round(salary+(salary*percent/100));
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Employee[");
        sb.append("id="+id+",name="+this.getName()+",salary="+salary+"]");
        return sb.toString();
    }
}
