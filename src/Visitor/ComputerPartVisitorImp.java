package Visitor;

public class ComputerPartVisitorImp implements ComputerPartVisitor {


    @Override
    public void visit(ComputerPart computerPart) {
        System.out.println("visit "+computerPart.getClass());
    }
}
