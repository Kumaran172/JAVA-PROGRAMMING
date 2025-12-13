//19 Basic Operations Write a Java Program to find the greatest of three numbers.
import java.util.Scanner;
public class S1Q19_greatest_of_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number one : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number two : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number three : ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.err.printf("%d is greater",num1);
        }else if (num2 > num3){
            System.err.printf("%d is greater",num2);
        }else{
            System.err.printf("%d is greater",num3);
        }
    }
}