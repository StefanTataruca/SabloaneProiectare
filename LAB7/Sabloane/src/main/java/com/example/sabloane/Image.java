package com.example.sabloane;

public class Image implements BookComponent, Visitee {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }

    public void print() {
        System.out.println("Image with name: " + name);
    }
}
