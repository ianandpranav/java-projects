import java.util.Scanner;

public class StrongNumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Strong numbers:");

        for (int number = start; number <= end; number++) {

            if (number <= 0) {
                continue;
            }

            int originalNumber = number;
            int temp = number;
            int sum = 0;

            while (temp != 0) {

                int digit = temp % 10;

                int factorial = 1;

                for (int i = 1; i <= digit; i++) {
                    factorial = factorial * i;
                }

                sum = sum + factorial;
                temp = temp / 10;
            }

            if (sum == originalNumber) {
                System.out.println(number);
            }
        }

        sc.close();
    }
}
