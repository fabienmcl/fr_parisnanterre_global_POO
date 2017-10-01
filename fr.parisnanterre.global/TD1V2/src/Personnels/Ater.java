package Personnels;

import java.util.Date;

public class Ater extends EnseignantTemporaire {
    Type type;

    public Ater(String nom, String prenom, long identifiant, Date dateDeRecrutement, int salaire, Date dateFinDeContrat, Type type) {
        super(nom, prenom, identifiant, dateDeRecrutement, salaire, dateFinDeContrat);
        this.type = Type.ALTER;
    }

    @Override
    public String toString() {
        return type.toString()+" "+super.toString();
    }
}
