class S6Q16Mobile_number_validation {
    public static void main(String[] args) {
        long mobile = 9876543210L;

        if (String.valueOf(mobile).length() == 10)
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}
