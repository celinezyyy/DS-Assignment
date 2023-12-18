
package assignment_flighticket;

public class QueuePassenger {
    
    NodePassenger head;
    NodePassenger tail;
    
    public QueuePassenger() {
        this.head = null;
        this.tail = null;
    }
    
    public boolean isEmpty(){
        return tail==null;
    }
    
//    public void enqueuePassenger(String name, String passportNo){
//        
//        NodePassenger waitingPassenger = new NodePassenger(name, passportNo);
//        if(isEmpty()){
//            head = tail = waitingPassenger;
//        }else{
//            NodePassenger current = head;
//            while(current.nextNode!=null){
//                current = current.nextNode;
//            }
//            current.nextNode = waitingPassenger;
//            tail = waitingPassenger;
//        }
//    }
    
    public void enqueuePassenger(PassengerInfo passenger){
        
        NodePassenger waitingPassenger = new NodePassenger(passenger);
        if(isEmpty()){
            head = tail = waitingPassenger;
        }else{
            NodePassenger current = head;
            while(current.nextNode!=null){
                current = current.nextNode;
            }
            current.nextNode = waitingPassenger;
            tail = waitingPassenger;
        }
    }
    
    public NodePassenger dequeuePassenger(){
        
        NodePassenger temp = head;
        temp.nextNode = null;
        head = head.nextNode;
        return temp;
    }
    
    public String toString(){
        String value = "Passenger in the Waiting list: \n";
        NodePassenger current = head;
        int no=1;
        if(current==null){
            return value += "No passenger in the waiting list";
        }
        while(current!=null){
            String num = Integer.toString(no);
            value += (num + " - Name: " + current.name + "\n    Passport No: " + current.passportNo + "\n");
            current = current.nextNode;
            no++;
        }
        return value;
    }
}
