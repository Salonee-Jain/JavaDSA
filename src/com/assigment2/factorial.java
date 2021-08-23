package com.assigment2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter no: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i=1;
        int fact = 1;
        while(i<=a){
            fact*=i;
            i++;
        }
        System.out.println("Factorial: "+ fact);
    }
}
