package Set_3;

import java.util.Scanner;

public class Q15_Currency_Notes_from_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Total Amount in Atm : ");
        int totAmount = sc.nextInt();
    
        int note2000 = totAmount / 2000;
        totAmount = totAmount % 2000;

        int note500 = totAmount / 500;
        totAmount = totAmount % 500;

        int note200 = totAmount / 200;
        totAmount = totAmount % 200;

        int note100 = totAmount / 100;
        totAmount = totAmount % 100;

        System.out.println("No. of 2000 notes : " + note2000);
        System.out.println("No. of 500 notes : " + note500);
        System.out.println("No. of 200 notes : " + note200);
        System.out.println("No. of 100 notes : " + note100);
        
    }
}
