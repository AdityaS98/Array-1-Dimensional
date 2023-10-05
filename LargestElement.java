package com.Programs;

public class LargestElement {
    public static void main(String[] args) {
        int max;
        int arr[] = {1, 2, 3, 4, 7, 8, 9, 10};
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element" + max);
    }
}
