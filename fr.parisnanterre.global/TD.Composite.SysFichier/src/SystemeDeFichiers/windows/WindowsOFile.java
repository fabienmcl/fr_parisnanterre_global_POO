package SystemeDeFichiers.windows;

import SystemeDeFichiers.File;
import SystemeDeFichiers.OrdinaryFile;
import SystemeDeFichiers.User;

import java.util.Set;

public class WindowsOFile extends OrdinaryFile {

    public WindowsOFile(String name, User user) {
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
}
