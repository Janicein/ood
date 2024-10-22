import java.util.*;
public class LockerSet {

    int total_spot;
    int available_spot;
    List<LockerSlot> lst;
    int space;

    public LockerSet(int total_spot, List<LockerSlot> lst, int space){
        this.available_spot = total_spot;
        this.total_spot = total_spot;
        this.lst = lst;
        this.space = space;

    }

    public boolean isFull(){
        return available_spot > 0;
    }

    public LockerSlot assignSlot(){
        LockerSlot cur = null;
        for(LockerSlot i : lst){
            if(i.isOccupid == false){
                available_spot--;
                cur = i;
                break;
            }
        }
        return cur;
    }
    
}
