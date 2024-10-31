import java.util.Scanner;

public class CalculatriceAdditionSimple {
    public static void main(String[] args) {
        // Crée un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande le premier nombre
        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();

        // Demande le deuxième nombre
        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        // Calcule la somme des deux nombres
        int somme = nombre1 + nombre2;

        // Affiche le résultat
        System.out.println("La somme des deux nombres est : " + somme);

        // Ferme le scanner
        scanner.close();
    }
}
