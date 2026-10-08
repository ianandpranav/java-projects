import java.util.Scanner;

public class NumberOfEvenOddDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int evenCount = 0;
        int oddCount = 0;

        if (number == 0) {
            evenCount = 1;
        } else {
            while (number > 0) {

                int digit = number % 10;

                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }

                number = number / 10;
            }
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);

        sc.close();
    }
}