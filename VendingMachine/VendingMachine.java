import java.util.*;
public class VendingMachine {

    List<Item> ItemList;
    VendingState curState;
    inventory inventory;
    Item curItem;
    double balance;

    public VendingMachine(List<Item> ItemList){
        this.ItemList = ItemList;
        this.curState = VendingState.IDLE;
        this.inventory = new inventory();
    }

    public void fillStock(Item item, Integer quantity){
        inventory.fillStock(item, quantity);
    }

    public void removeItem(Item item){
        inventory.removeInventory(item);
    }

    public void selectItem(Item item){
        if(curState == VendingState.IDLE || curState == VendingState.SELECT){
            if(inventory.isAvailable(item)){
                System.out.println("The item is out of stock!");
                return;
            }
            curState = VendingState.SELECT;
            curItem = item;

        }else{
            System.out.println("You cannot select right now");
        }

    }

    public void collectPayment(coins coin){
        if(curState == VendingState.SELECT){
       
            if(coin == coins.QUARTER){
                balance += 0.25;
            }else{
                balance += 1;
            }

            if(balance < curItem.price){
                System.out.println("Insufficient payment, please insert value");
            }else if(balance >= curItem.price){
                curState = VendingState.COLLECT;
                transactPayment();
            }

        }else{
            System.out.println("Please select the item first.");
        }


    }

    public void changes(double amount){
        //return changes;

    }

    public void transactPayment(){

        curState = VendingState.TRANSACT;
        // balance = 0;
        dispenseItem();
        changes(balance - curItem.price);
        balance = 0;


    }

    public void dispenseItem(){
        inventory.dispenseOne(curItem);
        curItem = null;
        System.out.println("Item has been dispensed. Please collect below. ");
        curState = VendingState.IDLE;

        
    }

}
