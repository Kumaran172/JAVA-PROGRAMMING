//5 Basic Operations Write a Java Program to print remainder of two numbers.

import java.util.Scanner;

public class S1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("Remaiinder of two Numbers is : " + (a%b));
    }
    
}
