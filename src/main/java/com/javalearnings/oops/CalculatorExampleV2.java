package com.javalearnings.oops;

public class CalculatorExampleV2 implements CalcInterfaceV1{
    private final int a;
    private final int b;
    private int result;

    private String operation;

    public CalculatorExampleV2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int multiply() {
        this.operation = "Multiply";

        result = a *b;
        return result;
    }



    @Override
    public int divide() {
        this.operation =  "divide";
        result = a /b;
        return result;
    }

    @Override
    public int addition() {
        this.operation =  "addition";
        result = a +b;
        return result;

    }

    @Override
    public int subtraction() {
        this.operation = "subtraction";
        result = a - b;
        return result;
    }

    @Override
    public void display() {
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("Operation :"+operation);
        System.out.println("Result :"+result);
        System.out.println();



    }


    public static void main(String[] args){

        CalculatorExampleV2 calculatorExample = new CalculatorExampleV2(5,6);

        calculatorExample.addition();
        calculatorExample.display();

//        calculatorExample.divide();
//        calculatorExample.display();
//
//        calculatorExample.subtraction();
//        calculatorExample.display();
//
//        calculatorExample.multiply();
//        calculatorExample.display();


        CalculatorExampleV2 calculatorExampleMultiply = new CalculatorExampleV2(54,60);

        calculatorExampleMultiply.multiply();
        calculatorExampleMultiply.display();


    }
}
