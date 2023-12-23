package com.example.sabloane;

public class AlignRight implements AlignStrategy, Visitee{
    public String align(String text) {
        return "Right-aligned: " + text;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitAlignRight(this);
    }
}
