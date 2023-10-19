import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String chapterTitle) {
        Chapter chapter = new Chapter(chapterTitle);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }
}

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }
}

class Chapter {
    private String title;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String title) {
        this.title = title;
    }

    public int createSubChapter(String subChapterTitle) {
        SubChapter subChapter = new SubChapter(subChapterTitle);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }
}

class SubChapter {
    private String title;
    private List<Content> contents = new ArrayList<>();

    public SubChapter(String title) {
        this.title = title;
    }

    public void createNewParagraph(String text) {
        contents.add(new Paragraph(text));
    }

    public void createNewImage(String name) {
        contents.add(new Image(name));
    }

    public void createNewTable(String name) {
        contents.add(new Table(name));
    }

    public void print() {
        System.out.println("SubChapter: " + title);
        for (Content content : contents) {
            content.print();
        }
    }
}

interface Content {
    void print();
}

class Paragraph implements Content {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }
}

class Image implements Content {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Image: " + name);
    }
}

class Table implements Content {
    private String name;

    public Table(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Table: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author author = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(author);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");
        scOneOne.print();
    }
}