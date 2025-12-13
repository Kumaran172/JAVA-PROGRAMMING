//7 Basic Operations Write a Java Program to swap two numbers without using a third variable.


public class S1Q7_swap_without_3rd_variable {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

        System.out.println("Before Swapping : "+ "a : " + a + " , b : " + b);

        a = a+b;  //a => 10 + 20 => 30
        b = a-b;  //b => 30 - 20 => 10
        a = a-b;  //a => 30 - 10 => 20

        System.out.println("After Swapping : "+ "a : " + a + " , b : " + b);
    }
}
