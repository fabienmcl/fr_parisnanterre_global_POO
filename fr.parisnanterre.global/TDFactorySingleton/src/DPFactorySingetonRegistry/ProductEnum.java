package DPFactorySingetonRegistry;

public enum  ProductEnum {
    A("A"),
    B("B");

    private final String typeProduct;

    ProductEnum(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    @Override
    public String toString() {
        return typeProduct;
    }

}
