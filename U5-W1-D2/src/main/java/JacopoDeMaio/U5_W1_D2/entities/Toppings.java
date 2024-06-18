package JacopoDeMaio.U5_W1_D2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Toppings extends Alimento {

//    ATTRIBUTI

    private String name;


    //    COSTRUTTORE

    public Toppings(String  name, double calorie, double prezzo) {
        super(calorie, prezzo);
        this.name = name;
    }

// toString fatto a mano
    @Override
    public String toString() {
        return
                 name +" " +
                 super.toString();
    }
}
