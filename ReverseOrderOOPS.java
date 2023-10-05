package com.Programs;



class ReverseOrder {
    public int arr[];

    public ReverseOrder() {
        this.arr = arr;
    }



    public void inputElements() {
        System.out.println("Enter Array Elements");
        int n = UtilityClass.scannerInt();
        this.arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            UtilityClass.scannerInt();
        }
    }

    public void reverseElements() {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class ReverseOrderOOPS {
    public static void main(String[] args) {
        ReverseOrder obj = new ReverseOrder();
        obj.inputElements();
        obj.reverseElements();
    }
}
