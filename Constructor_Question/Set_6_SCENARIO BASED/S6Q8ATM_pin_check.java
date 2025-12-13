class S6Q8ATM_pin_check {
    public static void main(String[] args) {
        int storedPin = 1234;
        int enteredPin = 1234;

        if (storedPin == enteredPin)
            System.out.println("PIN Matched");
        else
            System.out.println("Invalid PIN");
    }
}
