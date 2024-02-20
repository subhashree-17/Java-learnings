package com.javalearnings.oops.calculatorapplication;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class CalculatorDTO {
    private Integer id;
    private Long operand1;

    private Long operand2;

    private String operation;

    private Long result;


    public CalculatorDTO(Long operand1, Long operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.id =  ThreadLocalRandom.current().nextInt();
    }

    public Integer getId() {
        return id;
    }

    public Long getOperand1() {
        return operand1;
    }

    public Long getOperand2() {
        return operand2;
    }

    public String getOperations() {
        return operation;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorDTO that = (CalculatorDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
