package com.stackroute.languageBasic;

import java.util.Scanner;

/*
    Example which contains Variables, Operators, Expressions, Statements, Blocks and Control Flow Statements.
    Two numbers are taken as input from user and its summation is calculated.
    The sum of the numbers is then checked whether it is even or odd
 */
public class EvenOdd {
    public static void main(String args[]) {
//        declaration of variables
        int number1, number2, sum;
//        statement
        System.out.println("Enter first number: ");
//        input 1 from user
        Scanner input1 = new Scanner(System.in);
//        assigning the input value to number1
        number1 = input1.nextInt();
//        statement
        System.out.println("Enter second number: ");
//        input 2 from user
        Scanner input2 = new Scanner(System.in);
//        assigning the input value to number2
        number2 = input2.nextInt();
//        use of operator to find sum of numbers
        sum = number1 + number2;
//        control flow statement(decision making statement)
        if (sum % 2 == 0) {
            System.out.println("Summation of both the numbers is " + sum + " and it is even");
        } else System.out.println("Summation of both the numbers is " + sum + " and it is odd");
    }
}
