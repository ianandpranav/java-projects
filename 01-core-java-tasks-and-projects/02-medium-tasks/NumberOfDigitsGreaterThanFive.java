import java.util.Scanner;

public class NumberOfDigitsGreaterThanFive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int count = 0;

        while (number > 0) {

            int digit = number % 10;

            if (digit > 5) {
                count++;
            }

            number = number / 10;
        }

        System.out.println("Digits greater than 5: " + count);

        sc.close();
    }
}