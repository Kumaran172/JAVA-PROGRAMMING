class S6Q4Mobile_battery_check {
    public static void main(String[] args) {
        int battery = 40;

        if (battery <= 20)
            System.out.println("Low Battery");
        else if (battery <= 50)
            System.out.println("50% Consumed");
        else
            System.out.println("Battery Full");
    }
}
