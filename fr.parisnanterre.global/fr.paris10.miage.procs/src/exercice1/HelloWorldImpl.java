package exercice1;

import javax.jws.WebService;

@WebService(endpointInterface = "exercice1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String bonjour(String name) {
        return "Bonjour "+name+"\n";
    }
}