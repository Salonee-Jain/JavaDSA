package com.assignment1;

import java.util.Scanner;

public class Mutli {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(a+"X"+i+"="+a*i);
            i++;
        }
    }
}
