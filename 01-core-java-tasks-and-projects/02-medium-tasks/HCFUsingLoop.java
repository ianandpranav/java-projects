import java.util.Scanner;

public class HCFUsingLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int hcf = 1;

        for (int i = 1; i <= first && i <= second; i++) {

            if (first % i == 0 && second % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF: " + hcf);

        sc.close();
    }
}
