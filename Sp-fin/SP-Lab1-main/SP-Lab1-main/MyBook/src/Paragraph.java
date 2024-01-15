

public class Paragraph implements Element{
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.alignStrategy=null;
        this.text = text;
    }
    @Override
    public void print(){
        System.out.print("Paragraph: ");
        if(alignStrategy != null){
            alignStrategy.render(text);
        }else{
            System.out.println(text);
        }

    }

    public void add(Element e){
    }
    public void remove(Element e){
    }
    public Element get(int index){
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
    public String getText(){
        return text;
    }
    public void setAlignStrategy(AlignStrategy strategy){
        this.alignStrategy = strategy;
    }
}
