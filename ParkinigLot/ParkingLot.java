import java.util.List;

public class ParkingLot{
    int numOfFloor;
    int totalSpots;
    List<ParkingFloor> parkFloorList;

    public ParkingLot(List<ParkingFloor> parkFloorList){

        this.parkFloorList = parkFloorList;
        this.numOfFloor = parkFloorList.size();
        for(ParkingFloor pf : parkFloorList){
            this.totalSpots += pf.space;
        }

    }
    public int getTotalSpace(){
        return totalSpots;
    }

    public boolean isFull(){
        for(ParkingFloor pf : parkFloorList){
            if(pf.isFull() == false) return false;
        }
        return true;

    }

    public void assignSpot(Vehicle v){

        SpotSize tmp = null;
        if(v.type == VehicleType.MOTOBIKE){
            tmp = SpotSize.SMALL;
        }else if(v.type == VehicleType.CAR){
            tmp = SpotSize.COMPACT;
        }else{
            tmp = SpotSize.LARGE;
        }

        for(ParkingFloor pf : parkFloorList){
            if(pf.isFull() == false && pf.getNumSpot(tmp) > 0){
                // return pf.assignSpot(v);
                v.parkingSpot = pf.assignSpot(v);

            }
        }
        // return "";
    }


    public void releaseSpot(Vehicle v){
        ParkingSpot ps = v.parkingSpot;
        ps.releaseSpot();
        v.parkingSpot = null;
    }
}