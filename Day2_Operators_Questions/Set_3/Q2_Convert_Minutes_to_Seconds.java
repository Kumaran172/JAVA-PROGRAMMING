//package Set_3;

import java.util.Scanner;

public class Q2_Convert_Minutes_to_Seconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter minutes : ");
        int min = sc.nextInt();

        int sec = (min * 60 );

        System.out.println("Entered minutes in seconds : " + sec);

    }
}
