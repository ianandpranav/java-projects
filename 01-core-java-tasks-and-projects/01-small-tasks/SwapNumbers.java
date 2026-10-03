import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After swapping:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        sc.close();
    }
}
