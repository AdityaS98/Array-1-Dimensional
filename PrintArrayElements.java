package com.Programs;

import java.util.Scanner;

class ArrayPrint {

    int[] arr;

    public ArrayPrint() {
        this.arr = arr;
    }

    Scanner sc = new Scanner(System.in);


    public void inputArrayElemnts() {
        System.out.println("Enter array Size");
        int n;
        n = sc.nextInt();
        this.arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }


    }

    public void displayArrayElemnts() {
        System.out.println("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}


public class PrintArrayElements {
    public static void main(String[] args) {

        ArrayPrint obj = new ArrayPrint();
        obj.inputArrayElemnts();
        obj.displayArrayElemnts();


    }
}


