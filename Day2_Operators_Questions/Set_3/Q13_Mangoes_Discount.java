//package Set_3;

import java.util.Scanner;

public class Q13_Mangoes_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Mango Price : ");
        int Mp = sc.nextInt();
        System.out.print("Enter total No. of Mango : ");
        int TotMango = sc.nextInt();

        int disMango = TotMango/4;
        TotMango -= disMango;

        int FinalAmt = TotMango * Mp;

        System.out.println("Final Price with discount is : " + FinalAmt);
    }
}
