package DPFactorySingetonRegistry;

import ShapeFactory.Square;

public class ConcreteProductA implements Product {


    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }


    static{
        Factory.registerShape ( ProductEnum.A, new ConcreteProductA());
    }

}
