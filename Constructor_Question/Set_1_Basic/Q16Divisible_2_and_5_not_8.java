class Q16Divisible_2_and_5_not_8 {
    public static void main(String[] args) {
        int n = 20;

        if (n % 2 == 0 && n % 5 == 0 && n % 8 != 0)
            System.out.println("Condition satisfied");
        else
            System.out.println("Not satisfied");
    }
}
