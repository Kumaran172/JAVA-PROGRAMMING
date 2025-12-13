package Set_3;

import java.util.Scanner;

public class Q5_Convert_Kilometers_to_Meters {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter kilometer : ");
        float km = sc.nextFloat();

        float meters = (km * 1000 );

        System.out.println("Entered kilometer in meters : " + (int)meters);

    }
}
