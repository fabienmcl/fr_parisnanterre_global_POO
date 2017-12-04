package Base;

public class VisiteurOne implements Visitor {
    @Override
    public void visit(Bureau b) {
        System.out.println("-Bureau :");
    }

    @Override
    public void visit(CollectionDeLivres collect) {
        System.out.println("je suis une collection de"collec+" livres");
    }

    @Override
    public void visit(GardeRobe g) {
        System.out.println("je suis une garde robe");
    }

    @Override
    public void visit(Lamp l) {
        System.out.println("je suis une lampe");
    }

    @Override
    public void visit(Lit l) {
        System.out.println("je suis un lit");
    }

    @Override
    public void visit(Piece p) {

    }

    @Override
    public void visit(Vetement v) {
        System.out.println("je suis un vetements");
    }

    @Override
    public void visit(Univers u) {

    }
}
