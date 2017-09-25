package TD1Shapes;

public abstract class Shape3D extends Shape implements Translatable3D {
    Point3D refPoint;
    @Override
    public Point3D getRefPoint() {
        return refPoint;
    }
    abstract double volume();
}
