package SystemeDeFichiers;

import java.util.Set;

public abstract class OrdinaryFile extends AbastractFile {

    String contents;

    public OrdinaryFile(String name, User user) {
        super(name, user);
        this.contents = "";
    }

    @Override
    public String read() {
        if (getMode() == OpenMODE.READ) {
            return contents.toString();
        } else {
            return null;
        }
    }

    @Override
    public boolean write(String content) {

        if (getMode() == OpenMODE.WRITE) {
            this.contents = content;
            return true;
        } else if (getMode() == OpenMODE.APPEND) {
            this.contents = contents+content;
            return true;
        }
        return false;
    }



}
