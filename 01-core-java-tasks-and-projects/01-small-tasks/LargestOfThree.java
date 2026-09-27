import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        if (first >= second && first >= third) {
            System.out.println("Largest number: " + first);
        } else if (second >= first && second >= third) {
            System.out.println("Largest number: " + second);
        } else {
            System.out.println("Largest number: " + third);
        }

        sc.close();
    }
}