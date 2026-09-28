import java.util.Scanner;

public class DifferenceFirstLastDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        int difference = Math.abs(firstDigit - lastDigit);

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Difference: " + difference);

        sc.close();
    }
}
