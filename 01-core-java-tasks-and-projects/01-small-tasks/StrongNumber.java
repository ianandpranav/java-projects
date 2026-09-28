import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        number = Math.abs(number);

        while (number > 0) {

            int digit = number % 10;

            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            sum = sum + factorial;

            number = number / 10;
        }

        if (sum == Math.abs(original)) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is not a Strong Number.");
        }

        sc.close();
    }
}
