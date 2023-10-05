package com.Programs;

import java.util.Scanner;

class Frequency {
    public int[] arr;

    public Frequency() {
        this.arr = arr;
    }

    Scanner sc = new Scanner(System.in);

    public void inputArrayElements() {
        System.out.println("Enter array Size");
        int n;
        n = sc.nextInt();
        this.arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }


    }

    public void frequencyOfElements() {
        int i = 0;
        int key = -1;
        int element = 0;
        int frequency = 0;
        for (i = 0; i < arr.length; i++) {
            element = arr[i];
            frequency = 0;

            // Check the frequency of the current element in the rest of the array.
            for (int j = i + 1; j < arr.length; j++) {
                if (element == arr[j]) {
                    frequency++;
                    arr[j] = key;
                }
            }
            if (arr[i] != key) {
                arr[i] = frequency;
            }

            // Print the frequency of the current element.
            System.out.println("Element " + element + " appears " + frequency + " times.");

        }


    }
}

public class FrequencyOfElementsOops {
    public static void main(String[] args) {
        Frequency obj = new Frequency();
        obj.inputArrayElements();
        obj.frequencyOfElements();
    }
}

