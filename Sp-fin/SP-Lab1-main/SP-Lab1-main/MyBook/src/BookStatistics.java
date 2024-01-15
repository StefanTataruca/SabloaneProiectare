
public class BookStatistics implements Visitor {
    private int books = 0;
    private int images = 0;
    private int tables = 0;
    private int imagesProxy = 0;
    private int paragraphs = 0;
  //  private int section = 0;
    private int tablesOfContents = 0;
    private int sections = 0;


    @Override
    public void visitBook(Book book) {
        this.books += 1;
    }

    @Override
    public void visitSection(Section section) {
        this.sections += 1;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        this.tablesOfContents += 1;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.paragraphs += 1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.images += 1;
    }

    @Override
    public void visitImage(Image image) {
        this.images += 1;
    }

    @Override
    public void visitTable(Table table) {
        this.tables += 1;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");



        System.out.printf("*** Number of images: %d\n",books);
        System.out.printf("*** Number of sections: %d\n",sections);
        System.out.printf("*** Number of images: %d\n",images);
        System.out.printf("*** Number of imagesProxy: %d\n",imagesProxy);
        System.out.printf("*** Number of tables: %d\n",tables);
        System.out.printf("*** Number of tablesOfContents: %d\n",tablesOfContents);
        System.out.printf("*** Number of paragraphs: %d\n",paragraphs);
    }
}