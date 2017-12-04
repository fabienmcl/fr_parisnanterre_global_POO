package Base;

public class VisiteurOne implements Visitor {
    @Override
    public void visit(Bureau b) {
        System.out.println("je suis un bureau");
        for(Truc t : b.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(CollectionDeLivres collect) {
        System.out.println("je suis une collection de"+collect.getNbLivres()+" livres");
    }

    @Override
    public void visit(GardeRobe g) {
        System.out.println("je suis une garde de robes");
        for(Vetement v : g.vetements){
            v.accept(this);
            //this.visit(v);
        }
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
        System.out.println("je suis une Piece");
        for(Truc t : p.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(Vetement v) {
        System.out.println("je suis un vetements");
    }

    @Override
    public void visit(Univers u) {
        System.out.println("je suis un univers");
        for(Piece p : u.pieces){
            p.accept(this);
        }
    }
}
