package Base;

public class VisiteurTwo implements Visitor {
    private int nb;

    public VisiteurTwo(){
        this.nb=0;
    }

    public Object value(){
        return nb;
    }

    @Override
    public void visit(Bureau b) {
        for(Truc t : b.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(CollectionDeLivres collect) {
        nb+=collect.getNbLivres();
    }

    @Override
    public void visit(GardeRobe g) {
        for (Vetement v : g.vetements){
            v.accept(this);
        }
    }

    @Override
    public void visit(Lamp l) {
        nb++;
    }

    @Override
    public void visit(Lit l) {
        nb++;
    }

    @Override
    public void visit(Piece p) {
        for(Truc t: p.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(Vetement v) {
        nb++;
    }

    @Override
    public void visit(Univers u) {
        for(Piece p: u.pieces){
            p.accept(this);
        }
    }
}
