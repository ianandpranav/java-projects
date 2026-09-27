import java.util.Scanner;

public class EvenDigitCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {

                int digit = number % 10;

                if (digit % 2 == 0) {
                    count++;
                }

                number = number / 10;
            }
        }

        System.out.println("Even digits count: " + count);

        sc.close();
    }
}