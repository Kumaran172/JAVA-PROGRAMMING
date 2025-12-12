import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();                 //ip => 255
	   String hex = Integer.toHexString(num);
	   
	   System.out.println(hex); //op => ff
	   
	   System.out.printf("%X \n",num); //uppercase hex op=> FF
	   System.out.printf("%x",num); //lowercase hex op=>ff
	}
}
