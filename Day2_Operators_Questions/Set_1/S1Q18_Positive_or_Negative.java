//18 Basic Operations Write a Java Program to check whether a number is positive or negative.

import java.util.Scanner;
public class S1Q18_Positive_or_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check : ");
        int num = sc.nextInt();
        String res = (num>=0)?"Positive" : "Negative";

        System.out.println(res);


    }
}
