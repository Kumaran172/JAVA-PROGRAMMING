//10 Basic Operations Write a Java Program to print the sum of the first and last digit of a 3-digit number.

import java.util.Scanner;
public class S1Q10_Sum_of_1st_and_last_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit Number : ");
        int num = sc.nextInt();

        int firstDigit = num/100;
        int LastDigit = num%10;
        int tot = firstDigit + LastDigit;

        System.out.print("Sum of First and Last Digit is : " + tot);
    }
}
