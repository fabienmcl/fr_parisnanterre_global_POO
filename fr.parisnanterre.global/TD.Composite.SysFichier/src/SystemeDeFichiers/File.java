package SystemeDeFichiers;

import java.util.Set;

public interface File {

    public enum OpenMODE{
        READ(),WRITE(),APPEND();

        private OpenMODE(){

        }
    }

    int getId();
    String getName();
    User getUser();
    OpenMODE getMode();

    boolean open(OpenMODE mode);
    boolean close();
    boolean write(String content);
    void rename(String name);

    Set<File> ListFiles();

    File addFile(File file);
    void removeFile(File file);

    int size();
}
