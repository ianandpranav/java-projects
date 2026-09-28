import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int square = number * number;
        int temp = number;
        int divisor = 1;

        while (temp > 0) {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        if (square % divisor == number) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is not an Automorphic Number.");
        }

        sc.close();
    }
}
