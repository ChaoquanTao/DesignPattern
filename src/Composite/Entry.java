package Composite;

public abstract class Entry {
    public abstract String getName() ;
    public abstract int getSize();
    public abstract void printList(String prefix) ;
    public String toString(){
        return getName() + "(" + getSize() + ")" ;
    }
}
