
import java.util.Scanner;

//17 Basic Operations Write a Java Program to check if a number is power of 2 using bitwise AND.

public class S1Q17_power_of_two_using_bitwise_and {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check wheather it's Power of two : ");
        int num = sc.nextInt();
        String res = (num>0 && (num & num-1) == 0)?"It's Power of two" : " It's not Power of two";

        System.out.println(res);


    }
}
