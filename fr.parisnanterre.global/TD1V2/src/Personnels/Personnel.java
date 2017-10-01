package Personnels;

public abstract class Personnel {
    private String nom;
    private String prenom;
    private long identifiant;

    public Personnel(String nom, String prenom, long identifiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public long getNumeroSecuSocial() {
        return identifiant;
    }


    @Override
    public String toString() {
        return prenom+" "+nom;
    }
}
