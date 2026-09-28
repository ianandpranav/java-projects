public class Student {

    private String name;
    private int javaMarks;
    private int dsaMarks;
    private int dbmsMarks;

    // Constructor
    public Student(String name, int javaMarks, int dsaMarks, int dbmsMarks) {
        this.name = name;
        this.javaMarks = javaMarks;
        this.dsaMarks = dsaMarks;
        this.dbmsMarks = dbmsMarks;
    }

    // Calculate total marks
    public int calculateTotal() {
        return javaMarks + dsaMarks + dbmsMarks;
    }

    // Calculate percentage
    public double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    // Calculate grade
    public String calculateGrade() {

        double percentage = calculatePercentage();

        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    // Display result
    public void displayResult() {

        double percentage = calculatePercentage();

        System.out.println("==============================");
        System.out.println("        STUDENT RESULT");
        System.out.println("==============================");

        System.out.println("Name       : " + name);
        System.out.println("Java       : " + javaMarks);
        System.out.println("DSA        : " + dsaMarks);
        System.out.println("DBMS       : " + dbmsMarks);

        System.out.println("------------------------------");

        System.out.println("Total      : " + calculateTotal() + "/300");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + calculateGrade());

        if (percentage >= 40) {
            System.out.println("Result     : PASS");
        } else {
            System.out.println("Result     : FAIL");
        }

        System.out.println("==============================");
    }
}
