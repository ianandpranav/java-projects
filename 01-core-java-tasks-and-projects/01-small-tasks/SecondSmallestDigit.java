import java.util.Scanner;

public class SecondSmallestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int smallest = 10;
        int secondSmallest = 10;

        while (number > 0) {

            int digit = number % 10;

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit > smallest && digit < secondSmallest) {
                secondSmallest = digit;
            }

            number = number / 10;
        }

        if (secondSmallest == 10) {
            System.out.println("Second smallest distinct digit does not exist.");
        } else {
            System.out.println("Second smallest digit: " + secondSmallest);
        }

        sc.close();
    }
}
