import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        System.out.println("Prime factors:");

        for (int i = 2; i <= number; i++) {

            while (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }
        }

        sc.close();
    }
}
