package Personnels;

import java.util.Date;

public class Bibliothequaire extends Biatoss {
    Type type;

    public Bibliothequaire(String nom, String prenom, long identifiant, Date dateFinDeContrat, int salaire, Type type) {
        super(nom, prenom, identifiant, dateFinDeContrat, salaire);
        this.type = Type.BIBLIOTHEQUAIRE;
    }
}
