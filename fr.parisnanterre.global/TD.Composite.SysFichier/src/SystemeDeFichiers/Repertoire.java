package SystemeDeFichiers;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends Fichier {

    List<Fichier> contient;


    public Repertoire(int id, String nom, Proprietaire proprietaire) {
        super(id, nom, proprietaire);
        contient = new ArrayList<Fichier>();
    }

    public void ajouterFichierDansRepertoire(Fichier fichier){
        contient.add(fichier);
    }

    public List<Fichier> getContenuRepertoire(){
        return contient;
    }

    private String afficheContenue(){
        for (Fichier fichier : contient){
            fichier.toString();
        }
        return null;
    }
    @Override
    public String toString() {
        return "- Fichier : id:"+ id +
                ", nom='" + nom + '\'' +
                ", proprietaire=" + proprietaire +
                "contient=" + afficheContenue() +
                '\n';
    }
}
