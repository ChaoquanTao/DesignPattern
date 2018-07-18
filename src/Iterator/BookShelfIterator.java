package Iterator;

public class BookShelfIterator implements Iterator {
    BookShelf bookShelf;
    int index ;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf ;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getBookName().length ? true : false;
    }

    @Override
    public Object next() {
        String book = bookShelf.getBookName()[index] ;
        index++ ;
        return book;
    }
}
