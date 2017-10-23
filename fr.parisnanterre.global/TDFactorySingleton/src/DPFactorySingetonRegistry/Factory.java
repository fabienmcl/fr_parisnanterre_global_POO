package DPFactorySingetonRegistry;

import DPFactorySingetonRegistry.ConcreteProduct;

public class Factory {

    public Product createProduct(){
        return new ConcreteProduct();
    }
}
