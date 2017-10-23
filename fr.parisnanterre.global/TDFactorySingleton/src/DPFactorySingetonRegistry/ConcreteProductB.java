package DPFactorySingetonRegistry;

public class ConcreteProductB implements Product {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }


    static{
        Factory.registerShape ( ProductEnum.B, new ConcreteProductB());
    }
}
