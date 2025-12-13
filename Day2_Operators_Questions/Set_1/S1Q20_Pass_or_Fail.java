//20 Basic Operations Write a Java Program to print pass/fail result based on marks.
import java.util.Scanner;
public class S1Q20_Pass_or_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Mark to get the Result : ");
        int mark = sc.nextInt();

        System.out.println((mark >= 50)?"PASS":"FAIL");
        
    }
}
