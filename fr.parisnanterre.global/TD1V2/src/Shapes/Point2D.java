package Shapes;

public class Point2D {

    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void translate(double a, double b){

    }
    public boolean isOrigin(){
        return x==0 && y==0 ? true:false;
    }
    public double distance(Point2D autre){
        return (autre.getY()-this.y)/(autre.getX()-this.x);
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }

    public double getX() {

        return x;
    }
}
