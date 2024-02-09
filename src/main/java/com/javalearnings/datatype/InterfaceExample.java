package com.javalearnings.datatype;

interface CalcInterface {
    void multiply();
    void divide();
    void addition();
    void subtraction();


}
public class InterfaceExample implements CalcInterface{
    int a = 28;
    int b = 13;
    int c;
    int d;

    public void multiply(){
        int c = a*b;
        System.out.println("Multiplication of number is:"+c );

    }

    @Override
    public void divide() {
        int c = a/b;
        System.out.println("Division of number is:" +c);

    }

    @Override
    public void addition() {
        int c = a+b;
        System.out.println("Addition of number is:"+c);
    }

    @Override
    public void subtraction() {
        int d = a-b;
        System.out.println("Subtraction of number is:"+d);
    }
    public static void main(String[]args){
        InterfaceExample obj= new InterfaceExample();
        obj.multiply();
        obj.divide();
        obj.addition();
        obj.subtraction();
    }
}
