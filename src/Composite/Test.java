package Composite;

public class Test {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory bindDir = new Directory("bin") ;
        Directory tmpDir = new Directory("tmp") ;
        Directory usrDir = new Directory("usr") ;
        File file = new File("test",15000) ;

        rootDir.add(bindDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        rootDir.add(file);
        bindDir.add(new File("vi",10000));
        bindDir.add(new File("latex",20000));

        rootDir.printList(" ");
    }
}
