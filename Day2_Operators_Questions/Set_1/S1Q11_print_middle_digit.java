import java.util.Scanner;

public class S1Q11_print_middle_digit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit Number : ");
        int num = sc.nextInt();

        num /= 10 ;
        int middle_digit = num%10;



        System.out.print("Middle Digit in given Number is : " + middle_digit);
    }
}