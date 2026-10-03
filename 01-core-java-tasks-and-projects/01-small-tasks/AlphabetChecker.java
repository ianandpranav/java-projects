import java.util.Scanner;

public class AlphabetChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);

        if ((character >= 'A' && character <= 'Z') ||
            (character >= 'a' && character <= 'z')) {

            System.out.println("It is an alphabet.");
        } else {
            System.out.println("It is not an alphabet.");
        }

        sc.close();
    }
}
