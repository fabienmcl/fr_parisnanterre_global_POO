package ShapeFactory;

import java.util.HashMap;
import java.util.Map;

public class ShapesFactory {
    private static Map<String , Shapes > registry = new HashMap<String , Shapes >();
    public static void registerShape ( String name , Shapes s){
        registry .put(name , s);
    }
    public Shapes createShape ( String name ) {
        return registry .get( name ). createShape ();
    }
}
