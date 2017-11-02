import DPFactorySingetonRegistry.Product;
import DPFactorySingetonRegistry.ProductEnum;
import DPFactorySingetonRegistry.SingletonFactory;
import ShapesFactoryTD1.*;


public class Client {
    public static void main (String [] args ) {
        ShapeFactory f = new ShapeFactory();
        /*
        Shape2D rectangle = f.createProduct2D(ShapeEnum.RECTANGLE);
        System.out.println("le rect :"+rectangle.toString());

        Shape2D square = f.createProduct2D(ShapeEnum.SQUARE);
        System.out.println("le carr :"+square.toString());

*/
        Shape2D r = (Rectangle) f.createShapeEnumBasic(ShapeEnum.RECTANGLE);
        Shape2D s = (Rectangle) f.createShapeEnumBasic(ShapeEnum.SQUARE);

        System.out.println("test creation basic rect : "+r.toString());
        System.out.println("test creation basic square : "+s.toString());


        f.printRegister();

    }


}
