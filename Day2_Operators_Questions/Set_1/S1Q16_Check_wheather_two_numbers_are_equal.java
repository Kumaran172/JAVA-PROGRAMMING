//16 Basic Operations Write a Java Program to check whether two numbers are equal (true/false).

import java.util.Scanner;
public class S1Q16_Check_wheather_two_numbers_are_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        boolean res = (num1 == num2);
       
        System.out.println("Check wheather the given number are equal : " + res);
        //System.out.println("Check wheather the given number are equal : " + (num1 == num2));

    }
}
