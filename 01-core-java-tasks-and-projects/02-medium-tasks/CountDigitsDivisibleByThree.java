import java.util.Scanner;

public class CountDigitsDivisibleByThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int count = 0;

        while (number > 0) {

            int digit = number % 10;

            if (digit % 3 == 0) {
                count++;
            }

            number = number / 10;
        }

        System.out.println("Digits divisible by 3: " + count);

        sc.close();
    }
}