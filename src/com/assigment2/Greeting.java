package com.assigment2;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter a name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, "+name);

    }
}
