package Personnels;

import java.util.Date;

public class Secretaire extends Biatoss{
    Biatoss.Type type;

    public Secretaire(String nom, String prenom, long identifiant, Date dateFinDeContrat, int salaire, Type type) {
        super(nom, prenom, identifiant, dateFinDeContrat, salaire);
        this.type = Type.SECRETAIRE;
    }

    @Override
    public String toString() {
        return type.toString()+" "+super.toString();
    }
}
