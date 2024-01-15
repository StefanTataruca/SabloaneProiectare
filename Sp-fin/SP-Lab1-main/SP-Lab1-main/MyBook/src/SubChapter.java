import java.util.ArrayList;

public class SubChapter {
    private String name;
    ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
    ArrayList<Image> images = new ArrayList<Image>();
    ArrayList<Table> tables = new ArrayList<Table>();
    SubChapter(String name){
        this.name=name;
    }
    public int createNewParagraph(String sparagraphName){
        paragraphs.add(new Paragraph(sparagraphName));
        return paragraphs.size()-1;
    }

    public Paragraph getParagraph(int paragraphIndex){return this.paragraphs.get(paragraphIndex);}


    public int createNewImage(String name){
        images.add(new Image(name));
        return images.size()-1;
    }

    public Image getImage(int index){return this.images.get(index);}

    public int createNewTable(String name){
        tables.add(new Table(name));
        return tables.size()-1;
    }

    public Table getTable(int index){return this.tables.get(index);}
    public void print(){
        System.out.println("Subchapter: "+ name);
        for(Paragraph p : paragraphs){p.print();}
        for(Image i : images){i.print();}
        for(Table t : tables){t.print();}
    }
}


