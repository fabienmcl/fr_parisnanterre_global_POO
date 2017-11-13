import SystemeDeFichiers.FichierOrdinaire;
import SystemeDeFichiers.Proprietaire;
import SystemeDeFichiers.Repertoire;

public class FileSystemJ {
    public static void main(String[] args){

        System.out.println("Hello world!");
        Proprietaire fabien = new Proprietaire("fabien");
        Repertoire rep = new Repertoire(0,"premierRepertoire",fabien);
        rep.ajouterFichierDansRepertoire(new FichierOrdinaire(0,"a",fabien));
        rep.ajouterFichierDansRepertoire(new Repertoire(0,"repB",fabien));




    }
}