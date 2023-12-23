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

        //
// Run this main function and inspect the output console
// to learn about
// the lifecycle of objects within
// Spring Dependency Injection Context
//
// Gets a handle of dependency injection context
        ApplicationContext context =
                SpringApplication.run(SabloaneApplication.class, args);
// Gets an instance of TransientComponent from the DI context
        TransientComponent transientBean =
                context.getBean(TransientComponent.class);
        transientBean.operation();
// Note that every time an instance is required,
// the DI context creates a new one
        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();
// Gets an instance of SingletonComponent from the DI context
// Note that the unique instance was created while
// application was loaded, before creating
// the transient instances
        SingletonComponent singletonBean =
                context.getBean(SingletonComponent.class);
        singletonBean.operation();
// Note that every time an instance is required,
// the DI returns the same unique one
        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();
// Gets an instance of another class that
// requires singleton/transient components
// Note where this instance was created and what beans
// were used to initialize it
        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();
// One can also request an instance from DI context by name
        c = (ClientComponent)context.getBean("clientComponent");
        c.operation();


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
