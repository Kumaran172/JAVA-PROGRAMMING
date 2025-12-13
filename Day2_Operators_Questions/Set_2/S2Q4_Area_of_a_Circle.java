//4 Formula Based Write a Java Program to find the area of a circle.
import java.util.Scanner;

public class S2Q4_Area_of_a_Circle{
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle : ");
        double rad = sc.nextInt();
       
        double area_of_Circle = pi*(rad*rad);

        System.out.printf("The Area of the Circle is : %f ", area_of_Circle);
    }
}