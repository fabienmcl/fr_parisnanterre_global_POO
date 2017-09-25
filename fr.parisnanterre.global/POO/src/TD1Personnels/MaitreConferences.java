package TD1Personnels;

import java.util.Date;

public class MaitreConferences extends EnseignantPermanent {
    Type type;

    public MaitreConferences(String nom, String prenom, long identifiant, Date dateDeRecrutement, int salaire, Type type) {
        super(nom, prenom, identifiant, dateDeRecrutement, salaire);
        this.type = Type.MAITRE;
    }


    @Override
    public String toString() {
        return type.toString()+" "+super.toString();
    }
}
