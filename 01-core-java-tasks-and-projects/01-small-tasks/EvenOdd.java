import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.println(number % 2 == 0 ? "Even" : "Odd");

        sc.close();
    }
}
