import java.util.Scanner;

public class DigitOrCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);

        if (character >= '0' && character <= '9') {
            System.out.println("It is a digit.");
        } else if ((character >= 'A' && character <= 'Z') ||
                   (character >= 'a' && character <= 'z')) {
            System.out.println("It is an alphabet.");
        } else {
            System.out.println("It is a special character.");
        }

        sc.close();
    }
}
