package SystemeDeFichiers;

import java.util.HashSet;
import java.util.Set;

public abstract class Directory extends AbastractFile {

    Set<File> contents;

    public Directory(String name, User user) {
        super(name, user);
        contents = new HashSet<File>();
    }

    @Override
    public int size() {
        return contents.size();
    }

    @Override
    public Set<File> ListFiles() {
        return contents;
    }

    @Override
    public void addFile(File file) {
        contents.add(file);
    }

    @Override
    public void removeFile(File file) {
        contents.remove(file);
    }
}
