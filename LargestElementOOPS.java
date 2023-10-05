package com.Programs;

import java.util.Scanner;

class LargestElements {


    int arr[];

    public LargestElements() {
        this.arr = arr;
    }



    public void inputArrayElements() {
        System.out.println("Enter array Size");
        int n;
        n = UtilityClass.scannerInt();
        this.arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            arr[i] = UtilityClass.scannerInt();
        }


    }

    public void largestElement() {
        int max;
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element " + max);
    }
}

public class LargestElementOOPS {
    public static void main(String[] args) {
        LargestElements obj = new LargestElements();
        obj.inputArrayElements();
        obj.largestElement();

    }
}
