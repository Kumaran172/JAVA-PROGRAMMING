class Q12Last_digit_even_or_odd {
    public static void main(String[] args) {
        int n = 456;
        int last = n % 10;

        if (last % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
