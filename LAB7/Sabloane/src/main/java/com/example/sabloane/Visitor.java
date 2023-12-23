package com.example.sabloane;

public interface Visitor {
    void visitParagraph(Paragraph paragraph);
    void visitImage(Image image);
    void visitSection(Section section);
    void visitBook(Book book);
    void visitAlignCenter(AlignCenter alignCenter);
    void visitAlignLeft(AlignLeft alignLeft);
    void visitAlignRight(AlignRight alignRight);
}
