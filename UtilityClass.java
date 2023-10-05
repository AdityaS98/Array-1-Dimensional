package com.Programs;

import java.util.Scanner;

public class UtilityClass {

    public static Scanner sc = new Scanner(System.in);

    public static String scannerString() {


        String str = sc.nextLine();
        return str;

    }

    public static int scannerInt() {


        int num = sc.nextInt();
        return num;
    }

    public static int scannerChar() {


        char ch = sc.next().charAt(0);
        return ch;


    }
}


