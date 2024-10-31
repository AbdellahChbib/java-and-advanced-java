import java.util.Scanner;

public class ConversionTemperature {
    public static void main(String[] args) {
        // Crée un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande la température en degrés Celsius
        System.out.print("Entrez la température en degrés Celsius : ");
        double celsius = scanner.nextDouble();

        // Convertit la température en Fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Affiche le résultat de la conversion
        System.out.println(celsius + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");

        // Ferme le scanner
        scanner.close();
    }
}
