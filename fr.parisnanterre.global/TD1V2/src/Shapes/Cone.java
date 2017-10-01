package Shapes;

public class Cone extends Shape3D{
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
}
