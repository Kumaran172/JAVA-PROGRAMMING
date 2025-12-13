class Q17Same_last_digit {
    public static void main(String[] args) {
        int a = 123, b = 453;

        if (a % 10 == b % 10)
            System.out.println("Same last digit");
        else
            System.out.println("Different");
    }
}
