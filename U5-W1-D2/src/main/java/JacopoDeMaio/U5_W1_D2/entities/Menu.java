package JacopoDeMaio.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

//    ATTRIBUTI

//    il nostro menu avrà principalmente tre liste come richiesto dall'esercizio
    private List<Toppings> toppingsList;

    private List<Pizza> pizzaList;

    private List<Drink> drinksList;

//    COSTRUTTORE

//    METODI

//    metodo che andremo poi a richiamare per far stampare il a video il nostro menu
    public void getMenu(){
        System.out.println("-------MENU--------");
        System.out.println();
        System.out.println("----PIZZE----");
        System.out.println();
//        ogni lista deve stampare ogni elemento
        this.pizzaList.forEach(System.out::println);
        System.out.println();
        System.out.println("----TOPPINGS----");
        System.out.println();
        this.toppingsList.forEach(System.out::println);
        System.out.println();
        System.out.println("----DRINKS----");
        System.out.println();
        this.drinksList.forEach(System.out::println);

    }
}
