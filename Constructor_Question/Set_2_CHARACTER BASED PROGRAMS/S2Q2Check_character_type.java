class S2Q2Check_character_type {
    public static void main(String[] args) {
        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase Letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase Letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Symbol");
    }
}
