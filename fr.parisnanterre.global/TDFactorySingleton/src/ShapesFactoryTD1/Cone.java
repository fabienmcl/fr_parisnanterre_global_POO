package ShapesFactoryTD1;

public class Cone extends Shape3D {

    static{
        ShapeFactory.registerProduct ( ShapeEnum.CONE, new Cone(1,3));
    }
    @Override
    double volume() {
        return 0;
    }

    @Override
    public double surface() {
        return 0;
    }

    double height;
    double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public Shape3D createShape(){
        return new Cone(1,3);
    }
}
