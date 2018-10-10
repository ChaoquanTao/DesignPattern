package TemplateMethod;

public class Test {
    public static void main(String[] args) {
        AbstractClass c1 = new ConcretClass1() ;
        ConcretClass2 c2 = new ConcretClass2() ;

        c1.run();
        System.out.println("----------");
        c2.template();
    }
}
