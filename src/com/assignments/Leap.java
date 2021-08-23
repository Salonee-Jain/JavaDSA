package com.assignments;
import java.util.Scanner;

public class Leap {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap");
                }
            }
            else{
                System.out.println("Leap");
            }
        }
        else{
            System.out.println("not a Leap");
        }

    }
}
