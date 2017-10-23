package ShapesFactoryTD1;

public class Cone extends Shape3D {

    static{
        ShapeFactory.registerProduct ( ShapeEnum.CONE, new Cone(0,0));
    }
    @Override
    double volume() {
        return 0;
    }

    @Override
    double surface() {
        return 0;
    }

    double height;
    double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    @Override
    Shape createShape (){
        return new Cone(0,0);
    }
}
