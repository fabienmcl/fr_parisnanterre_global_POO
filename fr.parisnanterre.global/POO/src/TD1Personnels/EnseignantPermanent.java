package TD1Personnels;

import java.util.Date;

public abstract class EnseignantPermanent extends Enseignant {

    public EnseignantPermanent(String nom, String prenom, long identifiant, Date dateDeRecrutement, int salaire) {
        super(nom, prenom, identifiant, dateDeRecrutement, salaire);
    }

}
