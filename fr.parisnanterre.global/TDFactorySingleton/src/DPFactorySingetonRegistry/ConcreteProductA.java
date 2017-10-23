package DPFactorySingetonRegistry;

import ShapeFactory.Square;

class ConcreteProductA extends AbstractProductA {


    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }


    static{
        SingletonFactory.registerProduct ( ProductEnum.A, new ConcreteProductA());
    }

    @Override
    public String toString() {
        return "ConcreteProductA{}";
    }
}
