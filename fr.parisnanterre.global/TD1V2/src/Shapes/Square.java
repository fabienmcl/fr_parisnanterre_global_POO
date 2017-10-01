package Shapes;

public class Square extends Rectangle{

    public Square(double length, double width) {
        if(length == width){
            System.out.println("erreur");
            return;
        }
        this.length = length;
        this.width = width;

    }
}
