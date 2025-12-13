//12 Basic Operations Write a Java Program to print the absolute value of a number.

import java.util.Scanner;
public class S1Q12_absolute_value {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int abs = (num < 0)?num*-1:num;

        System.out.println("Absolute Value Of the Given Number is : " + abs);
    }
    
}
