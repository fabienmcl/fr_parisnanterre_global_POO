package radars.wsclient;

import radars.core.Personne;
import radars.core.Voiture;
import radars.ws.SystemeAmendes;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class SystemeAmendesClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/saam?wsdl");
        QName qname = new QName("http://ws.radars/",
                "SystemeAmendesImplService");
        Service service = Service.create(url, qname);

        SystemeAmendes saam = service.getPort(SystemeAmendes.class);

        Voiture clio = new Voiture("AB 123 CD","Clio 3");
        Personne bob = new Personne("Bob","l'eponge","bikinibottom");
        clio.setProprietaire(bob);

        Voiture punto = new Voiture("AB 124 CD","Punto");
        Personne captaine = new Personne("Capitaine","'Haddock","null");
        punto.setProprietaire(captaine);


        saam.enregistrer(clio);
        saam.enregistrer(punto);


        saam.signaler("AB 123 CD","Clio 3", 90);
        saam.signaler("AB 123 CD","Tracteur", 90);
        saam.signaler("AB 123 CD","Clio 3", 140);
        //TODO
        saam.lister("AB 123 CD");
        saam.payer(1, "Capitaine", "Haddock");
        saam.lister("AB 123 CD");
        saam.payer(1, "Bob", "l'eponge");
        saam.lister("AB 123 CD");



    }
}
