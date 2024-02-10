package com.javalearnings.oops;


public class CalculatorExampleV1 implements CalcInterface {
    private int a;
    private int b;
    private int result;

    private String operation;



    @Override
    public int multiply(int a, int b) {
        setValues(a, b, "Multiply");
        result = a *b;
        return result;
    }

    private void setValues(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    @Override
    public int divide(int a, int b) {
        setValues(a, b, "divide");
        result = a /b;
        return result;
    }

    @Override
    public int addition(int a, int b) {
        setValues(a, b, "addition");
        result = a +b;
        return result;

    }

    @Override
    public int subtraction(int a, int b) {
        setValues(a, b, "subtraction");
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

        CalculatorExampleV1 calculatorExample = new CalculatorExampleV1();

        calculatorExample.addition(10,6);
        calculatorExample.display();

        calculatorExample.divide(22,4);
        calculatorExample.display();

        calculatorExample.subtraction(45,35);
        calculatorExample.display();

        calculatorExample.multiply(56,90);
        calculatorExample.display();


    }


}
