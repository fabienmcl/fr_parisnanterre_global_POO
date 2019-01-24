package calculette;

import javax.jws.WebService;

import javax.jws.WebService;

@WebService(endpointInterface = "calculette.Calculette")
public class CalculetteImpl implements Calculette {
    @Override
    public int ajouter(int a, int b) {
        return a+b;
    }
    @Override
    public int soustraire(int a, int b) {
        return a-b;
    }
}