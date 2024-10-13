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
}