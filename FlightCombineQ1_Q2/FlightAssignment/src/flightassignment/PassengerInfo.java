
package flightassignment;


public class PassengerInfo {
    
    String name;
    String passportNo;
    int seatnumber;
    private String status;

   public PassengerInfo(String name, String passportNo, int seatNumber, String status) {
        this.name = name;
        this.passportNo = passportNo;
        this.seatnumber = seatNumber;
        this.status=status;
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

    public int getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
}
