package com.Programs;

import java.util.Scanner;

class LinearSearch {
    int arr[];

    public LinearSearch() {
        this.arr = arr;
    }

    Scanner sc = new Scanner(System.in);

    public void inputElememnts() {
        System.out.println("Enter Array Elements");
        int n = sc.nextInt();
        this.arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

    }

    public void searchOperations() {
        System.out.println("Enter the value to be searched");
        int x = sc.nextInt();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at " + i);
            }
        }
    }
}

public class LinearSearchOOPS {
    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        obj.inputElememnts();
        obj.searchOperations();
    }
}
