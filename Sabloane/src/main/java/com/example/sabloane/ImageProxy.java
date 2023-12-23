package com.example.sabloane;

public class ImageProxy implements BookComponent {
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
