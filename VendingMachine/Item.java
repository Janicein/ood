import java.util.*;
public class Item {

    int itemId;
    String itemName;
    double price;

    public Item(int itemId, String itemName, double price){
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }


    public int getItemId(){
        return itemId;
    }

    public String getItemName(){
        return itemName;
    }


    public double getPrice(){
        return price;
    }
    
}
