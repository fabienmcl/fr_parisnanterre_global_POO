package TD1Personnels;

import java.util.Date;

public abstract class EnseignantTemporaire extends Enseignant {
    private Date dateFinDeContrat;

    public EnseignantTemporaire(String nom, String prenom, long identifiant, Date dateDeRecrutement, int salaire, Date dateFinDeContrat) {
        super(nom, prenom, identifiant, dateDeRecrutement, salaire);
        this.dateFinDeContrat = dateFinDeContrat;
    }

    public Date getDateFinDeContrat() {
        return dateFinDeContrat;
    }

    public void setDateFinDeContrat(Date dateFinDeContrat) {
        this.dateFinDeContrat = dateFinDeContrat;
    }
    /*
    public Date fin(){return ((CDD)contrat).getFin(); }
     */

}
