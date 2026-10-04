import java.util.Scanner;

public class LCMUsingLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int max;

        if (first > second) {
            max = first;
        } else {
            max = second;
        }

        int lcm = max;

        while (lcm % first != 0 || lcm % second != 0) {
            lcm++;
        }

        System.out.println("LCM: " + lcm);

        sc.close();
    }
}
