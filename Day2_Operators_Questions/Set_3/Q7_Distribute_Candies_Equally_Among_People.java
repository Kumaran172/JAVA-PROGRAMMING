package Set_3;

import java.util.Scanner;

public class Q7_Distribute_Candies_Equally_Among_People {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Total Candy : ");
        int TotCandy = sc.nextInt();
        System.out.print("Enter total no. of people : ");
        int person = sc.nextInt();

        int split_Candy = TotCandy/person;
        int rem = TotCandy % person;

        System.out.println("Candy per head : " + split_Candy);
        System.out.println("Remaining Candy : " + rem);

    }
}
