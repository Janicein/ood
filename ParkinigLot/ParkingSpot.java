public class ParkingSpot {
    ParkingFloor parkingFloor;
    String id;
    Boolean occupied = false;
    SpotSize size;
    Vehicle v;

    public ParkingSpot(ParkingFloor parkingFloor, String id, SpotSize size){
        this.parkingFloor = parkingFloor;
        this.id = id;
        this.size = size;
    }

    public boolean isAvailable(){
        return !occupied;
    }

    public SpotSize getSpotSize(){
        return size;
    }

    public void occupiedSpot(Vehicle v){
        this.v = v;
        occupied = true;
    }

    public void releaseSpot(){
        this.v = null;
        if(size == SpotSize.SMALL){
            parkingFloor.numSmall++;
        }else if(size == SpotSize.COMPACT){
            parkingFloor.numCompact++;
        }else{
            parkingFloor.numLarge++;
        }
        parkingFloor.occupied--;
        occupied = false;
        
    }

    
    
}
