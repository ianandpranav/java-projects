import java.util.Scanner;

public class CharacterASCII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);

        int ascii = character;

        System.out.println("ASCII value: " + ascii);

        sc.close();
    }
}
