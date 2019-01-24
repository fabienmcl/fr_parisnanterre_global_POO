package radars.ws;

import javax.xml.ws.Endpoint;
public class SystemeAmendesLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/saam?wsdl", new SystemeAmendesImpl());
    }
}