import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int square = number * number;
        int sum = 0;

        while (square > 0) {

            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if (sum == number) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }

        sc.close();
    }
}
