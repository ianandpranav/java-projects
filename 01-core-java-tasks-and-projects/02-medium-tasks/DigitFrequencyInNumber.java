import java.util.Scanner;

public class DigitFrequencyInNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter digit to find frequency: ");
        int target = sc.nextInt();

        int frequency = 0;
        int temp = number;

        while (temp != 0) {

            int digit = temp % 10;

            if (digit == target) {
                frequency++;
            }

            temp = temp / 10;
        }

        System.out.println("Frequency of " + target + ": " + frequency);

        sc.close();
    }
}
