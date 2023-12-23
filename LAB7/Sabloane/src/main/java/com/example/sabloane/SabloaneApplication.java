package com.example.sabloane;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.sabloane.difexample.ClientComponent;
import com.example.sabloane.difexample.SingletonComponent;
import com.example.sabloane.difexample.TransientComponent;

@SpringBootApplication
public class SabloaneApplication {

    public static void main(String[] args) {

        SpringApplication.run(SabloaneApplication.class, args);


        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        Paragraph p2 = new Paragraph("Paragraph 2");
        Paragraph p3 = new Paragraph("Paragraph 3");
        Paragraph p4 = new Paragraph("Paragraph 4");

        // Adăugarea paragrafelor la secțiune
        cap1.add(p1);
        cap1.add(p2);
        cap1.add(p3);
        cap1.add(p4);

        // Afișarea fără aliniere
        System.out.println("Printing without Alignment\n");
        cap1.print();

        // Setarea alinierii și reafișarea
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println("\nPrinting with Alignment\n");
        cap1.print();
    }

}
