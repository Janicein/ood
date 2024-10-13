import java.time.*;
public class Ticket {

    String ticketId;
    String license;
    Instant inTime;
    Instant exitTime;
    double fee;

    public Ticket(String ticketId, String license){
        this.ticketId = ticketId;
        this.license = license;
        this.inTime = Instant.now();
    }

    public String getTicketId(){
        return ticketId;
    }

    public String getLicense(){
        return license;
    }
    

    public void markExit(){
        this.exitTime = Instant.now();
        Duration duration = Duration.between(inTime, exitTime);
        long hours = duration.toHours();
        calculateFee(hours);

    }

    public double calculateFee(long hours){
        return fee * hours; 

    }
    
}
