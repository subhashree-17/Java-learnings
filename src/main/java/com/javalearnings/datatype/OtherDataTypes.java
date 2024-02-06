package com.javalearnings.datatype;

public class OtherDataTypes {
    private byte variables;
    private short values;
    private float numbers;
    private double decimals;

    public OtherDataTypes(byte variables, short values, float numbers, double decimals) {

        this.variables= variables;
        this.values = values;
        this.numbers = numbers;
        this.decimals= decimals;

    }

    public static void main(String[] args) {
        byte variables = 127;
        short values = 10;
        float numbers = 2.8f;
        double decimals = 28.5;
        OtherDataTypes otherDataTypes = new OtherDataTypes(variables, values, numbers, decimals);
        otherDataTypes.print();
    }

    public void print(){

    System.out.println("My variables:"+ variables);
    System.out.println("My values:"+ values);
    System.out.println("My numbers:"+ numbers);
    System.out.println("My decimals:"+ decimals);

    }
}
