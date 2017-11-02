package ShapesFactoryTD1;


import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    static Map<ShapeEnum, Shape> registry = new HashMap<ShapeEnum, Shape>();

    static Map<ShapeEnum, Shape2D> registry2D = new HashMap<ShapeEnum, Shape2D>();
    static Map<ShapeEnum, Shape3D> registry3D = new HashMap<ShapeEnum, Shape3D>();


    public static void registerProduct(ShapeEnum e, Shape s) {
        registry.put(e, s);
    }
    public static void registerProduct2D(ShapeEnum e, Shape2D s) {
        registry2D.put(e, s);
    }

    public Shape createShape(){
        return registry.get(ShapeEnum.RECTANGLE);
    }


    public Shape2D createProduct2D(ShapeEnum s) {
        return registry2D.get(s);
    }

    public Shape3D createShape3D(ShapeEnum s){
        return registry3D.get(s);
    }

    public Shape createShapeEnumBasic(ShapeEnum e){
        return createShapeBasic(e.toString());
    }
    public Shape createShapeBasic(String sh){
        switch(sh){
            case "cone":
                return new Cone(1,1);
            case "cuboid":
                return new Cuboid(1,1,1);
            case "rectangle":
                return new Rectangle(1,1);
            case "sphere":
                return new Sphere(1);
            case "square":
                return new Square(1,1);
            default: return null;
        }
    }

    public Shape3D createProduct3D(ShapeEnum s) {
        return (Shape3D) registry.get(s).createShape();
    }

    public void printRegister(){
        System.out.println("la taille du registre shape : "+registry.size());
        System.out.println("la taille du registre shape2D : "+registry2D.size());

        //win
        System.out.println("Premiere creation shape via registery et enum: "+registry2D.get(ShapeEnum.RECTANGLE));
        Shape2D r = registry2D.get(ShapeEnum.RECTANGLE);
        System.out.println(r.toString());
        System.out.println("step ok pour rectangle");


        System.out.println("registery : "+registry);
        System.out.println("registery2D : "+registry2D);

        /*for(int i=0;i<registry.size();i++){
            System.out.println(registry.get(i).toString());
        }*/
    }
}
