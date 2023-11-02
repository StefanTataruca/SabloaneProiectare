import java.util.ArrayList;
import java.util.List;

interface AlignStrategy {
    String align(String text);
}

class AlignCenter implements AlignStrategy {
    public String align(String text) {
        return "Center-aligned: " + text;
    }
}

class AlignLeft implements AlignStrategy {
    public String align(String text) {
        return "Left-aligned: " + text;
    }
}

class AlignRight implements AlignStrategy {
    public String align(String text) {
        return "Right-aligned: " + text;
    }
}

interface BookComponent {
    void print();
}

class Paragraph implements BookComponent {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        alignStrategy = strategy;
    }

    public void print() {
        System.out.println(alignStrategy != null ? alignStrategy.align(text) : text);
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

class ImageProxy implements BookComponent {
    private Image realImage;
    private String name;

    public ImageProxy(String name) {
        this.name = name;
    }

    public void print() {
        if (realImage == null) {
            realImage = new Image(name);
        }
        realImage.print();
    }
}

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
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        Paragraph p2 = new Paragraph("Paragraph 2");
        Paragraph p3 = new Paragraph("Paragraph 3");
        Paragraph p4 = new Paragraph("Paragraph 4");

        cap1.add(p1);
        cap1.add(p2);
        cap1.add(p3);
        cap1.add(p4);

        System.out.println("Printing without Alignment\n");
        cap1.print();

        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println("\nPrinting with Alignment\n");
        cap1.print();
    }
}
