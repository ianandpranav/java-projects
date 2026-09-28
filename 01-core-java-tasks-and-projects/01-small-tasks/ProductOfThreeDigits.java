import java.util.Scanner;

public class ProductOfThreeDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        if (number >= 100 && number <= 999) {

            int firstDigit = number / 100;
            int middleDigit = (number / 10) % 10;
            int lastDigit = number % 10;

            int product = firstDigit * middleDigit * lastDigit;

            System.out.println("Product of digits: " + product);

        } else {
            System.out.println("Please enter a 3-digit number.");
        }

        sc.close();
    }
}
