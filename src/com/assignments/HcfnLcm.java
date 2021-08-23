package com.assignments;

import java.util.Scanner;

public class HcfnLcm {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min;
        int max;
        if (a>b){
             min= b;
             max=a;
        }
        else{
             min=a;
             max=b;
        }
        int i=1;
        int hcf=1;
        while(i<=min){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
            i++;
        }

        while(true){
            if(max%a==0 && max%b==0){
                break;
            }

            max=max+1;


        }
        System.out.println("LCM "+max);
        System.out.println("HCF "+hcf);


    }
}
