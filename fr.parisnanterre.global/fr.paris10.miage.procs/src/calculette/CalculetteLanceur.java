package calculette;

import javax.xml.ws.Endpoint;
public class CalculetteLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/calculette", new CalculetteImpl());
        //Endpoint.publish("http://localhost:9999/ws/soustraire", new CalculetteImpl());
    }
}