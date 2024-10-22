import java.util.*;
public class OTP {

    HashMap<String, LockerSlot> mp;

    public OTP(){
        this.mp = new HashMap<>();
    }


    public boolean codeExist(String curCode){
        return mp.containsKey(curCode);
    }

    public LockerSlot getSlot(String curCode){
        return mp.get(curCode);

    }

    public void delivered_notification(LockerSlot lockerslot, Parcel parcel){
        String code = generateCode(parcel.getEmail());
        mp.put(code, lockerslot);
    }

    public void pickup_recipt(String curCode, Parcel parcel){
        sendRecipt(parcel.getEmail());
        mp.remove(curCode);
        

        //send receipt to parcel email;
    }



    public String generateCode(String email){
        //trigger code to the input email address;
        return "code - xxx";
    }
    public void sendRecipt(String email){
        //
    }


    
}
