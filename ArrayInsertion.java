package com.Programs;

import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int str[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the location where element needs to be inserted ");
        int nsize = sc.nextInt();
        System.out.println("Enter the new value ");
        int elem = sc.nextInt();
        for (int i = 0; i < str.length; i++) {
            if (i < nsize) {
                str[i] = arr[i];
            } else if (i == nsize) {
                str[i] = elem;
            } else {
                str[i] = arr[i];
            }
        }


        System.out.println("Updated array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(str[i] + "");
        }
    }
}
