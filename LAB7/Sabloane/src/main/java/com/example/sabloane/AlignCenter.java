package com.example.sabloane;

public class AlignCenter implements AlignStrategy, Visitee {

    @Override
    public String align(String text) {
        return "Center-aligned: " + text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAlignCenter(this);
    }
}
