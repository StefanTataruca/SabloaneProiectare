import java.util.concurrent.TimeUnit;
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
        try {
            TimeUnit.SECONDS.sleep(5); // Simulate loading a huge image with a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Pamela Anderson");
        ImageProxy img2 = new ImageProxy("Kim Kardashian");
        ImageProxy img3 = new ImageProxy("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of section 1 took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing section 1 again took " + (endTime - startTime) + " milliseconds");
    }
}
