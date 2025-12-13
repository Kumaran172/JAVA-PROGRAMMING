package Set_2;

import java.util.Scanner;

public class S2Q14_sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pi = 3.14;

        System.out.println("surface area of cube is : " + (4*pi*Math.pow(radius,2)));
        System.out.println("Volume of cube is : " + ((4/3)*pi*Math.pow(radius,3)));
    }
}
