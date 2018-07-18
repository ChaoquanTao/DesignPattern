package Iterator;

public class BookShelf implements Aggregate {
    private String[] bookName  ;
    int last=0;

    public BookShelf(int maxsize){
        bookName = new String[maxsize] ;
    }

    public String[] getBookName() {
        return bookName;
    }

    public void setBookName(String[] bookName) {
        this.bookName = bookName;
    }

    public void addBook(String book){
        bookName[last]=book;
        last++ ;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
