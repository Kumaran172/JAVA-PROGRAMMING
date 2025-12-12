import java.util.*;
public class dob{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your birthday date : ");
        int date = sc.nextInt();
        System.out.print("Enter your birthday month : ");
        int month = sc.nextInt();
        System.out.print("Enter your birthday year : ");
        int year = sc.nextInt();
        
        System.out.print("Date Of Birth : " + date + "/" + month + "/" + year);
    }
}