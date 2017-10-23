package ShapesFactoryTD1;

public class Point3D extends Point2D {
    double z;

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void translate(double a, double b) {

    }

    public boolean isOrigin() {
        return x == 0 && y == 0 ? true : false;
    }

    public double distance(Point2D autre) {
        return (autre.getY() - this.y) / (autre.getX() - this.x);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;

    }

    @Override
    public void setY(double y) {
        super.setY(y);
    }

    @Override
    public void setX(double x) {
        super.setX(x);
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public double getX() {
        return super.getX();
    }
}
