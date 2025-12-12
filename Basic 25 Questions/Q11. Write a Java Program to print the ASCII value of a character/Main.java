import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a Character : ");
	 char c = sc.next().charAt(0);  //ip =>A
	 
	 System.out.println("ASCII VALUE : " + (int)c);    //op=>65
	}
}
