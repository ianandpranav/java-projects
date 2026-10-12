import java.util.Scanner;

public class SumOfFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int sum = 0;

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    sum = sum + i;
                }
            }

            System.out.println("Sum of factors: " + sum);
        }

        sc.close();
    }
}