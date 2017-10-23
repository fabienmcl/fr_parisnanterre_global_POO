import DPFactorySingetonRegistry.Product;
import DPFactorySingetonRegistry.ProductEnum;
import DPFactorySingetonRegistry.SingletonFactory;
import ShapesFactoryTD1.Shape2D;
import ShapesFactoryTD1.Shape3D;
import ShapesFactoryTD1.ShapeEnum;
import ShapesFactoryTD1.ShapeFactory;


public class Client {
    public static void main (String [] args ) {
        ShapeFactory f = new ShapeFactory();
        Shape2D rectangle = (Shape2D) f.createShape();
        System.out.println(rectangle);

        /*
        Shape2D rectangle = f.createProduct2D(ShapeEnum.RECTANGLE);
        Shape3D sphere = f.createProduct3D(ShapeEnum.SPHERE);
        System.out.print(rectangle.surface());
        System.out.print(sphere.surface());
*/
    }


}
