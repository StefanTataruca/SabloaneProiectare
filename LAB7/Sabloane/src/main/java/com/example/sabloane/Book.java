package com.example.sabloane;

import java.util.List;
import java.util.ArrayList;

public class Book implements BookComponent, Visitee {

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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        for (BookComponent component : components) {
            component.accept(visitor);
        }
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
