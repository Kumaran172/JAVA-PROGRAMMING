//13 Basic Operations Write a Java Program to print the square of a number.

import java.util.Scanner;

public class S1Q13_square_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to get it's Square : ");
        int num = sc.nextInt();

        System.out.println("The squre of the given Number is : " + (num*num));

    }
}
