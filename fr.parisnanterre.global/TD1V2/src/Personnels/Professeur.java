package Personnels;

import java.util.Date;

public class Professeur extends EnseignantPermanent{
    Type type;

    public Professeur(String nom, String prenom, long identifiant, Date dateDeRecrutement, int salaire, Type type) {
        super(nom, prenom, identifiant, dateDeRecrutement, salaire);
        this.type = Type.PROFESSEUR;
    }

    @Override
    public String toString() {
        return type.toString()+" "+super.toString();
    }
}
