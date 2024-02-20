package com.javalearnings.oops.calculatorapplication;

import java.util.Scanner;

public class BasicCalculatorApplication {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your operation like ADD|SUB|MUL|DIV ::  ");

        String operation = sc.nextLine();
        System.out.println(" Enter your operand 1");
        Long a = sc.nextLong();
        System.out.println(" Enter your operand 2");
        Long b = sc.nextLong();

        System.out.println(" operand 1 ::  "+a);
        System.out.println(" operand 2 ::  "+b);

        CalculatorDTO calculatorDTO = new CalculatorDTO(a,b,operation);

        BasicCalculator basicCalculator = new BasicCalculator();

        switch(operation.toUpperCase()){

            case "MUL":
                basicCalculator.multiply(calculatorDTO);
                break;
            case "ADD":
                basicCalculator.addition(calculatorDTO);
                break;
            case "DIV":
                if(calculatorDTO.getOperand2() == 0){
                    System.out.println(" 2nd number should not be zero  ");
                    break;
                }
                basicCalculator.divide(calculatorDTO);
                break;
            case "SUB":
                basicCalculator.subtraction(calculatorDTO);
                break;
            default:
            System.out.println(" not feasible to perform this operation  "+operation.toLowerCase());
        }

        basicCalculator.display(calculatorDTO);

    }
}
