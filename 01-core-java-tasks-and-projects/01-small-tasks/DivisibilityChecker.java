import java.util.Scanner;

public class DivisibilityChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else if (number % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else if (number % 11 == 0) {
            System.out.println("The number is divisible by 11.");
        } else {
            System.out.println("The number is not divisible by 5 or 11.");
        }

        sc.close();
    }
}