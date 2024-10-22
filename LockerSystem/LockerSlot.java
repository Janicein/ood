public class LockerSlot {

    
    String id;
    boolean isOccupid = false;
    Parcel curParcel = null;
    LockerSize lockerSize;
    LockerSet lockerSet;
    public LockerSlot(String id, LockerSize lockerSize, LockerSet lockerSet){

        this.id = id;
        this.lockerSize = lockerSize;
        this.lockerSet = lockerSet;
    }

    public void occupyParcel(Parcel parcel){
        opendoor();
        isOccupid = true;
        curParcel = parcel;

    }

    public void releaseParcel(){
        opendoor();
        isOccupid = false;
        curParcel = null;
    }

    public void opendoor(){
        //open the door
    }


    
}
