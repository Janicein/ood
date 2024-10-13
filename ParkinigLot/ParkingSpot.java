public class ParkingSpot {
    int floorNum;
    String id;
    Boolean occupied = false;
    SpotSize size;
    Vehicle v;

    public ParkingSpot(int floorNum, String id, SpotSize size){
        this.floorNum = floorNum;
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
        occupied = false;
        
    }

    
    
}
