package JacopoDeMaio.U5_W1_D2.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

// grazie a queste annotations importate tramite lombok evitiamo di scrivere + codice
public class Pizza extends Alimento {

//    ATTRIBUTI

    private String name;
// ogni pizza avrà 1 o + topping per questo gli passo come attributo una lista
    private List<Toppings> topping;

//    COSTRUTTORE

    public Pizza(double calorie, double prezzo, String name, List<Toppings> topping) {
        super(calorie, prezzo);
        this.name = name;
        this.topping = topping;
    }

// il toString lo faccio manuale perchè con il lombok non mi piace
    @Override
    public String toString() {
        return
                 name + '\'' +
                topping +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                "} " ;
    }
}
