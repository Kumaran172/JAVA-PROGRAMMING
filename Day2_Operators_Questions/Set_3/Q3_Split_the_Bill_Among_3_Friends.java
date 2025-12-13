package Set_3;

import java.util.Scanner;

public class Q3_Split_the_Bill_Among_3_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Total Bill amount : ");
        int BillAmount = sc.nextInt();
        //System.out.print("Enter total no. of people : ");
        //int person = sc.nextInt();

        //int split_Price = BillAmount/person;
        int split_Price = BillAmount/3;

        System.out.println("Price per head : " + split_Price);

    }
    
}
