package SystemeDeFichiers;

import java.util.Set;

public interface File {

    public enum OpenMODE{
        READ(),WRITE(),APPEND();

        private OpenMODE(){

        }
    }

    int size();
    int getId();
    String getName();
    User getUser();
    OpenMODE getMode();

    boolean open(OpenMODE mode);
    boolean close();
    boolean write(String content);
    void rename(String name);
    String read();

    Set<File> ListFiles();
    void addFile(File file);
    void removeFile(File file);
}
