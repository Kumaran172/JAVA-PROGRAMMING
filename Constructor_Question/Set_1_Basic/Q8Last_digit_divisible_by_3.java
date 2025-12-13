class Q8Last_digit_divisible_by_3 {
    public static void main(String[] args) {
        int n = 123;
        int last = n % 10;

        if (last % 3 == 0)
            System.out.println("Divisible by 3");
        else
            System.out.println("Not divisible by 3");
    }
}
