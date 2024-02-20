package com.javalearnings.oops.calculatorapplication;

public interface ICalculator {

    public CalculatorDTO multiply(CalculatorDTO calculatorDTO);
    public CalculatorDTO divide(CalculatorDTO calculatorDTO);
    public CalculatorDTO addition(CalculatorDTO calculatorDTO);
    public CalculatorDTO subtraction(CalculatorDTO calculatorDTO);
    public void display(CalculatorDTO calculatorDTO);
}
