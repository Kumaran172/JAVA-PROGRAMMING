package Set_2;

import java.util.Scanner;

public class S2Q15_cylinder {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        double pi = 3.14;

        System.out.println("Surface area of cylinder is : " + (2*pi*radius*(height + radius)));
        System.out.println("Volume of cylinder is : " + (pi*Math.pow(radius,2)*height));
    }
}
