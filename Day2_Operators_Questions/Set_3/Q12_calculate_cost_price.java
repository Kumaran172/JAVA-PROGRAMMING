//package Set_3;

import java.util.Scanner;

public class Q12_calculate_cost_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Selling Price : ");
        int Sp = sc.nextInt();
        System.out.print("Enter Loss : ");
        int Loss = sc.nextInt();

        int cp = Sp + Loss;

        System.out.println("Cost Price : " + cp);
    }
}
