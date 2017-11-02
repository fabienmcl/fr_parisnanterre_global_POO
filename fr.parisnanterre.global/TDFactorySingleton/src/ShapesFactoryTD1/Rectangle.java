package ShapesFactoryTD1;

public class Rectangle extends Shape2D {
    static{
        ShapeFactory.registerProduct ( ShapeEnum.RECTANGLE, new Rectangle(4,8));
        ShapeFactory.registerProduct2D ( ShapeEnum.RECTANGLE, new Rectangle(4,8));
    }

    @Override
    public Shape2D createShape(){
        return new Rectangle(4,8);
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

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {

    }

    @Override
    public double surface() {
        return length*width;
    }

    @Override
    double perimetrer() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
