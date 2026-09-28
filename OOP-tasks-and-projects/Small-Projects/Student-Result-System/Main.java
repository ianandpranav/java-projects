import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("   STUDENT RESULT SYSTEM");
        System.out.println("==============================");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Java marks: ");
        int javaMarks = sc.nextInt();

        System.out.print("Enter DSA marks: ");
        int dsaMarks = sc.nextInt();

        System.out.print("Enter DBMS marks: ");
        int dbmsMarks = sc.nextInt();

        // Create Student object
        Student student = new Student(
                name,
                javaMarks,
                dsaMarks,
                dbmsMarks
        );

        // Display result
        student.displayResult();

        sc.close();
    }
}
