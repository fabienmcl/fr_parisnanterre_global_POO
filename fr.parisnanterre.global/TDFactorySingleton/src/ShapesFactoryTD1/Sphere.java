package ShapesFactoryTD1;

public class Sphere extends Shape3D {
    double radius;

    static{
        ShapeFactory.registerProduct ( ShapeEnum.SPHERE, new Sphere(0));
    }
    @Override
    Shape createShape (){
        return new Sphere(0);
    }
    @Override
    double surface() {
        return 0;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double volume() {
        return 0;
    }
}
