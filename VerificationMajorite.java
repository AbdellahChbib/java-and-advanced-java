import java.util.Scanner;

public class VerificationMajorite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre age : ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Vous etes majeur.");
        } else {
            System.out.println("Vous etes mineur.");
        }

        scanner.close();
    }
}
