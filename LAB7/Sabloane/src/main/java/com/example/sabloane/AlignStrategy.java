package com.example.sabloane;

public interface AlignStrategy {
    String align(String text);

    void accept(Visitor visitor);
}
