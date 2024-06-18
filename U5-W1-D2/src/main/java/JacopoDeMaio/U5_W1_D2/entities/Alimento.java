package JacopoDeMaio.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
// classe padre con attributi comuni a tutti
public abstract class Alimento {

//    ATTRIBUTI

    protected double calorie;

    protected double prezzo;


    @Override
    public String toString() {
        return
                "calorie=" + calorie +
                ", prezzo=" + prezzo ;
    }
}
