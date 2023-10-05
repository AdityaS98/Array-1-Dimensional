package com.Programs;

import java.util.Scanner;

class SmallestElements {

    public int arr[];

    public SmallestElements() {
        this.arr = arr;
    }



    public void inputArrayElements() {
        System.out.println("Enter Array Elements");
        int n = UtilityClass.scannerInt();
        this.arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            UtilityClass.scannerInt();
        }

    }

    public void smallestElement() {

        int min = 0;
        min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest Element " + min);

    }
}

public class SmallestElemetOOPS {
    public static void main(String[] args) {
        SmallestElements obj = new SmallestElements();
        obj.inputArrayElements();
        obj.smallestElement();

    }
}
