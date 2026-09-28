import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int temp = number;
        int digits = 0;
        int sum = 0;

        number = Math.abs(number);

        // Count digits
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;

        // Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (number == 0) {
            sum = 0;
        }

        if (sum == number) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}
