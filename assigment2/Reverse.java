package com.assigment2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int ans = 0;
        int rem = 0;
        int a= 234;
        while(a>0){
            rem=a%10;
            ans = (ans*10)+rem;
            a=a/10;

        }
        System.out.println(ans);
    }
}
