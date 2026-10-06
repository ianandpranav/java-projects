import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        String hexadecimal = "";

        while (number > 0) {

            int remainder = number % 16;

            if (remainder < 10) {
                hexadecimal = remainder + hexadecimal;
            } else {
                hexadecimal = (char) ('A' + (remainder - 10)) + hexadecimal;
            }

            number = number / 16;
        }

        System.out.println("Hexadecimal: " + hexadecimal);

        sc.close();
    }
}
