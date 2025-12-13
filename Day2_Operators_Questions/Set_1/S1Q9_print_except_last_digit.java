//9 Basic Operations Write a Java Program to print all digits except the last digit of a given number N.

import java.util.Scanner;
public class S1Q9_print_except_last_digit {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int rmLastDigit = num/10;

        System.out.println("Entered Number Except Last Digit : " + rmLastDigit);
    }
    
}
