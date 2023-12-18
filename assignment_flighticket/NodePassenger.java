
package assignment_flighticket;

public class NodePassenger {
    
    String name;
    String passportNo;
    NodePassenger nextNode;

//    public NodePassenger(String name, String passportNo) {
//        this.name = name;
//        this.passportNo = passportNo;
//    }

    public NodePassenger(PassengerInfo passenger) {
        this.name = passenger.name;
        this.passportNo = passenger.passportNo;
    }
    
    
    
    
}
