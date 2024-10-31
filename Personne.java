public class Personne {
    // Attributs de la classe Personne
    private String nom;
    private int age;

    // Constructeur pour initialiser les attributs
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode pour afficher les informations de la personne
    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
    }

    // Méthode principale pour exécuter le programme
    public static void main(String[] args) {
        // Création d'un objet Personne
        Personne personne = new Personne("Jean Dupont", 25);
        
        // Appel de la méthode afficherInfos pour afficher les informations
        personne.afficherInfos();
    }
}
