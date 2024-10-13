public abstract class Vehicle {

    VehicleType type;
    String license;

    public Vehicle(VehicleType type, String license){
        this.type = type;
        this.license = license;
    }

    public VehicleType getVehicleType(){
        return type;
    }

    public String getLicense(){
        return license;
    }

    
}







