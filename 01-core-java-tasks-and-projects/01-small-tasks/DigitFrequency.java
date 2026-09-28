import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter the digit to find: ");
        int target = sc.nextInt();

        number = Math.abs(number);

        int count = 0;

        if (target < 0 || target > 9) {
            System.out.println("Please enter a digit between 0 and 9.");
        } else {

            if (number == 0 && target == 0) {
                count = 1;
            } else {
                while (number > 0) {

                    int digit = number % 10;

                    if (digit == target) {
                        count++;
                    }

                    number = number / 10;
                }
            }

            System.out.println("Frequency of " + target + ": " + count);
        }

        sc.close();
    }
}