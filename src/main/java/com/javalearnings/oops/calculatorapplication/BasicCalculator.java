package com.javalearnings.oops.calculatorapplication;

public class BasicCalculator implements ICalculator{
    @Override
    public CalculatorDTO multiply(CalculatorDTO calculatorDTO) {
        calculatorDTO.setResult(calculatorDTO.getOperand1()*calculatorDTO.getOperand2());
        return calculatorDTO;
    }

    @Override
    public CalculatorDTO divide(CalculatorDTO calculatorDTO) {
        calculatorDTO.setResult(calculatorDTO.getOperand1()/calculatorDTO.getOperand2());
        return calculatorDTO;
    }

    @Override
    public CalculatorDTO addition(CalculatorDTO calculatorDTO) {
        calculatorDTO.setResult(calculatorDTO.getOperand1()+calculatorDTO.getOperand2());
        return calculatorDTO;
    }

    @Override
    public CalculatorDTO subtraction(CalculatorDTO calculatorDTO) {
        calculatorDTO.setResult(calculatorDTO.getOperand1()-calculatorDTO.getOperand2());
        return calculatorDTO;
    }

    @Override
    public void display(CalculatorDTO calculatorDTO) {

        System.out.println(" Calculator Application");
        System.out.println("Operand 1 :"+calculatorDTO.getOperand1());
        System.out.println("Operand 2 :"+calculatorDTO.getOperand2());
        System.out.println("Operation :"+calculatorDTO.getOperations());
        System.out.println("Result :"+calculatorDTO.getResult());
        System.out.println();
    }
}
