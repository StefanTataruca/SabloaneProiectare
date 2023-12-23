package com.example.sabloane;

public class Image implements BookComponent {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Image with name: " + name);
    }
}
