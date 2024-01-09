/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightassignment;

import javax.swing.JTable;


public class NodeTicketPassengerInfo {
    String name;
    String passportNo;
    String departureTime;
    String DateString;
    String seatNo;
    String flightNo;
    NodeTicketPassengerInfo nextPassengerTicket;
    

    NodeTicketPassengerInfo() {
        
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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDateString() {
        return DateString;
    }

    public void setDateString(String dateString) {
        this.DateString = dateString;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public NodeTicketPassengerInfo getNextPassengerTicket() {
        return nextPassengerTicket;
    }

    public void setNextPassengerTicket(NodeTicketPassengerInfo nextPassengerTicket) {
        this.nextPassengerTicket = nextPassengerTicket;
    }
    
    public NodeTicketPassengerInfo getSelectedNode() {
   
    NodeTicketPassengerInfo selectedNode = null;
    return selectedNode;
}
    
    
    
}
