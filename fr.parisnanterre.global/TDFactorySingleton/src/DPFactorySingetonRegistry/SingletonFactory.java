package DPFactorySingetonRegistry;

import java.util.HashMap;
import java.util.Map;

public class SingletonFactory implements Factory {
    private volatile SingletonFactory instance;

    private SingletonFactory(){
        super();
    }

    static Map<ProductEnum , Product > registry = new HashMap<ProductEnum,Product>();

    public static void registerProduct ( ProductEnum e , Product p){
        registry .put(e,p);
    }

    //dans le cas de createShape > createShape(ShapeEnum e, parametre utiles ....);
    //Dans le cas de avec des données spécifique, il faut crée de plusieurs create()
    // exple createSh2D : .périmètre() et createSh3D() : .volume();
    // en commun il y a .surface() de l'interface/abtract Shape.java

    @Override
    public synchronized Product createProduct(ProductEnum e) {
        return registry.get(e).createProduct();
    }

    public SingletonFactory getInstance(){
        SingletonFactory result = instance ;
        if ( result == null ) {
            synchronized( this ) {
                result = instance ;
                if ( result == null ) {
                 instance = result = new SingletonFactory ();
                }
            }
        }
        return instance ;
    }

}
