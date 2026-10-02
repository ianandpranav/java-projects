import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        number = Math.abs(number);

        int sum = 0;
        int temp = number;

        while (temp > 0) {

            int digit = temp % 10;
            sum = sum + digit;

            temp = temp / 10;
        }

        if (number != 0 && number % sum == 0) {
            System.out.println(original + " is a Harshad Number.");
        } else {
            System.out.println(original + " is not a Harshad Number.");
        }

        sc.close();
    }
}
