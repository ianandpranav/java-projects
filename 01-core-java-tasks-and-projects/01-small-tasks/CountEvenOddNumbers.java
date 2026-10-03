import java.util.Scanner;

public class CountEvenOddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        sc.close();
    }
}
