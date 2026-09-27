import java.util.Scanner;

public class ProductOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int product = 1;

        if (number == 0) {
            product = 0;
        } else {
            while (number > 0) {
                int digit = number % 10;
                product = product * digit;
                number = number / 10;
            }
        }

        System.out.println("Product of digits: " + product);

        sc.close();
    }
}