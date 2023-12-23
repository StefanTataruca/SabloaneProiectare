package com.example.sabloane;

import java.util.List;
import java.util.ArrayList;

public class Section implements BookComponent, Visitee {
    private String title;
    private List<BookComponent> components = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void add(BookComponent component) {
        components.add(component);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for (BookComponent component : components) {
            component.accept(visitor);
        }
    }

    public void print() {
        System.out.println(title);
        for (BookComponent component : components) {
            component.print();
        }
    }
}
