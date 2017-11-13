import Factory.LFFactory;
import SysFichierFR.FichierOrdinaire;
import SysFichierFR.Proprietaire;
import SysFichierFR.Repertoire;
import SystemeDeFichiers.File;
import SystemeDeFichiers.User;

public class FileSystemJ {
    public static void main(String[] args){

        System.out.println("Hello world!");

        LFFactory linux = new LFFactory();
        User u = new User("a");
        File rep = linux.createDirectory("repA",u);
        rep.addFile(linux.createFile("fichierA",u));

        System.out.println(rep.toString());




    }
}