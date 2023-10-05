package com.Programs;

public class FrequencyOfElements {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 2, 3, 4, 5, 5};
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int frequency = 0;

            // Check the frequency of the current element in the rest of the array.
            for (int j = 0; j < array.length; j++) {
                if (element == array[j]) {
                    frequency++;
                }
            }
            System.out.println("Element " + element + " appears " + frequency + " times.");


        }
    }
}
