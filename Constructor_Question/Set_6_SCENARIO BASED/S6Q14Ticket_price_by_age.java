class S6Q14Ticket_price_by_age {
    public static void main(String[] args) {
        int age = 65;

        if (age < 12)
            System.out.println("Child Ticket");
        else if (age < 60)
            System.out.println("Adult Ticket");
        else
            System.out.println("Senior Ticket");
    }
}
