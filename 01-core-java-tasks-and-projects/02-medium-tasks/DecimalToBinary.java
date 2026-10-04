import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        int binary = 0;
        int place = 1;

        while (number > 0) {

            int remainder = number % 2;

            binary = binary + (remainder * place);

            number = number / 2;
            place = place * 10;
        }

        System.out.println("Binary: " + binary);

        sc.close();
    }
}
