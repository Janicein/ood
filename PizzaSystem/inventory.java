import java.util.*;
public class inventory {

    HashMap<topping, Integer> stock;

    public inventory(){
        this.stock = new HashMap<>();
    }


    public boolean isAvailable(topping top){
        if(stock.get(top) >= 1) return true;
        return false;
    }

    public void fillstock(topping top, Integer count){
        stock.put(top, stock.getOrDefault(top, 0) + count);
    }

    public void takeOne(topping top){
        stock.put(top, stock.get(top) - 1);
    }

    public void restock(topping top, int count){
        stock.put(top, stock.get(top) + count);
    }


    
}
