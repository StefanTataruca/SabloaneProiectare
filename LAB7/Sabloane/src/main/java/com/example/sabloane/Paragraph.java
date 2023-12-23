package com.example.sabloane;

public class Paragraph implements BookComponent, Visitee {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        alignStrategy = strategy;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    public void print() {
        System.out.println(alignStrategy != null ? alignStrategy.align(text) : text);
    }
}
