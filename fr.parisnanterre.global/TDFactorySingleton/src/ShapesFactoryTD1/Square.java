package ShapesFactoryTD1;

public class Square extends Rectangle {
    static{
        ShapeFactory.registerProduct ( ShapeEnum.SQUARE, new Square(0,0));
    }
    @Override
    Shape createShape (){
        return new Square(0,0);
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
