package com.company;

import java.util.Scanner;

public class InputKeybords {
    public static void main(String[] args) {
        System.out.println("Enter Number 1:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        boolean d=sc.nextBoolean();

        System.out.println(a);
        System.out.println(d);
//        boolean d=sc.hasNextInt();
//        System.out.println(d);
    }
}
