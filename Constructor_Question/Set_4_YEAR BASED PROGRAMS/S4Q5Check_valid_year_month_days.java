class S4Q5Check_valid_year_month_days {
    public static void main(String[] args) {
        int year = 2024;
        int month = 2;

        if (month < 1 || month > 12) {
            System.out.println("Invalid Month");
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                System.out.println("29 Days");
            else
                System.out.println("28 Days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days");
        } else {
            System.out.println("31 Days");
        }
    }
}
