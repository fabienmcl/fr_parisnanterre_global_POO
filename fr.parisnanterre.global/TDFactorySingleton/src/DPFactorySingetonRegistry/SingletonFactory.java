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
