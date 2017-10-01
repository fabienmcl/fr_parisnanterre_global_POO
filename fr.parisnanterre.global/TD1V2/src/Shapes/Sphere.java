package Shapes;

public class Sphere extends Shape3D{
    double radius;

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
