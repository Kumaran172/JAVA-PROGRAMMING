//8 Basic Operations Write a Java Program to print the last digit of a given number N.

import java.util.Scanner;
public class S1Q8_print_last_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int LastDigit = num%10;

        System.out.println("Last Digit of the Entered Number is : " + LastDigit);
    }
}
