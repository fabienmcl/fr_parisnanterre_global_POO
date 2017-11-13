package Factory;

import SystemeDeFichiers.File;
import SystemeDeFichiers.User;
import SystemeDeFichiers.linux.LinuxFile;
import SystemeDeFichiers.linux.LinuxOFile;

import java.util.ArrayList;
import java.util.List;

public class LFFactory implements AFFactory {


    List<User> listUser;
    static LFFactory instance = null;

    public LFFactory() {
        this.listUser = new ArrayList<User>();
        addUser();
    }

    public void addUser(){
        listUser.add(new User("a"));
        listUser.add(new User("b"));
        listUser.add(new User("b"));
    }

    public static LFFactory getInstance() {
            if (instance == null) {
            instance = new LFFactory();
        }
        return instance;
    }

    @Override
    public File createFile(String name, User u) {
        return new LinuxOFile(name,u);
    }

    @Override
    public File createDirectory(String name, User u) {
        return new LinuxOFile(name,u);
    }
}
