class S6Q17Ticket_price_by_day {
    public static void main(String[] args) {
        String day = "Sunday";

        if (day.equals("Saturday") || day.equals("Sunday"))
            System.out.println("Weekend Price");
        else
            System.out.println("Weekday Price");
    }
}
