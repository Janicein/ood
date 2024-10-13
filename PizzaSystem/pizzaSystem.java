import java.util.*;

/**
 * pizzaSystem
 */
public class pizzaSystem {

    double balance;
    pizzaSize currentSize;
    inventory inventory;
    HashSet<pizza> pizzaList;
    
    

    public pizzaSystem(){
        inventory = new inventory();
        pizzaList = new HashSet<>();

    }

    public double getBalance(){
        return this.balance;
    }

    public void select(pizza pizza){
        // pizza newPizza = new pizza(this);
    }

    public void addToCart(pizza pizza)
    {
        pizzaList.add(pizza);
        balance += pizza.balance;
    }

    public void removePizza(pizza pizza){
        pizzaList.remove(pizza);
        balance -= pizza.balance;
    }


    public void checkout(){
        //finish checkout;
        balance = 0;
        pizzaList.clear();
    }


    
}