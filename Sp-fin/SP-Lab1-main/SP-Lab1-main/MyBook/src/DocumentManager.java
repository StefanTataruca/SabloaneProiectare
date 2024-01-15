public class DocumentManager {
    private DocumentManager() {

    }
    private static DocumentManager instance = null;
    private Book book=null;
    public void setBook(Book book){
        this.book=book;
    }

    public Book getBook() {
        return book;
    }


    public static DocumentManager getInstance()
    {
        if (instance == null)
            instance = new DocumentManager();

        return instance;
    }

}



