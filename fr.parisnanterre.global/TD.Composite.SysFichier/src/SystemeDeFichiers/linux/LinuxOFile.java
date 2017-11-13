package SystemeDeFichiers.linux;

import SystemeDeFichiers.File;
import SystemeDeFichiers.OrdinaryFile;
import SystemeDeFichiers.User;

import java.util.Set;

public class LinuxOFile extends OrdinaryFile {


    public LinuxOFile(String name, User user) {
        super(name, user);
    }

    @Override
    public int size() {
        return -1;
    }

    @Override
    public Set<File> ListFiles() {
        return null;
    }

    @Override
    public void addFile(File file) {

    }

    @Override
    public void removeFile(File file) {

    }

    @Override
    public String toString() {
        return "- FichierLinux : id:"+ getId()+
                ", nom='" + getName() + '\'' +
                '\n';
    }
}
