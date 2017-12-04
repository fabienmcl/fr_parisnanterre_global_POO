package Base;

import java.awt.*;

public interface Visitor {

    void visit(Bureau b);
    void visit(CollectionDeLivres collect);
    void visit(GardeRobe g);
    void visit(Lamp l);
    void visit(Lit l);
    void visit(Piece p);
    void visit(Vetement v);
    void visit(Univers u);
}
