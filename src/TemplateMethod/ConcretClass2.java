package TemplateMethod;

public class ConcretClass2 extends AbstractClass {
    @Override
    public void initialize() {
        System.out.println("this is initialize 2");
    }

    @Override
    public void run() {
        System.out.println("this is run 2");
    }

    @Override
    public void end() {
        System.out.println("this is end 2");
    }
}
