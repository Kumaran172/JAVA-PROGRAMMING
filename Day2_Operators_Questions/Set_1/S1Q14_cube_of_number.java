import java.util.Scanner;

public class S1Q14_cube_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to get it's Cube : ");
        int num = sc.nextInt();

        System.out.println("The cube of the given Number is : " + (num*num*num));

    }
}