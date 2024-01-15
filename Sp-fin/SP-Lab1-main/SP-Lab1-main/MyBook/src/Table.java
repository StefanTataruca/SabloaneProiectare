
public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }


    @Override
    public void print(){
        System.out.println("Table with Title: "+title);
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
        visitor.visitTable(this);
    }
}
