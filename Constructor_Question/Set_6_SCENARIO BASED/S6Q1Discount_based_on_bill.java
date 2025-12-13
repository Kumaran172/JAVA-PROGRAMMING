class S6Q1Discount_based_on_bill {
    public static void main(String[] args) {
        int bill = 6000;
        double discount;

        if (bill >= 5000)
            discount = bill * 0.20;
        else if (bill >= 2000)
            discount = bill * 0.10;
        else
            discount = bill * 0.05;

        System.out.println("Discount: " + discount);
    }
}
