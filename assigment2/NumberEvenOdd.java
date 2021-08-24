package com.assigment2;

import java.util.Scanner;

public class NumberEvenOdd {
    public static void main(String[] args) {
        System.out.println("NUmber: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }

        else{
            System.out.println("odd");
        }

    }
}
