import java.util.ArrayList;
import java.util.List;

public class Book {
	String title;
	List<String> paragraphs = new ArrayList<>();
	List<String> images = new ArrayList<>();
	List<String> tables = new ArrayList<>();
	
	public Book(String title) {
		this.title=title;
		
	};
	
	public void print(){
		System.out.println(title);
		System.out.println(paragraphs);
		System.out.println(images);
		System.out.println(tables);
	}
	
	 public void createNewParagraph(String paragraph) {
		 paragraphs.add(paragraph);
		 
	 }
	 
	 public void createNewImage(String image) {
		 images.add(image);
	 }
	 
	 public void createNewTable(String table) {
		 tables.add(table);
		 
	 }
}
