import java.util.HashMap;

public class inventory {

    private HashMap<Item,Integer> stock;
    
    public inventory(){
        this.stock = new HashMap<>();
    }

    public void fillStock(Item item, Integer quantity){
        stock.put(item, stock.getOrDefault(item, 0) + quantity);
    }

    public boolean dispenseOne(Item item){
        if(isAvailable(item)){
            stock.put(item, stock.get(item) - 1);
            return true;
        }

        return false;
    }

    public boolean isAvailable(Item item){
        if(stock.get(item) >= 1) return true;
        return false;
    }
    
    public void removeInventory(Item item){
        stock.remove(item);

    }
}
