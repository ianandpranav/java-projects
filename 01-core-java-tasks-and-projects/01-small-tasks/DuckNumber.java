import java.util.Scanner;

public class DuckNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = Math.abs(number);
        boolean hasZero = false;

        while (temp > 0) {

            int digit = temp % 10;

            if (digit == 0) {
                hasZero = true;
                break;
            }

            temp = temp / 10;
        }

        if (number != 0 && hasZero) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }

        sc.close();
    }
}
