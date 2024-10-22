import java.util.*;




class LockerSystem{

    int totalLocker;
 
    OTP otp;
    HashMap<LockerSlot, Parcel> lockerParcelMap;
    HashMap<LockerSize, LockerSet> lockerSetMap;
    HashMap<LockerSize, int[]> lockerSizeDim;

    public LockerSystem(HashMap<LockerSize, LockerSet> lockerSetMap, HashMap<LockerSize, int[]> lockerSizeDim){
        this.otp = new OTP();
        this.lockerParcelMap = new HashMap<>();
        this.lockerSetMap = lockerSetMap;
        this.lockerSizeDim = lockerSizeDim;
    }

    public void delieveredParcel(Parcel parcel){

        if(dimensionFit(parcel, LockerSize.SMALL) && lockerSetMap.get(LockerSize.SMALL).isFull() == false){
            LockerSlot curSlot = lockerSetMap.get(LockerSize.SMALL).assignSlot();
            lockerParcelMap.put(curSlot, parcel);
        }else if(dimensionFit(parcel, LockerSize.MEDIUM) && lockerSetMap.get(LockerSize.MEDIUM).isFull() == false){
            LockerSlot curSlot = lockerSetMap.get(LockerSize.MEDIUM).assignSlot();
            lockerParcelMap.put(curSlot, parcel);
        }else if(dimensionFit(parcel, LockerSize.LARGE) && lockerSetMap.get(LockerSize.LARGE).isFull() == false){
            LockerSlot curSlot = lockerSetMap.get(LockerSize.LARGE).assignSlot();
            lockerParcelMap.put(curSlot, parcel);
        }else{
            System.out.println("Pacel is too large, there is no appropriate locker");
        }

    }

    public boolean dimensionFit(Parcel parcel, LockerSize lockerSize){
        int[] lockerDim = lockerSizeDim.get(lockerSize);
        if(parcel.length < lockerDim[0] && parcel.height < lockerDim[1] && parcel.width < lockerDim[2]) return true;
        return false;

    }

    public void pickupParcel(String code){
        if(otp.codeExist(code) == false){
            System.out.println("The code is not valid!");
            return;
        }
        LockerSlot curLocker = otp.getSlot(code);
        Parcel parcel = curLocker.curParcel;
        parcel.isPickedUp = true;
        curLocker.releaseParcel();
        lockerParcelMap.remove(curLocker);
        curLocker.lockerSet.available_spot++;
    
        otp.pickup_recipt(code, parcel);

    }



}