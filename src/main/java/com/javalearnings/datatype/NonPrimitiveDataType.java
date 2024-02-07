package com.javalearnings.datatype;

import java.util.Arrays;

public class NonPrimitiveDataType {
    private String[] name;
    private int[] marks;

    public NonPrimitiveDataType(String[]name,int[]marks) {
        this.name = name;
        this.marks = marks;
    }

        public static void main(String[]args) {
            String[] name = {"subhashree"};
            int[] marks = {84,92,94,97,100};

            NonPrimitiveDataType NonPrimitiveDataType = new NonPrimitiveDataType(name, marks);
            NonPrimitiveDataType.print();
        }
        private void print() {
            System.out.println("My name:" + Arrays.toString(name));
            System.out.println("My marks:" + Arrays.toString(marks));
        }





}
