class Q14Divisible_by_3_and_5 {
    public static void main(String[] args) {
        int n = 30;

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible by 3 and 5");
        else
            System.out.println("Not divisible");
    }
}
