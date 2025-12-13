class S6Q13Battery_status {
    public static void main(String[] args) {
        int battery = 25;

        if (battery > 70)
            System.out.println("Full");
        else if (battery > 30)
            System.out.println("Moderate");
        else
            System.out.println("Low");
    }
}
