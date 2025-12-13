class Q7Smallest_among_three_numbers {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 5;

        if (a <= b && a <= c)
            System.out.println(a);
        else if (b <= a && b <= c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
