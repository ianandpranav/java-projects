import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        int octal = 0;
        int place = 1;

        while (number > 0) {

            int remainder = number % 8;

            octal = octal + (remainder * place);

            number = number / 8;
            place = place * 10;
        }

        System.out.println("Octal: " + octal);

        sc.close();
    }
}tr6
