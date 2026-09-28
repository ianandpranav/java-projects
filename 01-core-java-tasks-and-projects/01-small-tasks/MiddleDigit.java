import java.util.Scanner;

public class MiddleDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        if (number >= 100 && number <= 999) {

            int middleDigit = (number / 10) % 10;

            System.out.println("Middle digit: " + middleDigit);

        } else {
            System.out.println("Please enter a 3-digit number.");
        }

        sc.close();
    }
}
