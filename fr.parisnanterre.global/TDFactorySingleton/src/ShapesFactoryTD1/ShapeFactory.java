package ShapesFactoryTD1;


import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<ShapeEnum, Shape> registry = new HashMap<ShapeEnum, Shape>();

    public static void registerProduct(ShapeEnum e, Shape s) {
        registry.put(e, s);
    }

    public Shape2D createProduct2D(Shape2D s) {
        return (Shape2D) registry.get(s).createShape();
    }

    public Shape3D createProduct3D(Shape3D s) {
        return (Shape3D) registry.get(s).createShape();
    }
}
