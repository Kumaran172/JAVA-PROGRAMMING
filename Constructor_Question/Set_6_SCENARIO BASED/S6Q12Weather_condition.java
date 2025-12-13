class S6Q12Weather_condition {
    public static void main(String[] args) {
        int temp = 42;

        if (temp < 15)
            System.out.println("Cold");
        else if (temp < 30)
            System.out.println("Pleasant");
        else if (temp < 40)
            System.out.println("Hot");
        else
            System.out.println("Heatwave");
    }
}
