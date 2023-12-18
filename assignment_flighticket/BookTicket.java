
package assignment_flighticket;

import java.util.Scanner;

public class BookTicket {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String name = "";
        String passportNo = "";
        
        LinkedListPassenger comfirmTicketList = new LinkedListPassenger();
        QueuePassenger waitingList = new QueuePassenger();
        
        //this one read from txt file
            int availableSeat = 2;
            
        while(clickBook()){
            System.out.println("Enter your name: ");
            name = read.nextLine();
            System.out.println("Enter your Passport No: ");
            passportNo = read.nextLine();
            PassengerInfo passenger = new PassengerInfo(name, passportNo);
            
            if(availableSeat>0){
                comfirmTicketList.addLastPassenger(passenger);
                availableSeat--;
                System.out.println(comfirmTicketList.toString());
            }
            else{
                waitingList.enqueuePassenger(passenger);
                System.out.println(waitingList.toString());
            }
        }
    }
    
    // will change later based on other people code
    public static boolean clickBook(){
        
        for(int i=0; i<3; i++)
            return true;
        return false;
    }
    
}

