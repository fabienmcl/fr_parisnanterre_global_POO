package Personnels;

import java.util.Date;

public abstract class Enseignant extends Personnel {
    public Enseignant(String nom, String prenom, long identifiant, Date dateDeRecrutement, int salaire) {
        super(nom, prenom, identifiant);
        this.dateDeRecrutement = dateDeRecrutement;
        this.salaire = salaire;
    }

    public enum Type {
        PROFESSEUR("Professeur"),
        MAITRE("Maître de Conférences,"),
        ALTER("Ater"),
        VACATAIRE("Vacataire");

        private final String type;

        Type(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return type;
        }
    }
    Date dateDeRecrutement;
    double salaire;

    public Date getDateDeRecrutement() {
        return dateDeRecrutement;
    }

    public void setDateDeRecrutement(Date dateDeRecrutement) {
        this.dateDeRecrutement = dateDeRecrutement;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

}
