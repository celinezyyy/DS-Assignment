
package flightassignment;


public class LinkedListTicketPassengerInfo {
    
    NodeTicketPassengerInfo head;
    NodeTicketPassengerInfo tail;
    int size;
    
    public LinkedListTicketPassengerInfo(){
    }
    
    public void addLast(NodeTicketPassengerInfo node){
        if(head == null){
            this.head = node;
        }else{
            NodeTicketPassengerInfo current = this.head;
            while(current.getNextPassengerTicket() != null){
                current = current.getNextPassengerTicket();
            }
            current.setNextPassengerTicket(node);
        }
        size++;
    }
    
    public void update(String flightNo, String passengerName, String passportNo) {
    NodeTicketPassengerInfo current = this.head;
    while (current != null) {
        if (current.getFlightNo().equals(flightNo)) {
            current.setName(passengerName);
            current.setPassportNo(passportNo);
            break;
        }
        current = current.getNextPassengerTicket();
    }
}
    
    
}
