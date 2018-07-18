package Visitor;

public class Test {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse() ;

        ComputerPartVisitorImp imp = new ComputerPartVisitorImp() ;

        keyboard.accept(imp);
        monitor.accept(imp);
        mouse.accept(imp);
    }
}
