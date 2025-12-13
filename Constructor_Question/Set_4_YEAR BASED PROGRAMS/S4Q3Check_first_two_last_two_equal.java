class S4Q3Check_first_two_last_two_equal {
    public static void main(String[] args) {
        int year = 2020;

        int firstTwo = year / 100;
        int lastTwo = year % 100;

        if (firstTwo == lastTwo)
            System.out.println("First two and last two digits are equal");
        else
            System.out.println("Not equal");
    }
}
