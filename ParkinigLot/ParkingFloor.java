import java.util.*;

public class ParkingFloor{
    int floorNum;
    int space;
    int occupied;
    List<ParkingSpot> spotList;
    int numSmall;
    int numCompact;
    int numLarge;

    public ParkingFloor(int floorNum, int space, int occupied, List<ParkingSpot> spotList){
        this.floorNum = floorNum;
        this.space = space;
        this.occupied = occupied;
        this.spotList = spotList;
        for(ParkingSpot ps : spotList){
            if(ps.size == SpotSize.SMALL){
                numSmall++;
            }else if(ps.size == SpotSize.COMPACT){
                numCompact++;
            }else{
                // ps.size == SpotSize.LARGE
                numLarge++;
            }
        }

    }

    public int getSpace(){
        return space;
    }

    public boolean isFull(){
        return occupied >= space;
    }

    public int getNumSpot(SpotSize spotsize){
        if(spotsize == SpotSize.SMALL){
            return numSmall;
        }else if(spotsize == SpotSize.COMPACT){
            return numCompact;
        }else{
            return numLarge;
        }
    }

    public ParkingSpot assignSpot(Vehicle v){
        SpotSize tmp = null;
        if(v.type == VehicleType.MOTOBIKE){
            tmp = SpotSize.SMALL;
        }else if(v.type == VehicleType.CAR){
            tmp = SpotSize.COMPACT;
        }else{
            tmp = SpotSize.LARGE;
        }

        for(ParkingSpot ps: spotList){
            if(ps.size == tmp && ps.occupied == false){
                ps.occupiedSpot(v);
                if(tmp == SpotSize.SMALL){
                    numSmall--;
                }else if(tmp == SpotSize.COMPACT){
                    numCompact--;
                }else{
                    numLarge--;
                }

                occupied++;

                return ps;

            }
        }

        return null;

    }
    

}