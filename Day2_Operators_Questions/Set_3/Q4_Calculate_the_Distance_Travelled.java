//package Set_3;

import java.util.Scanner;

public class Q4_Calculate_the_Distance_Travelled {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter travel speed  : ");
        int speed = sc.nextInt();
        System.out.print("Enter total time took to travel : ");
        int time = sc.nextInt();

        //int split_Price = BillAmount/person;
        int Distace_Travelled = speed * time;

        System.out.println("Total Distance Travelled : " + Distace_Travelled + "km");
    }
}
