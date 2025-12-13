import java.util.Scanner;

public class S2Q3_Area_of_a_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the Triangle : ");
        double base = sc.nextInt();
        System.out.print("Enter the height of the Triangle : ");
        double height = sc.nextInt();
        double area_o_tri = (0.5)*(base*height);

        System.out.printf("The Area of the Triangle is : %f ",area_o_tri);
    }
}