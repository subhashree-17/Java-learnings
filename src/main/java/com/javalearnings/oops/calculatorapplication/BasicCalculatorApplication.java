package com.javalearnings.oops.calculatorapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicCalculatorApplication {

    private static ArrayList<CalculatorDTO> calculatorDTOS = new ArrayList<>();
    static BasicCalculator basicCalculator = new BasicCalculator();

   static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        BasicCalculatorApplication basicCalculatorApplication = new BasicCalculatorApplication();
        while(true){
            System.out.println(" Enter your option ");
            int option = sc.nextInt();

        switch (option) {

            case 1:
                System.out.println(" Enter your operation like ADD|SUB|MUL|DIV ::  ");

                CalculatorDTO calculatorDTO = basicCalculatorApplication.extracted();
                calculatorDTOS.add(calculatorDTO);
                basicCalculator.display(calculatorDTO);
                break;
            case 2:
                for (CalculatorDTO dto : calculatorDTOS) {
                    basicCalculator.display(dto);
                }
                break;
            default:

    }
}



    }

    private  CalculatorDTO extracted() {
        sc.nextLine();
        String operation = sc.nextLine();

        System.out.println(" Enter your operand 1");
        Long a = sc.nextLong();
        System.out.println(" Enter your operand 2");
        Long b = sc.nextLong();

        System.out.println(" operand 1 ::  "+a);
        System.out.println(" operand 2 ::  "+b);

        CalculatorDTO calculatorDTO = new CalculatorDTO(a,b,operation);


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

 return calculatorDTO;
    }
}
