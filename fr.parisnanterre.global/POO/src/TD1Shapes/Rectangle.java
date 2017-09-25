package TD1Shapes;

public class Rectangle extends Shape2D{

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
    public Rectangle(){

    }

    @Override
    double surface() {
        return 0;
    }

    @Override
    double perimetrer() {
        return 0;
    }
}
