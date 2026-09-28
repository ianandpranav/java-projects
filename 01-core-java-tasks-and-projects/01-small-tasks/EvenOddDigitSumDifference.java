import java.util.Scanner;

public class EvenOddDigitSumDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int evenSum = 0;
        int oddSum = 0;

        while (number > 0) {

            int digit = number % 10;

            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }

            number = number / 10;
        }

        int difference = Math.abs(evenSum - oddSum);

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
        System.out.println("Difference: " + difference);

        sc.close();
    }
}