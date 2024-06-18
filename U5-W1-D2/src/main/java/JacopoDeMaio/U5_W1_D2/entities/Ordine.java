package JacopoDeMaio.U5_W1_D2.entities;

import JacopoDeMaio.U5_W1_D2.enums.State;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@ToString
public class Ordine {

//    ATTRIBUTI

    private long id;

    private State stato;

    private int numeroCoperti;

    private LocalDateTime oraAcquisizione;

    private List<Alimento> listaOrdine;

    private Tavolo tavolo;

//    COSTRUTTORE

    public Ordine(int numeroCoperti, Tavolo tavolo){
        Random rndm = new Random();
        this.id = rndm.nextInt(1,20); // <--- id random per ogni ordine
        this.stato = State.IN_CORSO; // <-- inizializzo ogni ordine IN_CORSO poi tramite setter si puo cambiare
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione= LocalDateTime.now();
        this.listaOrdine= new ArrayList<>(); // <--- gli passo una lista in modo da poter inserire ogni alimento tramite il metodo addAlimento
        this.tavolo= tavolo; // <-- siccome ogni ordine corrisponde ad un tavolo glie lo passo come parametro
    }

//    METODI

    public void addAlimento(Alimento alimento){
        this.listaOrdine.add(alimento);
    }


//  metodo per il totale del costo del tavolo ovvero il totale dell'ordine e il totale del coperto per numero di partecipanti
    public double getTotale(){
        return this.listaOrdine.stream().mapToDouble(Alimento::getPrezzo).sum() + (this.tavolo.getSeatCost()* this.numeroCoperti) ;
    }
}
