package com.assigment2;

import java.util.Scanner;

public class Ptr {
    public static void main(String[] args) {
        System.out.println("Enter a principal: ");
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        System.out.println("Enter a rate ");
        float t = sc.nextFloat();
        System.out.println("Enter a time: ");
        float r = sc.nextFloat();
        System.out.println("Simple interest: "+(p*t*r)/100);
    }

}
