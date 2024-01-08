
package flightassignment;


public class PassengerInfo {
    
    String name;
    String passportNo;
    int seatnumber;
    String status;
    String weekFlight;
    String date;
    String timeFlight;
    String timeEndFight;
    String flightNo;

    public PassengerInfo(String name, String passportNo, int seatnumber, String status, String weekFlight, String date, String timeFlight, String timeEndFight, String flightNo) {
        this.name = name;
        this.passportNo = passportNo;
        this.seatnumber = seatnumber;
        this.status = status;
        this.weekFlight = weekFlight;
        this.date = date;
        this.timeFlight = timeFlight;
        this.timeEndFight = timeEndFight;
        this.flightNo = flightNo;
    }

    public String getWeekFlight() {
        return weekFlight;
    }

    public void setWeekFlight(String weekFlight) {
        this.weekFlight = weekFlight;
    }

    public String getDate() {
        return date;
    }

    public String getArrivalTime() {
        return timeEndFight;
    }
    
    public String getDepartureTime() {
        return timeFlight;
    }

   
    public String getFlightNo() {
        return flightNo;
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

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public int getSeatnumber() {
        return seatnumber;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
}
