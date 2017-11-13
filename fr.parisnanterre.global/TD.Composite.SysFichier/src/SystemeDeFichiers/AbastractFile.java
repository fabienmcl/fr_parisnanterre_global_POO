package SystemeDeFichiers;

import java.util.Set;

public abstract class AbastractFile implements File {


    int id;
    String name;
    User user;
    OpenMODE mode;
    boolean isOpen;
    String contents;

    public static int nextID = 0;

    public AbastractFile( String name, User user) {
        this.id = nextID++;
        this.name = name;
        this.user = user;
        this.mode = null;
        this.isOpen = false;
        this.contents = "";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public OpenMODE getMode() {
        return mode;
    }
    @Override
    public void rename(String name) {
        this.name= name;
    }

    @Override
    public boolean open(OpenMODE mode) {
        if (!isOpen) {
            this.isOpen = true;
            this.mode = mode;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean close() {
        if (isOpen) {
            this.isOpen = false;
            this.mode = null;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean write(String content) {
        if (getMode() == OpenMODE.WRITE) {
            this.contents = content;
            return true;
        } else if (getMode() == OpenMODE.APPEND) {
            this.contents = contents + content;
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String read() {
        if (getMode() == OpenMODE.READ) {
            return contents.toString();
        } else {
            return null;
        }
    }
}
