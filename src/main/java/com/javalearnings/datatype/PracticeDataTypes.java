package com.javalearnings.datatype;

import javax.naming.Name;
import java.util.Arrays;

public class PracticeDataTypes {
    private final char[] name;
    private final int age;
    private final long phonenumber;
    private final boolean eligibility;

    public PracticeDataTypes(char[]name,int age, long phonenumber, boolean eligibility){
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.eligibility = eligibility;

    }
    public static void main(String[]args){
        char[] name = {'s','u','b','h','a'};
        int age = 21;
        long phonenumber = 8608992461L;
        boolean eligibilty = false;

        PracticeDataTypes PracticeDataTypes = new PracticeDataTypes(name,age,phonenumber,eligibilty);
        PracticeDataTypes.print();

    }
    private void print(){
        System.out.println("My name"+ Arrays.toString(name));
        System.out.println("My age"+ age);
        System.out.println("My contact"+ phonenumber);
        System.out.println("eligibility"+ eligibility);
    }

}






