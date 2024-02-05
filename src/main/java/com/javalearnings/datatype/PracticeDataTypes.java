package com.javalearnings.datatype;

import java.util.Arrays;

public class PracticeDataTypes {
    private char[] name;
    private int age;
    private long phonenumber;
    private boolean eligibility;
    private byte number;
    private float marks;
    private double fraction;
    private short salary;



    public PracticeDataTypes(char[]name, int age, long phonenumber, boolean eligibility, byte number, float mark, double fraction, short salary){
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.eligibility = eligibility;
        this.number = this.number;
        this.marks = marks;
        this.fraction = this.fraction;
        this.salary = this.salary;

    }
    public static void main(String[]args){
        char[] name = {'s','u','b','h','a'};
        int age = 21;
        long phonenumber = 8608992461L;
        boolean eligibilty = false;
        byte number = 123;
        float mark = 45f;
        double fraction = 87/23;
        short salary = 25000;

        PracticeDataTypes PracticeDataTypes = new PracticeDataTypes(name,age,phonenumber,eligibilty,number,mark,fraction,salary);
        PracticeDataTypes.print();

    }
    private void print(){
        System.out.println("My name:"+ Arrays.toString(name));
        System.out.println("My age:"+ age);
        System.out.println("My contact:"+ phonenumber);
        System.out.println("eligibility:"+ eligibility);
        System.out.println("My number:"+ number);
        System.out.println("My mark:"+ marks);
        System.out.println("fraction:"+ fraction);
        System.out.println("My salary:"+ salary);
    }

}







