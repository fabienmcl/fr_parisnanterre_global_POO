package SystemeDeFichiers;

public class Proprietaire {

    String nom;

    public Proprietaire(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Proprietaire{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
