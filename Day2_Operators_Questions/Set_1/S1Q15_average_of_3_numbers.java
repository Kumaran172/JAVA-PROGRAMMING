
import java.util.Scanner;

//15 Basic Operations Write a Java Program to calculate the average of three numbers.

public class S1Q15_average_of_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter Second Number : ");
        float num2 = sc.nextFloat();
        System.out.print("Enter Third Number : ");
        float num3 = sc.nextFloat();

        float avg = (num1+num2+num3)/3;

        System.out.println("The average of given number is : " + avg);


    }
}
