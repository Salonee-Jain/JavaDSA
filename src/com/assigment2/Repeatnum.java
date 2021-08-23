package com.assigment2;

import java.util.Scanner;

public class Repeatnum {
    public static void main(String[] args) {
        int a=1;
        int sum=0;
        while (a!=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter no: ");
            a = sc.nextInt();
            sum+=a;

        }
        System.out.println("sum is: "+sum);

    }
}