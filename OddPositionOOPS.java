package com.Programs;

import java.util.Scanner;

class OddPosition {
    public int arr[];

    public OddPosition() {
        this.arr = arr;
    }

    Scanner sc = new Scanner(System.in);

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


    public void oddPosition() {
        int i = 1;
        for (i = 1; i < arr.length; i = i + 2) {
            System.out.println("Elements at odd positions ");
            System.out.println(arr[i]);
        }

    }

}

public class OddPositionOOPS {
    public static void main(String[] args) {
        OddPosition obj = new OddPosition();
        obj.inputArrayElements();
        obj.oddPosition();

    }
}
