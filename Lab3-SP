import java.util.ArrayList;
import java.util.List;

interface BookComponent {
    void print();
}
class Paragraph implements BookComponent {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }
}

class Image implements BookComponent {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Image with name: " + name);
    }
}

// Composite
class Section implements BookComponent {
    private String title;
    private List<BookComponent> components = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void add(BookComponent component) {
        components.add(component);
    }

    public void print() {
        System.out.println(title);
        for (BookComponent component : components) {
            component.print();
        }
    }
}

class Book implements BookComponent {
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

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");

        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));

        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));

        noapteBuna.print();
    }
}
