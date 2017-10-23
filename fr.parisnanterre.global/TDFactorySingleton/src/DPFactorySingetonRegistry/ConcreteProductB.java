package DPFactorySingetonRegistry;
class ConcreteProductB implements Product {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }


    static{
        SingletonFactory.registerProduct ( ProductEnum.B, new ConcreteProductB());
    }

    @Override
    public String toString() {
        return "ConcreteProductB{}";
    }
}
