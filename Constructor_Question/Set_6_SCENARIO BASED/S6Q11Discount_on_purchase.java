class S6Q11Discount_on_purchase {
    public static void main(String[] args) {
        int amount = 3000;

        if (amount >= 5000)
            System.out.println("20% Discount");
        else if (amount >= 2000)
            System.out.println("10% Discount");
        else
            System.out.println("No Discount");
    }
}
