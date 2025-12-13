//package Set_2;
//6 Formula Based Write a Java Program to convert Fahrenheit to Celsius.

import java.util.Scanner;

public class S2Q6_Fahrenheit_to_Celsius {
     public static void main(String[] args) {
          double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit point : ");
        float Fahrenheit = sc.nextFloat();

        float Celsius = (Fahrenheit - 32) * 5/9;

        System.out.println("The Current Celsius is : " + Celsius + "C");
     }
}
