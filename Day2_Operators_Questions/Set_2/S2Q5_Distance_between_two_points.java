//package Set_2;
//5 Formula Based Write a Java Program to find the distance between two points.

import java.util.Scanner;

public class S2Q5_Distance_between_two_points {
    public static void main(String[] args) {
          double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting point x1, y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter the ending point x2, y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();


        Double Dbp = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );

        System.out.println("The Didtance between the two points is : " + Dbp);
        
    }
    
}
