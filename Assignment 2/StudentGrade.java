class StudentGrade {
    public static void main(String args[]) {
        int maths = 80;
        int science = 45;
        int history = 60;

        int total = maths + science + history;
        double avg = total / 3.0;

        System.out.println("Average Marks: " + avg);

        String grade; 

        if (avg >= 90) {
           System.out.println("Grade: A");
        } else if (avg >= 70 && avg <= 89) {
            System.out.println("Grade: B");
        } else if (avg >= 50 && avg <= 69) {
            System.out.println("Grade: C");
        } else if (avg >= 30 && avg <= 49) {
           System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

    }
}
