package com.Programs;

import java.util.Scanner;

class Sorting {
    int arr[];

    public Sorting() {
        this.arr = arr;
    }

    Scanner sc = new Scanner(System.in);

    public void arrayInput() {
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        this.arr = new int[size];
        System.out.println("Enter elements of array");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }


    }

    public void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public void selectionSort() {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j <= arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
    }


    public void printInfo() {

        System.out.println(" Sorted Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}


public class SortingOOPS {
    public static void main(String[] args) {
        Sorting obj = new Sorting();
        obj.arrayInput();
        //obj.bubbleSort();
        obj.printInfo();
        obj.selectionSort();

    }
}
