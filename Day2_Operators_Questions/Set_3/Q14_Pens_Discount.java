package Set_3;

import java.util.Scanner;

public class Q14_Pens_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Pen Price : ");
        int penprice = sc.nextInt();
        System.out.print("Enter total No. of pen : ");
        int Totpen = sc.nextInt();

        int dispen = (Totpen/5) * 2 ;
        Totpen -= dispen;

        int FinalAmt = Totpen * penprice;

        System.out.println("Final Price with discount is : " + FinalAmt);
    }
}
