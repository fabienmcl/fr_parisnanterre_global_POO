package SysFichierFR;

public abstract class Fichier {

    int id;
    String nom;
    Proprietaire proprietaire;

    public Fichier(int id, String nom, Proprietaire proprietaire) {
        this.id = id;
        this.nom = nom;
        this.proprietaire = proprietaire;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    @Override
    public String toString() {

        return "- Fichier : id:"+ id +
                ", nom='" + nom + '\'' +
                ", proprietaire=" + proprietaire +
                '\n';
    }
}
