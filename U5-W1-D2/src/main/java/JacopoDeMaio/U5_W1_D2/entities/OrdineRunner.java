package JacopoDeMaio.U5_W1_D2.entities;

import JacopoDeMaio.U5_W1_D2.U5W1D2Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component // <--- diciamo a spring di gestire la classe come componente dentro la nostra app
public class OrdineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
//        creiamo il nostro "scatolone magico"
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D2Application.class);

        Menu menu = ctx.getBean(Menu.class);

        menu.getMenu(); // <-- vado prendere il bean del menu in questo caso non genera errore nonostante siamo due poiche uno presenta il primary

        Tavolo t1 = (Tavolo) ctx.getBean("Tavolo1"); // <-- qui richiamo il bean del tavolo tramite il suo nome , questo è utile nel caso avessimo + bean della stessa classe

        Ordine ordine = new Ordine(4,t1); // <-- istanziamo il nostro ordine

        ordine.addAlimento(ctx.getBean("margherita", Pizza.class)); // <-- gli aggiungiamo alla lista tramite il metodo un alimento (possiamo passare qualsiasi alimento grazie al polimorfismo)

        System.out.println(ordine);

        System.out.println(ordine.getTotale()); // <-- tramite questo metodo abbiamo il risultato totale del nostro ordine compreso il costo di ogni alimento e del coperto


        ctx.close();
    }
}
