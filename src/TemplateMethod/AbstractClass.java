package TemplateMethod;

public abstract class AbstractClass {
    public abstract void initialize() ;
    public abstract void run() ;
    public abstract void end() ;
    public final void template(){
        initialize();
        run();
        end();
    }

}
