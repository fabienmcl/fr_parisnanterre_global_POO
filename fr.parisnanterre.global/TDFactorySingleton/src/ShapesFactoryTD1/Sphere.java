package ShapesFactoryTD1;

public class Sphere extends Shape3D {
    double radius;

    static{
        ShapeFactory.registerProduct ( ShapeEnum.SPHERE, new Sphere(5));
    }
    @Override
    public Shape3D createShape(){
        return new Sphere(5);
    }
    @Override
    public double surface() {
        return 4*3.14*(radius*radius);
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double volume() {
        return  ((4*3.14)/3)*(radius*radius*radius);
    }
}
