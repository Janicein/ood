public abstract class Vehicle {

    VehicleType type;
    String license;
    ParkingSpot parkingSpot;

    public Vehicle(VehicleType type, String license, ParkingSpot parkingSpot){
        this.type = type;
        this.license = license;
        this.parkingSpot = parkingSpot;
    }

    public VehicleType getVehicleType(){
        return type;
    }

    public String getLicense(){
        return license;
    }

    
}







