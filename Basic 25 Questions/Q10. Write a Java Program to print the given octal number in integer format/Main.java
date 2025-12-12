import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	 String oct = sc.nextLine();             //ip=> 12
	 int num = Integer.parseInt(oct,8);     //op=> 10
	 
	 System.out.println(num);
	}
}
