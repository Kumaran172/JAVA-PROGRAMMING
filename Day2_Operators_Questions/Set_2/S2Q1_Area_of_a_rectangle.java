//1 Formula Based Write a Java Program to find the area of a rectangle.

import java.util.Scanner;

public class S2Q1_Area_of_a_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the Rectangle : ");
        int b = sc.nextInt();

        System.out.printf("The Area of the Rectangle is : %d ",(l*b));


    }
}
