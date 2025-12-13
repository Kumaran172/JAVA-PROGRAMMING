class S3Q4Check_valid_triangle_by_angles {
    public static void main(String[] args) {
        int a = 60, b = 60, c = 60;

        if (a + b + c == 180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}
