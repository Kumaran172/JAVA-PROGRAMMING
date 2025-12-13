class S5Q2Student_grade {
    public static void main(String[] args) {
        int marks = 75;
        char grade;

        if (marks >= 75) grade = 'A';
        else if (marks >= 60) grade = 'B';
        else if (marks >= 35) grade = 'C';
        else grade = 'F';

        switch (grade) {
            case 'A': System.out.println("Grade A"); break;
            case 'B': System.out.println("Grade B"); break;
            case 'C': System.out.println("Grade C"); break;
            default: System.out.println("Fail");
        }
    }
}
