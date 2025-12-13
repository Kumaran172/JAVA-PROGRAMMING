//
import java.util.Scanner;

//package Set_3;

public class Q1_Price_After_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Orginal price : ");
        int ogprice = sc.nextInt();
        System.out.print("Enter discount percentage : ");
        int disPer = sc.nextInt();

        int disAmt = (disPer * ogprice)/100;
        int finalAmt = ogprice - disAmt;

        System.out.println("The Price after Discount is : " + finalAmt);

    }
}
