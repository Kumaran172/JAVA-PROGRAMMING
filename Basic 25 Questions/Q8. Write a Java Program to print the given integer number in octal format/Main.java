import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt(); 
	   String oct = Integer.toOctalString(num);  // ip => 10
	   
	   System.out.println("Entered Integer value : "+num);
	   
	   System.out.println("Octal value : " + oct); // op=> 12
	   
	   System.out.printf("Octal value : %o \n",num); //op=> 12
	}
}
