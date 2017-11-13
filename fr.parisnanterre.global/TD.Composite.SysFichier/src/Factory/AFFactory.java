package Factory;

import SystemeDeFichiers.File;
import SystemeDeFichiers.User;

public interface AFFactory {

    File createFile(String name, User u);
    File createDirectory(String name, User u);

}
