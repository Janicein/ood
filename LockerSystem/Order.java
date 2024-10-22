import java.util.*;
public class Order {
    String orderId;
    List<String> items;
    List<Parcel> parcelList;
    String email;
    String address;

    public Order(String orderId, List<String> items, String email, String address){
        this.orderId = orderId;
        this.items = items;
        this.email = email;
        this.address = address;
        this.parcelList = new ArrayList<>();
    }

    public void createParcel(String parcelId, int length, int height, int width, List<String> items){
        Parcel curParcel = new Parcel(parcelId, length, height, width, items, this);
        parcelList.add(curParcel);
    }
    
}
