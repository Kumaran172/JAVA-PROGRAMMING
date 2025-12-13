//package Set_3;

import java.util.Scanner;

public class Q6_Convert_Bytes_to_bits {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Bytes : ");
        int byte_val = sc.nextInt();

        int bit_val = (byte_val * 8);

        System.out.println("Entered Bytes in bit : " + bit_val);
        
    }
}
