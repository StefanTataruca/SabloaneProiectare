import java.util.List;
import java.util.ArrayList;

public class Book implements BookComponent {
    private String title;
    private List<BookComponent> components = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(BookComponent component) {
        components.add(component);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        for (BookComponent component : components) {
            component.print();
        }
    }
}
