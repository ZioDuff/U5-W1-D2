package JacopoDeMaio.U5_W1_D2.configurations;

import JacopoDeMaio.U5_W1_D2.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration // <-- annotazione necessaria per stabilire il nostro "scatolone"
public class MenuConfiguration {

//    BEANS  <---- da qui faremo i nostri beans tramite l'apposita annotazione

//    TOPPINGS

//    ogni bean è unico e va a instanziare un oggetto ben definito

    @Bean
    public Toppings tomatoTopping(){
        return new Toppings("Tomato",500,0.99);
    }

    @Bean
    public Toppings cheeseTopping(){
        return new Toppings("Cheese", 92,0.69);
    }

    @Bean
    public Toppings hamTopping (){
        return new Toppings("Ham",35,0.99);
    }

    @Bean
    public Toppings onionsTopping(){
        return new Toppings("Onions",22,0.69);
    }

    @Bean
    public Toppings pineappleTopping(){
        return  new Toppings("Pineapple",24,0.79);
    }

    @Bean
    public Toppings salamiTopping(){
        return  new Toppings("Salami",86,0.99);
    }

//    DRINKS

    @Bean
    public Drink lemonadeDrink(){
        return  new Drink(128,1.29,"Lemonade");
    }

    @Bean
    public Drink waterDrink(){
        return  new Drink(0,1.29,"Water");
    }

    @Bean
    public Drink wineDrink(){
        return  new Drink(607,7.49,"Wine");
    }

//    PIZZA

//    qua facciamo il bean della classe pizza e ne creiamo uno per ogni pizza che vogliamo poi aggiungere, la nostra classe Pizza si aspetta una lista di toppings
    @Bean
    public Pizza margheritaPizza(){
//        quindi andiamo a creare una nuova lista e aggiungeremo un topping alla volta, questo è possibile grazie ai bean creati prima
        List<Toppings> margheritaToppings = new ArrayList<>();
        margheritaToppings.add(tomatoTopping());
        margheritaToppings.add(cheeseTopping());
        return  new Pizza(1104,4.99,"Pizza Margherita",margheritaToppings);
    }

    @Bean
    public PizzaXL margheritaPizzaXl(){
//        quindi andiamo a creare una nuova lista e aggiungeremo un topping alla volta, questo è possibile grazie ai bean creati prima
        List<Toppings> margheritaToppings = new ArrayList<>();
        margheritaToppings.add(tomatoTopping());
        margheritaToppings.add(cheeseTopping());
        return  new PizzaXL(1104,4.99,"Pizza Margherita",margheritaToppings);
    }

    @Bean
    public Pizza hawaiianPizza(){
        List<Toppings> hawaiianToppings = new ArrayList<>();
        hawaiianToppings.add(tomatoTopping());
        hawaiianToppings.add(cheeseTopping());
        hawaiianToppings.add(pineappleTopping());

        return  new Pizza(1024,6.49,"HAwaiian Pizza",hawaiianToppings);
    }

    @Bean
    public Pizza salamiPizza(){
        List<Toppings> salamiToppings = new ArrayList<>();
        salamiToppings.add(tomatoTopping());
        salamiToppings.add(cheeseTopping());
        salamiToppings.add(salamiTopping());

        return  new Pizza(1160,5.99,"Salami Pizza",salamiToppings);
    }

    @Bean
    public Pizza doppiaPizza(){
        List<Toppings> doppioToppings = new ArrayList<>();
        doppioToppings.add(tomatoTopping());
        doppioToppings.add(hamTopping());
        doppioToppings.add(hamTopping());

        return  new Pizza(1200,6.50,"Doppia Pizza", doppioToppings);
    }


//    MENU

//    unna volta creato tutto possiamo passare alla creazione del bean dell menu

//    come attributi sappiamo che il nostro menu vuole tre liste differenti

    @Bean
    @Primary // <--- qui provo l'annotazione primary --- ha una funzione di default
    public Menu menuBean(){
//        andiamo a creare le 3 liste differenti
        List<Pizza> pizzaList = new ArrayList<>();
        List<Toppings> toppingsList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();
// per ogni lista aggiungiamo quello che vogliamo grazie ai bean appena creati
        pizzaList.add(margheritaPizza());
        pizzaList.add(hawaiianPizza());
        pizzaList.add(salamiPizza());
        pizzaList.add(doppiaPizza());
        pizzaList.add(margheritaPizzaXl());

        toppingsList.add(tomatoTopping());
        toppingsList.add(hamTopping());
        toppingsList.add(onionsTopping());
        toppingsList.add(pineappleTopping());
        toppingsList.add(salamiTopping());

        drinkList.add(lemonadeDrink());
        drinkList.add(waterDrink());
        drinkList.add(wineDrink());

        return new Menu(toppingsList,pizzaList,drinkList);
    }

//    prova per capire il primary
    @Bean
    public Menu menu2(){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Toppings> toppingsList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();

        return new Menu(toppingsList,pizzaList,drinkList);
    }
}
