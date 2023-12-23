package com.example.sabloane;

public class ImageProxy implements BookComponent, Visitee {
    private Image realImage;
    private String name;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        if (realImage == null) {
            realImage = new Image(name);
        }
        realImage.accept(visitor);
    }

    public void print() {
        if (realImage == null) {
            realImage = new Image(name);
        }
        realImage.print();
    }
}
