//2 Basic Operations Write a Java Program to print difference of two numbers.

import java.util.Scanner;

public class S1Q2 {
    public static void main(String[] args) {
         //int a = 10 , b = 20;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First numbers : ");
        int a = sc.nextInt();
        System.out.print("Enter Second numbers : ");
        int b = sc.nextInt();
        int sub = a-b;
        // if(sub < 0){
        //     sub *= -1;
        // }

        // System.out.println("Difference of two numbers : " + (sub));
        System.out.println("Difference of two numbers : " + ((sub < 0)?sub*-1:sub));

    }
}
