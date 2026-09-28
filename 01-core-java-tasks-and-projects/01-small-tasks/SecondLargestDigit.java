import java.util.Scanner;

public class SecondLargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int largest = -1;
        int secondLargest = -1;

        while (number > 0) {

            int digit = number % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            number = number / 10;
        }

        if (secondLargest == -1) {
            System.out.println("Second largest distinct digit does not exist.");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        sc.close();
    }
}
