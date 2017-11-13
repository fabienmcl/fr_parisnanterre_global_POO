package SystemeDeFichiers.linux;

import SystemeDeFichiers.Directory;
import SystemeDeFichiers.User;

public class LinuxDirectory extends Directory {

    public LinuxDirectory(String name, User user) {
        super(name, user);
    }

    @Override
    public String toString() {
        return "- linux directory : id:"+ getId()+
                ", nom='" + getName() + '\'' +
                '\n';
    }
}
