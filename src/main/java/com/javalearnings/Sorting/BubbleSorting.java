package com.javalearnings.Sorting;

public class BubbleSorting {
    public static void main(String[] args){
        int[] arr = {9,12,13,2,8,92};
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.print(arr);
        bubbleSorting.sort(arr);
        bubbleSorting.print(arr);





    }

    private void print(int[] arr) {

        for (int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    private void sort(int[] arr) {
        for (int i = 0; i< arr.length;i++){
            for (int  j =i+1;j< arr.length;j++){


                if (arr[i] < arr[j]){
//                    System.out.print(arr[i]+" ");
//                    System.out.print(arr[j]+" ");

                 int temp;

               //  a = arr[i];
               //  b = arr[j];

                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;


                }

            }
//            System.out.println();
        }
    }
}
