class Q18Check_digit_count {
    public static void main(String[] args) {
        int n = 99;

        if (n >= 0 && n <= 9)
            System.out.println("Single digit");
        else if (n <= 99)
            System.out.println("Two digit");
        else if (n <= 999)
            System.out.println("Three digit");
    }
}
