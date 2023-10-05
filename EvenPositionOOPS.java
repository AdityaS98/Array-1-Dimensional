package com.Programs;

import java.util.Scanner;

class EvenPositions {
    public int arr[];

    public EvenPositions() {
        this.arr = arr;
    }


    public void inputArrayElements() {
        System.out.println("Enter Array Size");
        int size = UtilityClass.scannerInt();
        this.arr = new int[size];
        System.out.println("Enter Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = UtilityClass.scannerInt();
        }
        // System.out.println("Array elements are: ");
        //for (int i = 0; i < arr.length; i++) {
        //  System.out.println(arr[i]);
    }


    public void evenPosition() {
        int i = 0;
        for (i = 0; i < arr.length; i = i + 2) {
            System.out.println("Elements at even positions ");
            System.out.println(arr[i]);
        }

    }
}

public class EvenPositionOOPS {
    public static void main(String[] args) {
        EvenPositions obj = new EvenPositions();
        obj.inputArrayElements();
        obj.evenPosition();
    }
}
