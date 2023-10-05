package com.Programs;

import java.util.Scanner;

class SecondLargest {
    int arr[];

    public SecondLargest() {
        this.arr = arr;
    }


    public void inputArrayElements() {
        System.out.println("Enter Array size");
        int size = UtilityClass.scannerInt();
        this.arr = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = UtilityClass.scannerInt();
        }

    }

    public void findSecondLargest() {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Second Largest " + arr[arr.length - 2]);
    }


}

public class SecondLargestOOPS {
    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        obj.inputArrayElements();
        obj.findSecondLargest();
    }
}
