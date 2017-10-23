package ShapesFactoryTD1;

public class Square extends Rectangle {
    static{
        ShapeFactory.registerProduct ( ShapeEnum.SQUARE, new Square(4,4));
    }

    @Override
    public Shape2D createShape (){
        return new Square(4,4);
    }
    public Square(double length, double width) {
        if (length == width) {
            System.out.println("erreur");
            return;
        }
        this.length = length;
        this.width = width;

    }
}
