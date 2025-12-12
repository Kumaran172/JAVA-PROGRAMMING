import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	 String hex = sc.nextLine();             //ip=> ff / FF
	 int num = Integer.parseInt(hex,16);     //op=> 255
	 
	 System.out.println(num);
	}
}
