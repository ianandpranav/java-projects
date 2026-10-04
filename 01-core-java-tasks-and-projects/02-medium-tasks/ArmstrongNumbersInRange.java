import java.util.Scanner;

public class ArmstrongNumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers:");

        for (int number = start; number <= end; number++) {

            int originalNumber = number;
            int temp = number;
            int digits = 0;
            int sum = 0;

            while (temp != 0) {
                digits++;
                temp = temp / 10;
            }

            temp = number;

            while (temp != 0) {
                int digit = temp % 10;

                int power = 1;

                for (int i = 1; i <= digits; i++) {
                    power = power * digit;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == originalNumber) {
                System.out.println(number);
            }
        }

        sc.close();
    }
}
