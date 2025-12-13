class S6Q9ATM_withdraw_validation {
    public static void main(String[] args) {
        int balance = 5000;
        int withdraw = 1200;

        if (withdraw <= balance && withdraw % 100 == 0)
            System.out.println("Withdrawal Allowed");
        else
            System.out.println("Invalid Withdrawal");
    }
}
