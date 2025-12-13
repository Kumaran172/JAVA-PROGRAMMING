class Q11First_digit_even_or_odd {
    public static void main(String[] args) {
        int n = 345;
        int first = n / 100;

        if (first % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
