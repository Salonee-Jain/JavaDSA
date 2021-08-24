package com.assigment2;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operation {

    public static void main(String[] args) {

        System.out.println("Enter you number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter you number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter you choice(+, -, *, /): ");
        String name = sc.next();
        int c=1;
        if (name == "+") {
            c=num1+num2;
        }
        else if(name == "*") {
            c=num1*num2;
        }
        else if (name == "/") {
            c=num1/num2;
        }
        else if (name == "-") {
            c=num1-num2;
        }
        else{
            System.out.println("invalid");
        }

        System.out.println("The operation is: "+c);

    }
}
