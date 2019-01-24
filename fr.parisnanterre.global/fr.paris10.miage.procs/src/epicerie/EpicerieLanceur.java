package epicerie;

import javax.xml.ws.Endpoint;

public class EpicerieLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/epicerie?wsdl", new EpicerieImplService());
    }
}