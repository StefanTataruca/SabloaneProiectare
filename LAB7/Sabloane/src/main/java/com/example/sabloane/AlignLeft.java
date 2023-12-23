package com.example.sabloane;

public class AlignLeft implements AlignStrategy, Visitee {
    public String align(String text) {
        return "Left-aligned: " + text;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitAlignLeft(this);
    }
}