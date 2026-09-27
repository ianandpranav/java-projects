import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {

            System.out.println("Vowel");

        } else if (Character.isLetter(ch)) {

            System.out.println("Consonant");

        } else {

            System.out.println("Not an alphabet character");
        }

        sc.close();
    }
}