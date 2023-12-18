
package assignment_flighticket;

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
    
//    public void addFirstPassenger(String name, String passportNo){
//        
//        NodePassenger newNode = new NodePassenger(name, passportNo);
//        
//        if(tail==null){
//            head = tail = newNode;
//        }else{
//            newNode.nextNode = head;
//            head = newNode;
//        }
//        size++;
//    }
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
    
    
//    public void addLastPassenger(String name, String passportNo){
//        
//        NodePassenger newNode = new NodePassenger(name, passportNo);
//        if(head==null){
//            tail = head = newNode;
//        }else{
//            tail.nextNode = newNode;
//            tail = newNode;
//        }
//        size++;
//    }
    
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
    
    public NodePassenger removeMiddlePassenger(String name){
        
        if(size==0){
            System.out.println("Passenger is not in the list");
            return null;
        }
        
        int i=0;
        NodePassenger keep = head;
        for(i=0; i<size; i++){
            if(keep.name.equals(name))
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
    
    public String toString(){
        String value = "Passenger in the Confirmed tickets list: \n";
        NodePassenger current = head;
        if(current==null){
            return value += "No passenger in the confirmed ticket list";
        }
        int no=1;
        while(current!=null){
            String num = Integer.toString(no);
            value += (num + " - Name: " + current.name + "\n    Passport No: " + current.passportNo + "\n");
            current = current.nextNode;
            no++;
        }
        return value;
    }

}
