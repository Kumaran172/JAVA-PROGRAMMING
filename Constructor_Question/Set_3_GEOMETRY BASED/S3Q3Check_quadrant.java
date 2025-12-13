class S3Q3Check_quadrant {
    public static void main(String[] args) {
        int x = -4, y = 5;

        if (x > 0 && y > 0)
            System.out.println("First Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("Second Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("Third Quadrant");
        else if (x > 0 && y < 0)
            System.out.println("Fourth Quadrant");
        else
            System.out.println("On Axis");
    }
}
