import java.util.Scanner;

public class PerfectNumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Perfect numbers:");

        for (int number = start; number <= end; number++) {

            if (number <= 1) {
                continue;
            }

            int sum = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }

            if (sum == number) {
                System.out.println(number);
            }
        }

        sc.close();
    }
}
