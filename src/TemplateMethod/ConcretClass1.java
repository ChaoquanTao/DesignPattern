package TemplateMethod;

public class ConcretClass1 extends AbstractClass {
    @Override
    public void initialize() {
        System.out.println("this is initialize 1");
    }

    @Override
    public void run() {
        System.out.println("this is run 1");
    }

    @Override
    public void end() {
        System.out.println("this is end 1");
    }
}
