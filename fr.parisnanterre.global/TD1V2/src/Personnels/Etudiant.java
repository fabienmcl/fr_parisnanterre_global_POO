package Personnels;

public class Etudiant extends Personnel{
    public int getBourse() {
        return bourse;
    }

    public Etudiant(String nom, String prenom, long identifiant, int bourse) {
        super(nom, prenom, identifiant);
        this.bourse = bourse;
    }

    public void setBourse(int bourse) {
        this.bourse = bourse;
    }

    int bourse;
}
