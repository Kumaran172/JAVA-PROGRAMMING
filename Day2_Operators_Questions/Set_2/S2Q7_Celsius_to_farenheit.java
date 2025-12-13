//package Set_2;

import java.util.Scanner;

public class S2Q7_Celsius_to_farenheit {
    public static void main(String[] args) {
          double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Celcius point : ");
        float Celcius = sc.nextFloat();

        float Fahrenheit = (Celcius * 9/5) + 32;

        System.out.println("The Current Fahrenheit is : " + Fahrenheit + "C");
     }
}
