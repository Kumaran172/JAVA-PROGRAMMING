package Set_3;

import java.util.Scanner;

public class Q11_calculate_selling_price {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter Profit : ");
        int Profit = sc.nextInt();

        int Sp = cp + Profit;

        System.out.println("Selling Price : " + Sp);
    }
}
