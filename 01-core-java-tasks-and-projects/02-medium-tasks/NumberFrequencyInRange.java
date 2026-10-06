import java.util.Scanner;

public class NumberFrequencyInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.print("Enter number to find frequency: ");
        int target = sc.nextInt();

        int frequency = 0;

        for (int number = start; number <= end; number++) {

            int temp = number;

            while (temp != 0) {

                int digit = temp % 10;

                if (digit == target) {
                    frequency++;
                }

                temp = temp / 10;
            }
        }

        System.out.println("Frequency of " + target + ": " + frequency);

        sc.close();
    }
}
