package com.javalearnings.problems;

import java.util.*;

public class DigitCount {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        sc.close();
        DigitCount digitCount = new DigitCount();

        Integer count = digitCount.calculate(number);

        System.out.println(" number::  "+number+" count"+count);



    }

    private Integer calculate(Integer number) {
        Integer count  =0;

        while(number >0){
            int r = number % 10;
            System.out.println(" number::  "+number+" remainder:: "+r);
            number = number /10;
            System.out.println(" number::  "+number);
            count++;
        }

        return  count;
    }
}
