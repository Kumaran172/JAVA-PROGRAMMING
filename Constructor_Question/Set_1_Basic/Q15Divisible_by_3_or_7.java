class Q15Divisible_by_3_or_7 {
    public static void main(String[] args) {
        int n = 21;

        if (n % 3 == 0 || n % 7 == 0)
            System.out.println("Divisible");
        else
            System.out.println("Not divisible");
    }
}
