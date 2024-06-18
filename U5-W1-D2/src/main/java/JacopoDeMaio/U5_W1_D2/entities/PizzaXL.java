package JacopoDeMaio.U5_W1_D2.entities;



import JacopoDeMaio.U5_W1_D2.enums.Size;

import java.util.List;

public class PizzaXL extends Pizza{

    private Size size ;

    public PizzaXL(double calorie, double prezzo, String name, List<Toppings> topping ) {
        super(calorie*2, prezzo*2, name, topping);
        this.size= Size.XL;

    }

    @Override
    public String toString() {
        return "PizzaXL{" +
                "size=" + size +
                "} " + super.toString();
    }
}
