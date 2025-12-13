//
import java.util.Scanner;

public class S2Q12_cube{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        System.out.println("surface area of cube is : " + (6 * Math.pow(side , 2)));
        System.out.println("Volume of cube is : " + (Math.pow(side,3)));
        System.out.println("Perimeter of cube is : " + (12 * side));
    }
} 