package com.Programs;

public class ArrayDeletion {
    public static void main(String[] args) {
        System.out.println("Enter Size of Array");
        int size = UtilityClass.scannerInt();

        int arr[] = new int[size];

        System.out.println("Enter Elemets ");
        for (int i = 0; i < size; i++) {
            arr[i] = UtilityClass.scannerInt();
        }
        System.out.println("Enter Deletion Location");
        int loc = UtilityClass.scannerInt();
        for (int i = loc; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Updated Array");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
