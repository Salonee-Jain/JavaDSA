package com.assigment2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no: ");
        int a= sc.nextInt();
        for(int i=2; i<=a; i++){
            if(a%i==0){
                System.out.println("factor of "+a+" is "+i);
            }
        }
    }
}
