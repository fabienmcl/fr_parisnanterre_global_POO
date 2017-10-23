package DPFactorySingetonRegistry;


import java.util.HashMap;
import java.util.Map;
/*
public class Factory {
    private static Map<ProductEnum , Product > registry = new HashMap<ProductEnum,Product>();

    public static void registerProduct ( ProductEnum e , Product p){
        registry .put(e,p);
    }

    public Factory() {
        super();
    }

    public Product createProduct(ProductEnum e){
        return registry.get(e).createProduct();
    }
}*/

interface Factory {

    //registerProduct( ProductEnum e , Product p);

    Product createProduct(ProductEnum e);
}