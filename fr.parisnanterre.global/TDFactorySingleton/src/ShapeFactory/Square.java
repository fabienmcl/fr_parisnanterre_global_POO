package ShapeFactory;

public class Square implements Shapes {
    static{
        ShapesFactory.registerShape ("Square" , new Square ());
    }
    @Override
    public Shapes createShape() {
        return new Square();
    }

    @Override
    public void move(int dx, int dY) {

    }
}
