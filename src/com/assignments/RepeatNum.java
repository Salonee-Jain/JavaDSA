package com.assignments;

import java.util.Scanner;

public class RepeatNum {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            System.out.println("enter: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 'x') {
                System.out.println(a);
                break;
            }
            else {
                sum = sum + a;
            }


        }
        System.out.println("Sum is: "+sum);
    }


}
