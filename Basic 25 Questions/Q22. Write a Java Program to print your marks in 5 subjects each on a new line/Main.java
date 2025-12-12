import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter your Maths Mark : ");
	    int maths = sc.nextInt();
	    System.out.print("Enter your English Mark : ");
	    int English = sc.nextInt();
	    System.out.print("Enter your Tamil Mark : ");
	    int Tamil = sc.nextInt();
	     System.out.print("Enter your Science Mark : ");
	    int Science = sc.nextInt();
	     System.out.print("Enter your Social Science Mark : ");
	    int Social_Science = sc.nextInt();
	    
		System.out.println("Maths Mark : "+ maths + "\nEnglish Mark : "+ English + "\nTamil Mark : "+ Tamil );
		System.out.println("Science Mark : "+ Science + "\nSocial Science Mark : "+ Social_Science );
		
	
	}
}
