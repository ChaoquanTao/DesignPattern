package Iterator;

public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5) ;
        bookShelf.addBook("think in Java");
        bookShelf.addBook("Java入门123");
        bookShelf.addBook("疯狂Java讲义");

        Iterator it = bookShelf.iterator() ;
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
