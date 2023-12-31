package flightassignment;

public class NodePassenger {
    
    PassengerInfo passenger;
    NodePassenger nextNode;

    public NodePassenger(PassengerInfo passengers) {
          this.passenger = passengers;
    }

    public PassengerInfo getPassenger() {
        return passenger;
    }

    public void setPassenger(PassengerInfo passenger) {
        this.passenger = passenger;
    }

    public NodePassenger getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodePassenger nextNode) {
        this.nextNode = nextNode;
    }
    
    
    
    
}