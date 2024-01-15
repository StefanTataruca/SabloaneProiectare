public class ObserverUpdateToc implements Observer{
    Book b;
  public ObserverUpdateToc(Book b){this.b=b;}
    @Override

    public void update() {
        BookStatistics v = new BookStatistics();
        this.b.accept(v);


    }
}