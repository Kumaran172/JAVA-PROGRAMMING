//package Set_3;

import java.util.Scanner;

public class Q9_Calculate_Simple_Interest {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Principal Amount : ");
        int p = sc.nextInt();
        System.out.print("Enter Rate of Intrest : ");
        int r = sc.nextInt();
        System.out.print("Enter total time : ");
        int t = sc.nextInt();

        //int split_Price = BillAmount/person;
        int SimpleIntrest = (p * r * t)/100;

        System.out.println("Simple Intrest : " + SimpleIntrest);
    }
}
