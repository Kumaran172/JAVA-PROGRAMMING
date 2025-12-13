//
import java.util.Scanner;

public class S2Q9_perimeter_of_a_rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();

        System.out.println("Primeter of rectangle is : " + (2 * (length+breath)));
    }
}