package DPFactorySingetonRegistry;

import java.util.HashMap;
import java.util.Map;

public class SingletonFactory implements Factory {

    static Map<ProductEnum , Product > registry = new HashMap<ProductEnum,Product>();

    public static void registerProduct ( ProductEnum e , Product p){
        registry .put(e,p);
    }

    @Override
    public synchronized Product createProduct(ProductEnum e) {
        return registry.get(e).createProduct();
    }
}
