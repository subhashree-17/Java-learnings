package com.javalearnings.datatype;

import java.util.Arrays;

public class PrimitiveDataTypes {
    private final char[] name;
    private final int age;
    private final long phoneNumber;
    private final boolean eligibility;

    public PrimitiveDataTypes(char[] name, int age, long contact, boolean eligiblity) {
        this.name = name;
        this.age = age;
        this.phoneNumber = contact;
        this.eligibility = eligiblity;
    }


    public static void main(String[] args) {
//        char Myname =("Subhashree");
//        int Myage = 21;
//        long Mycontact  = 8608992461;
//        boolean eligibility = 18

        char[] name = {'S','U','B','A'};
        int age = 21;
        long contact = 8608992461L;
        boolean eligiblity = false;

        PrimitiveDataTypes primitiveDataTypes = new PrimitiveDataTypes(name,age,contact,eligiblity);
        primitiveDataTypes.print();
    }

    private void print() {

        System.out.print("My Name "+ Arrays.toString(name));
        System.out.print("My age " +age);
        System.out.print("My contact "+ phoneNumber);
        System.out.print("eligibility "+ eligibility);

    }
}