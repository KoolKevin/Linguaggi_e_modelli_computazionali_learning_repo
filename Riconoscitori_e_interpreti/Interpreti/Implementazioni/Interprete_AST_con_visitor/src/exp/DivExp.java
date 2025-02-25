package exp;

import visitor.*;

public class DivExp extends OpExp {
    public DivExp(Exp l, Exp r) {
        super(l,r);
    }
    
    public String myOp() {
        return "/";
    }

    public void accept( ExpVisitor v) {
        v.visit(this);
    }
}