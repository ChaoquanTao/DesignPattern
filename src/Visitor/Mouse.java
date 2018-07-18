package Visitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
