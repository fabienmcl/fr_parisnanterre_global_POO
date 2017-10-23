import DPFactorySingetonRegistry.Product;
import DPFactorySingetonRegistry.ProductEnum;
import DPFactorySingetonRegistry.SingletonFactory;


public class Client {
    public static void main (String [] args ) {
        SingletonFactory f = new SingletonFactory();
        Product p = f.createProduct(ProductEnum.A);
    }


}
