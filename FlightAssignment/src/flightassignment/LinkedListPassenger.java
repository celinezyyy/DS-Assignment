package flightassignment;

public class LinkedListPassenger<E,T> {
    
    NodePassenger head;
    NodePassenger tail;
    int size;

    public LinkedListPassenger() {
        size=0;
        head = null;
        tail = null;
    }
    
    public int getSize(){
        return size;
    }
    

    public void addFirstPassenger(PassengerInfo passenger){
        
        NodePassenger newNode = new NodePassenger(passenger);
        
        if(tail==null){
            head = tail = newNode;
        }else{
            newNode.nextNode = head;
            head = newNode;
        }
        size++;
    }
    

    public void addLastPassenger(PassengerInfo passenger){
        
        NodePassenger newNode = new NodePassenger(passenger);
        if(head==null){
            tail = head = newNode;
        }else{
            tail.nextNode = newNode;
            tail = newNode;
        }
        size++;
        
    }
    
    public NodePassenger removeFirstPassenger(){
        
        if(size==0){
            return null;
        }else {
            NodePassenger keep = head;
            head = head.nextNode;
            size--;
            
            if(head==null)
                tail = null;
            return keep;
        }
    }
    
    public NodePassenger removeMiddlePassenger(String name, String passportNumber){
        
        if(size==0){
            System.out.println("Passenger is not in the list");
            return null;
        }
        
        int i=0;
        NodePassenger keep = head;
        for(i=0; i<size; i++){
            if(keep.passenger.getName().equals(name) && 
               keep.passenger.getPassportNo().equals(passportNumber))
                break;
            keep = keep.nextNode;
        }
        
        if(i==0)
            return removeFirstPassenger();
        else{    
            
            NodePassenger prev = head;
            for(int j=1; j<i; i++){
                prev = prev.nextNode;
            }
            NodePassenger current = prev.nextNode;
            prev.nextNode = current.nextNode;
            size--;
            return current;
        }
    }
    
  public PassengerInfo removePassenger(String passengerName, String passportNumber) {
    NodePassenger current = head;
    NodePassenger prev = null;
    
    while (current != null) {
        if (current.passenger.getName().equals(passengerName) &&
            current.passenger.getPassportNo().equals(passportNumber)) {
            if (prev == null) {
                // Removing the head
                head = head.nextNode;
            } else {
                // Removing from middle or end
                prev.nextNode = current.nextNode;
            }
            if (current == tail) {
                // Adjust tail if needed
                tail = prev;
            }
            int seatNo = current.passenger.getSeatnumber();
            size--;
            return current.passenger; // Return the removed passenger
        }
        prev = current;
        current = current.nextNode;
    }
    return null; 
}
    
    public String toString(){
        String value = "\nPassenger in the Confirmed tickets list: \n";
        NodePassenger current = head;
        if(current==null){
            return value += "No passenger in the confirmed ticket list";
        }
        int no=1;
        while(current!=null){
            String num = Integer.toString(no);
            value += ("\n"+num + " - Name: " + current.passenger.name + "\n    Passport No: " + current.passenger.passportNo + "\n    Seat No: " + current.passenger.getSeatnumber());
            current = current.nextNode;
            no++;
        }
        return value;
    }

}