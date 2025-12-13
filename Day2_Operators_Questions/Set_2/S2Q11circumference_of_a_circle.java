//
import java.util.Scanner;

public class S2Q11circumference_of_a_circle{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat(); 
        final double pi = 3.14;

        System.out.println("circumference of a circle is : " + (2 * pi * rad));
    }
}