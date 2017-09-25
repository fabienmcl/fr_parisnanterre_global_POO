package TD1Personnels;

import java.util.Date;

public class Contrat {
    private Date debut;
    private double salaire;

    public Contrat(Date debut, double salaire) {
        this.debut = debut;
        this.salaire = salaire;
    }

    public Date getDebut() {
        return debut;
    }

    public double getSalaire() {
        return salaire;
    }
}
