package com.Programs;


public class ArrayOperation {
    public static void main(String[] args) {

        int i = 0;

        System.out.println("Enter Size");
        int n = UtilityClass.scannerInt();

        System.out.println("Enter Array Elememts ");

        int arr[] = new int[n];
        int newarr[] = new int[n + 1];

        for (i = 0; i < arr.length; i++) {
            arr[n] = UtilityClass.scannerInt();
        }


        System.out.println("Enter the element");
        int element = UtilityClass.scannerInt();


        System.out.println("Enter the position");
        int position = UtilityClass.scannerInt();


        ;


        for (i = 0; i < newarr.length; i++) {

            if (i < position) {
                newarr[i] = arr[i];
            } else if (i == position) {

                newarr[i] = element;
            } else {
                newarr[i] = arr[i - 1];
            }
        }

        for (i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }


}




