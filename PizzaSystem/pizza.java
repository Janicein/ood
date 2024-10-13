import java.util.HashMap;

public class pizza {

    String name;
    pizzaBase curBase;
    pizzaSystem sys;
    HashMap<topping, Integer> toppingMap;
    double balance;

    public pizza(pizzaSystem sys)
    {
        this.sys = sys;
        this.toppingMap = new HashMap<>();

    }

    public void selectSize(pizzaSize s){
        if(curBase != null){
            balance -= curBase.getPrice();
        }
        curBase = s;
        balance += curBase.getPrice();
    }

    public void addTopping(topping top){
        if(sys.inventory.isAvailable(top) == false){
            System.out.println("The topping is out of stock");
            return;
        }
        toppingMap.put(top, toppingMap.getOrDefault(top, 0) + 1);
        sys.inventory.takeOne(top);
        balance += top.getPrice();
    }

    public void removeTopping(topping top){
        if(!toppingMap.containsKey(top)){
            System.out.println("You did not select this topping");
            return;
        }

        int count = toppingMap.get(top);
        balance -= top.getPrice() * count;
        sys.inventory.restock(top, count);
        toppingMap.remove(top);


    }

    public void minusOneTopping(topping top){
        if(!toppingMap.containsKey(top)){
            System.out.println("You did not select this topping");
            return;
        }
        balance -= top.getPrice();
        sys.inventory.restock(top, 1);
        toppingMap.put(top, toppingMap.get(top) - 1);

    }

    public void addToCart(){
        sys.addToCart(this);
    }
    
}
