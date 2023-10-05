package com.Programs;

import java.util.Scanner;

class DuplicateElement {
    public int arr[];

    public DuplicateElement() {
        this.arr = arr;
    }


    public void inputArrayElements() {
        System.out.println("Enter Array size");
        int size = UtilityClass.scannerInt();
        this.arr = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = UtilityClass.scannerInt();
        }

    }

    public void duplicateElements() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element found  " + arr[i]);
                }
            }
        }
    }
}

public class DuplicateElementsOOPS {
    public static void main(String[] args) {
        DuplicateElement obj = new DuplicateElement();
        obj.inputArrayElements();
        obj.duplicateElements();
    }
}
