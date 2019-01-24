package radars.ws;
import radars.core.Amende;
import radars.core.Personne;
import radars.core.Voiture;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebService(endpointInterface = "radars.ws.SystemeAmendes")
public class SystemeAmendesImpl implements SystemeAmendes {

    private final static Logger logger = Logger.getLogger(SystemeAmendesImpl.class.getName());

    //List<Voiture> voitures = new ArrayList<Voiture>();
    HashMap<String, Voiture> voitures = new HashMap<String, Voiture>();
    //List<Amende> amendes = new ArrayList<Amende>();
    HashMap<Integer, Amende> amendes = new HashMap<Integer, Amende>();
    List<Personne> personnes = new ArrayList<Personne>();

    @Override
    public void enregistrer(Voiture v) {
        voitures.put(v.getImmatriculation(), v);
        System.out.println("Voiture enregistrée");
        System.out.println(v.toString());
    }

    @Override
    public int signaler(String immatriculation, String modele, int tarif) {
        Amende a = new Amende(immatriculation, tarif);
        amendes.put(a.getNumero(),a);
        logger.log(Level.INFO, "Amende enregistrée");
        System.out.println("Amende enregistrée");
        System.out.println(a.toString());
        return a.getNumero();
    }

    @Override
    public Amende[]  lister(String immatriculation) {
        List<Amende> result = new ArrayList<Amende>();

        amendes.forEach((k, v) -> {
            if(v.getImmatriculation().equals(immatriculation)){
                result.add(v);
            }
        });
        Amende[] tab = new Amende[result.size()];
        System.out.println("Listing des amendes pour "+immatriculation);
        System.out.println(tab.toString());
        tab = result.toArray(tab);
        return tab;
    }

    @Override
    public void payer(int numero, String nom, String prenom) {
        amendes.remove(numero);
    }
}