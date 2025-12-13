
import java.util.Scanner;

//package Set_3;

public class Q8_Calculate_Total_Cakes_Made {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Total cake made per day : ");
        int TotCake = sc.nextInt();
        System.out.print("Enter total no. of Days : ");
        int TotDays = sc.nextInt();

        int TotNoCake = TotCake * TotDays;

        System.out.println("Total cakes made : " + TotNoCake);
    }
}
