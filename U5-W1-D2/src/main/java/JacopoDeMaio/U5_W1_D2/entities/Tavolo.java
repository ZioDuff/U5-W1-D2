package JacopoDeMaio.U5_W1_D2.entities;

import JacopoDeMaio.U5_W1_D2.enums.Availability;
import JacopoDeMaio.U5_W1_D2.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter // <-- genero solo i getter di tutti gli attributi
@AllArgsConstructor
@ToString
public class Tavolo {

//    ATTRIBUTI
    private long id;
    @Setter // <-- specificando i setter su gli attributi posso escludere determinati attributi
    private int maxCoperti;
    @Setter
    private Availability availability;
    @Setter
    private double  seatCost;

//    COSTRUTTORE

//    METODI
    public void printTable(){
        System.out.println("Numero del tavolo: "+ this.id);
        System.out.println("Numero massimo di sedute: " + this.maxCoperti);
        System.out.println("Libero o occupato: "+ this.availability);
    }


}
