import java.util.Scanner;

public class FirstDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        if (number == 0) {
            System.out.println("First digit: 0");
        } else {

            while (number >= 10) {
                number = number / 10;
            }

            System.out.println("First digit: " + number);
        }

        sc.close();
    }
}