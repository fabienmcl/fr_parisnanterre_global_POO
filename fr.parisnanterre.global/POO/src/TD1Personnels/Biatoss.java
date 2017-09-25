package TD1Personnels;

import java.util.Date;

public class Biatoss extends Personnel {
    public Biatoss(String nom, String prenom, long identifiant, Date dateFinDeContrat, int salaire) {
        super(nom, prenom, identifiant);
        this.dateFinDeContrat = dateFinDeContrat;
        this.salaire = salaire;
    }

    public enum Type {
        BIBLIOTHEQUAIRE("Bibliothequaire"),
        SECRETAIRE("Secretaire");

        private final String type;

        Type(String type) {
            this.type = type;
        }
        @Override
        public String toString() {
            return type;
        }
    }
    Date dateFinDeContrat;
    int salaire;

    public Date getDateFinDeContrat() {
        return dateFinDeContrat;
    }

    public void setDateFinDeContrat(Date dateFinDeContrat) {
        this.dateFinDeContrat = dateFinDeContrat;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
