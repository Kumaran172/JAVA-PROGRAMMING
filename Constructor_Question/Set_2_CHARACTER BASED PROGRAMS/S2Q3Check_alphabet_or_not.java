class S2Q3Check_alphabet_or_not {
    public static void main(String[] args) {
        char ch = '#';

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("Alphabet");
        else
            System.out.println("Not an Alphabet");
    }
}
