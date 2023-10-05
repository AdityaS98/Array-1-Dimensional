package com.Programs;

import java.util.Scanner;

class SortingAsc {
    public int arr[];

    public SortingAsc() {
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

    public void AscendingSort() {
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
        System.out.println("Sorted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class SortingArray {
    public static void main(String[] args) {
        SortingAsc obj = new SortingAsc();
        obj.inputArrayElements();
        obj.AscendingSort();
    }
}


