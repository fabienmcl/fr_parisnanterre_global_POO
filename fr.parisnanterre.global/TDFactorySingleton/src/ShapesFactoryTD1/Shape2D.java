package ShapesFactoryTD1;

public abstract class Shape2D extends Shape implements Translatable2D {

    Point2D refPoint;

    @Override
    public Point2D getRefPoint() {
        return this.refPoint;
    }

    abstract double perimetrer();

}
