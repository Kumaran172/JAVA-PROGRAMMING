import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter your Roll No. : ");
	    String RollNumber = sc.next(); //Rollnumber somtimes consist of Letters;
	    System.out.print("What's your Name : ");
	    String Name = sc.next();
	    
		System.out.println("Roll No. : "+ RollNumber + ",Name : " + Name );
	
	}
}
