import java.util.ArrayList;

public class Chapter {
    private String name;
    ArrayList<SubChapter> subchapters=new ArrayList<SubChapter>();
    Chapter(String name){
this.name=name;
    }
    public int createSubChapter(String subchapterName){
        subchapters.add(new SubChapter(subchapterName));
        return subchapters.size()-1;
    }

    public SubChapter getSubChapter(int subchapterIndex){return this.subchapters.get(subchapterIndex);}
public void print(){
        System.out.println("Chapter: "+ name);

        for(SubChapter sc: subchapters){
            sc.print();
        }
}
}
