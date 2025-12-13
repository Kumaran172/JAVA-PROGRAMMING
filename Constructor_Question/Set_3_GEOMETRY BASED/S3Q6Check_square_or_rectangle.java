class S3Q6Check_square_or_rectangle {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10, d = 10;

        if (a == b && b == c && c == d)
            System.out.println("Square");
        else if (a == c && b == d)
            System.out.println("Rectangle");
        else
            System.out.println("Neither Square nor Rectangle");
    }
}
