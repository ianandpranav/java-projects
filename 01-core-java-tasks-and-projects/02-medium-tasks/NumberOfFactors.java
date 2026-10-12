import java.util.Scanner;

public class NumberOfFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int count = 0;

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    count++;
                }
            }

            System.out.println("Number of factors: " + count);
        }

        sc.close();
    }
}