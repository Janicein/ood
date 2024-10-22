import java.util.*;
public class Parcel {


    String id;
    Boolean isDelivered;
    Boolean isPickedUp;
    List<String> items;
    Order order;
    int length;
    int height;
    int width;

    public Parcel(String id, int length, int height, int width , List<String> items, Order order){

        this.id = id;
        this.height = height;
        this.length = length;
        this.width = width;
        this.items = items;
        this.order = order;
        this.isDelivered = false;
        this.isPickedUp = false;
    }

    public String getEmail(){
        return order.email;
    }
    
}
