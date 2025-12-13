package Set_3;

import java.util.Scanner;

public class Q10_calculate_Salary_of_Employee {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Basic Salary : ");
        int Basic = sc.nextInt();
        System.out.print("Enter hra : ");
        int hra = sc.nextInt();
        System.out.print("Enter da : ");
        int da = sc.nextInt();
        System.out.print("Enter deduction : ");
        int deduction = sc.nextInt();

        //int split_Price = BillAmount/person;
        int Gross_Salary = Basic + hra + da ;
        int NetSalary = Gross_Salary - deduction;

        System.out.println("Net Salary : " + NetSalary);
    }
}
