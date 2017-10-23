package ShapesFactoryTD1;

public class Cuboid extends Shape3D {
    static{
        ShapeFactory.registerProduct ( ShapeEnum.CUBOID, new Cuboid(0,0,0));
    }
    @Override
    Shape createShape (){
        return new Cuboid(0,0,0);
    }

    @Override
    double volume() {
        return 0;
    }

    @Override
    double surface() {
        return 0;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double length;
    double width;
    double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
