class S5Q5Mini_ATM_simulation {
    public static void main(String[] args) {
        int choice = 1;
        int balance = 5000;

        switch (choice) {
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.println("Withdraw Selected");
                break;
            case 3:
                System.out.println("Deposit Selected");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
