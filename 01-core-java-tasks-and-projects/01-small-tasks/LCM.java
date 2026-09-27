import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        first = Math.abs(first);
        second = Math.abs(second);

        int lcm = Math.max(first, second);

        while (true) {
            if (lcm % first == 0 && lcm % second == 0) {
                break;
            }

            lcm++;
        }

        System.out.println("LCM: " + lcm);

        sc.close();
    }
}