package com.Programs;

import java.util.Scanner;

class Reverse {
    String str[];

    public Reverse() {
        this.str = str;
    }

    Scanner sc = new Scanner(System.in);

    public String inputElements() {
        System.out.println("Enter Array Elements");
        int n = sc.nextInt();
        this.str = new String[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            str[i] = sc.next();
        }
        return null;
    }

    public void reverseElements() {
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.println(str[i]);


        }

    }
}

public class ReverseString {
    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.inputElements();
        obj.reverseElements();
    }

}

