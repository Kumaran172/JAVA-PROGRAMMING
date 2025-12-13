// package Day2_Operators_Questions;
//1 Basic Operations Write a Java Program to print sum of two numbers.

import java.util.Scanner;
public class S1Q1 {
    public static void main(String[] args) {
        //int a = 10 , b = 20;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First numbers : ");
        int a = sc.nextInt();
        System.out.print("Enter Second numbers : ");
        int b = sc.nextInt();

        System.out.println("Sum of two numbers : " + (a+b));

    }
}
