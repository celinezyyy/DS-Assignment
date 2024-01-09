
package flightassignment;

public class TicketInfo {
    
    private String name;
    private String passportNo;
    private String departureTime;
    private String arrivalTime;
    private String seatNo;
    private String flightNo;

    public TicketInfo(String name, String passportNo, String departureTime, String arrivalTime, String seatNo, String flightNo) {
        this.name = name;
        this.passportNo = passportNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatNo = seatNo;
        this.flightNo = flightNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }
    
    
    
    
}
