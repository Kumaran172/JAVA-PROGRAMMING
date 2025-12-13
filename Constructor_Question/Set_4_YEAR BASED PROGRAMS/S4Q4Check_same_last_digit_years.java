class S4Q4Check_same_last_digit_years {
    public static void main(String[] args) {
        int year1 = 2015;
        int year2 = 2025;

        if (year1 % 10 == year2 % 10)
            System.out.println("Same last digit");
        else
            System.out.println("Different last digit");
    }
}
