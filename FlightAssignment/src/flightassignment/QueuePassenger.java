
package flightassignment;

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
        
        if (isEmpty()) 
          return null; 
      
      NodePassenger temp = head;
      head = head.nextNode;

      if (head == null) {
          tail = null; 
      }

      temp.nextNode = null; 
      return temp;
  }

    
    public String toString(){
        String value = "\nPassenger in the Waiting list: \n";
        NodePassenger current = head;
        int no=1;
        if(current==null){
            return value += "No passenger in the waiting list";
        }
        while(current!=null){
            String num = Integer.toString(no);
            value += ("\n"+num + " - Name: " + current.passenger.name + "\n    Passport No: " + current.passenger.passportNo);
            current = current.nextNode;
            no++;
        }
        return value;
    }
}