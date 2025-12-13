class S3Q2Check_right_angled_triangle {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        if (a*a + b*b == c*c ||
            b*b + c*c == a*a ||
            a*a + c*c == b*b)
            System.out.println("Right Angled Triangle");
        else
            System.out.println("Not a Right Angled Triangle");
    }
}
