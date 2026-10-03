import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        if (month == 2) {
            System.out.println("February has 28 or 29 days.");
        } else if (month == 4 || month == 6 ||
                   month == 9 || month == 11) {
            System.out.println("This month has 30 days.");
        } else if (month >= 1 && month <= 12) {
            System.out.println("This month has 31 days.");
        } else {
            System.out.println("Invalid month number.");
        }

        sc.close();
    }
}
