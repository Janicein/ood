import java.util.*;

public class ParkingFloor{
    int floorNum;
    int space;
    int occupied;
    List<ParkingSpot> spotList;

    public ParkingFloor(int floorNum, int space, int occupied, List<ParkingSpot> spotList){
        this.floorNum = floorNum;
        this.space = space;
        this.occupied = occupied;
        this.spotList = spotList;

    }

    public int getSpace(){
        return space;
    }

    public boolean isFull(){
        return occupied >= space;
    }


    


    

}