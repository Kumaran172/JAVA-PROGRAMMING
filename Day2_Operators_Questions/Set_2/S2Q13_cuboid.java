//package Set_2;

import java.util.Scanner;

public class S2Q13_cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("surface area of cuboid is : " + (2 * (length*breath + breath*height + height*length)));
        System.out.println("Volume of cuboid is : " + (length*breath*height));
    }
}
