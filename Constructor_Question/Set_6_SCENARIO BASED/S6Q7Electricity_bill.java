class S6Q7Electricity_bill {
    public static void main(String[] args) {
        int units = 550;
        int bill = 0;

        if (units <= 100)
            bill = 0;
        else if (units <= 300)
            bill = (units - 100) * 5;
        else
            bill = (200 * 5) + (units - 300) * 10;

        if (units > 500)
            bill += 200;

        System.out.println("Bill Amount: " + bill);
    }
}
