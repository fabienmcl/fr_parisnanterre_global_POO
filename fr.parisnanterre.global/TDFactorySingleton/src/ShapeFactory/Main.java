package ShapeFactory;

public class Main {

    static { // Fo r c e r c e t t e i n i t i a l i s a t i o n au lanc ement du programme
        try {
            Class.forName ("shapes.Circle");
            Class.forName ("shapes.Square");
        }catch ( ClassNotFoundException any) {
            any. printStackTrace ();
        }
    }/*
    public static  void main ( String [] args ) {
        Sheet sh = new Sheet ();
        hapesFactory instance = ShapesFactory . getInstance ();
        sh.add( instance . createShape (" Circle"));
        sh.add( instance . createShape ("Square"));
        sh. drawAll ();
    }*/
}
