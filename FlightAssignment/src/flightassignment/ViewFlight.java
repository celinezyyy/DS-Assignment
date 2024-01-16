package flightassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ViewFlight {

    public static void main(String[] args) {
        
        LinkedListPassenger confirmTicketList = new LinkedListPassenger();
        QueuePassenger waitingList = new QueuePassenger();
        //Q1-SEARCHING
        boolean system = true;
        do{
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Please select the week number of desired flight : ");
            String targetWeek = sc1.next();
            System.out.println("------------------------------------------------------------------");
            while(!(targetWeek.equals("1") || targetWeek.equals("2") || targetWeek.equals("3")|| targetWeek.equals("4") || targetWeek.equals("5"))) {
                System.out.println("Invalid Input, try again");
                System.out.println("------------------------------------------------------------------");
                System.out.print("Please select the week number of desired flight : ");
                targetWeek = sc1.next();
            }
            
            System.out.println("Available Flight :");
            int targetWeekNumber = Integer.parseInt(targetWeek); 
            try (BufferedReader br = new BufferedReader(new FileReader("dataFlight.txt"))) /*change filepath!*/ {
                String line;
                
                while ((line = br.readLine()) != null) {
                    
                    String[] fields = line.split("\t");
                    int weekNumber = Integer.parseInt(fields[0]);
                    String dateString = fields[1];
                    String startTime = fields[2];
                    String endTime = fields[3];
                    int seatLeft = Integer.parseInt(fields[4]);
                    String flightNo = fields[5];

                    if (weekNumber == targetWeekNumber) {
                        System.out.println("-------------------");
                        System.out.println("Date: " + dateString);
                        System.out.println("Flight No: " + flightNo);
                        System.out.println("Departure Time: " + startTime);
                        System.out.println("Arrival Time: " + endTime);
                        System.out.println("Available seats: " + seatLeft);
                    }
                }
                
                System.out.println("------------------------------------------------------------------");
                System.out.println("Continue searching or booking? Type \"yes\" for searching, \"no\" for booking, \"quit\" for exit");
                String choose = sc1.next();
                
                while(!(choose.equals("yes") || choose.equals("no") || choose.equals("quit"))){
                    
                        System.out.println("Invalid input, try again");
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Continue searching or booking? Type \"yes\" for searching, \"no\" for booking, \"quit\" for exit");
                        choose = sc1.next();
                }
                
                if(choose.equals("yes")){
                    System.out.println("\n");
                    system = true;
                }else if(choose.equals("no")){
                    System.out.println("\n");
                    booking(confirmTicketList, waitingList);
                    break;
                }else if(choose.equals("quit")){
                    displayListAndQueue(confirmTicketList, waitingList);
                    break;
                }
                
            } catch (IOException e) {
                    e.printStackTrace();
            }
        }while(system);     
//        
//        displayListAndQueue(LinkedListPassenger confirmTicketList, QueuePassenger waitingList);
        
    }
    
    //Q2-BOOKING
    public static void booking(LinkedListPassenger confirmTicketList, QueuePassenger waitingList){
        
        Scanner read = new Scanner(System.in);
        
        boolean isFlightFound = false;
        System.out.println("Choose your booking flight:");
        System.out.println("---------------------------");
        String name="";
        String passportNo = "";
        String week = "";
        
        System.out.print("Enter your name: ");
        name = read.nextLine();
        while (!isValidPassengerName(name)){
            System.out.println("Invalid name, try again");
            System.out.print("Enter your name: ");
            name = read.nextLine();
        }
        
        System.out.print("Enter your Passport No: ");
        passportNo = read.nextLine();
        while (!isValidPassportNumber(passportNo)){
            
            System.out.println("Invalid passport number, try again");
            System.out.print("Enter Passport No: ");
            passportNo = read.nextLine();
         }
        
        System.out.print("Enter Week flight: ");
        week = read.nextLine();
        while (!isValidWeek(week)){
            
            System.out.println("Invalid week, try again");
            System.out.print("Enter Week flight: ");
            week = read.nextLine();
         }
        
        System.out.print("Enter Date: ");
        String date = read.nextLine();
        while (!isValidDate(date)){
            
            System.out.println("Invalid date, try again");
            System.out.print("Enter Date: ");
            date = read.nextLine();
         }
        
        System.out.print("Enter Departure time: ");
        String timeDeparture = read.nextLine();
        while (!isValidTime(timeDeparture)){
            
            System.out.println("Invalid time, try again");
            System.out.print("Enter Departure time: ");
            timeDeparture = read.nextLine();
         }
        System.out.print("Enter Arrival time: ");
        String timeArrival = read.nextLine();
        while (!isValidTime(timeArrival)){
            
            System.out.println("Invalid time, try again");
            System.out.print("Enter Arrival time: ");
            timeArrival = read.nextLine();
         }
        
        System.out.print("Enter Flight No: ");
        String flightNo = read.nextLine();
        while (!isValidFlightNumber(flightNo)){
            
            System.out.println("Invalid Flight No., try again");
            System.out.print("Enter Flight No: ");
            flightNo = read.nextLine();
         }
        System.out.println();
        
        //search user choosen's flight
        try (BufferedReader br = new BufferedReader(new FileReader("dataFlight.txt"))) /*change filepath!*/ {
            String line;
            while ((line = br.readLine()) != null) {

                String[] fields = line.split("\t");
                int weekNumber = Integer.parseInt(fields[0]);
                String dateString = fields[1];
                String startTime = fields[2];
                String endTime = fields[3];
                int seatLeft = Integer.parseInt(fields[4]);
                String flight = fields[5];

                if (Integer.parseInt(week) == weekNumber && date.equals(dateString) && timeDeparture.equals(startTime) && timeArrival.equals(endTime) && flightNo.equals(flight)) {

                    if(seatLeft>0){
                        PassengerInfo passenger = new PassengerInfo(name, passportNo,seatLeft,"Confirmed",week,date,timeDeparture,timeArrival,flightNo); // assume seatNumber assign according to leaftSeat
                        confirmTicketList.addLastPassenger(passenger);
                        seatLeft--;
                        String newLine = fields[0]+"\t"+fields[1]+"\t"+fields[2]+"\t"+fields[3]+"\t" + Integer.toString(seatLeft)+ "\t"+fields[5];
                        updateTextFile(line, newLine);
                        isFlightFound = true;
                        break;
                    }else{
                        PassengerInfo passenger = new PassengerInfo(name, passportNo,-1,"Waiting List",week,date,timeDeparture,timeArrival,flightNo);
                        waitingList.enqueuePassenger(passenger);
                        isFlightFound = true;
                        break;
                    }
                }
            }
            
            if(!isFlightFound)
                System.out.println("Sorry, we don't have this flight! Please book the available flight.");
               
            System.out.println("------------------------------------------------------------------");
            System.out.println("Continue booking? Type \"yes\" or \"no\" to continue");
            String choose = read.next();

            while(!(choose.equals("yes") || choose.equals("no"))){

                System.out.println("Invalid input, try again");
                System.out.println("------------------------------------------------------------------");
                System.out.println("Continue booking? Type \"yes\" or \"no\" to continue");
                choose = read.next();
                System.out.println();
            }
            if(choose.equals("yes")){
                System.out.println();
                booking(confirmTicketList, waitingList);
            }else if(choose.equals("no")){
                System.out.println("------------------------------------------------------------------");
                System.out.println("Thank you for choosing us !");
                displayListAndQueue(confirmTicketList, waitingList);
                return;
            }
            
        }catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateTextFile(String oldString, String newString){
        
        File fileToBeModified = new File("dataFlight.txt");
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        
        try{
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            
            while(line!=null){
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
            
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException a){
            a.printStackTrace();
        }finally{
            try
            {
                //Closing the resources
                reader.close();
                writer.close();
            } 
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    
    public static void displayListAndQueue(LinkedListPassenger confirmTicketList, QueuePassenger waitingList){
        
        System.out.println(confirmTicketList.toString());
        System.out.println(waitingList.toString());
    }
    
    private static boolean isValidPassengerName(String name) {
         // Add your validation logic for passenger name (e.g., check if it contains only letters)
        return name.matches("^[a-zA-Z]+$");
     }

     private static boolean isValidPassportNumber(String passportNumber) {
         // Add your validation logic for passport number
         return passportNumber.matches("^[A-Z]*\\d{5}$");
     }

     private static boolean isValidWeek(String week) {
         // Add your validation logic for week (e.g., check if it's a valid week number)
         return week.matches("^[1-5]$");
     }

     private static boolean isValidDate(String date) {
        return date.matches("^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$");

       // return date.matches("^\\d{1,2}/\\d{2}/\\d{4}$");
     }

     private static boolean isValidTime(String time) {
         // Add your validation logic for time
         // Example: Check if the time follows a specific format
         if (time.matches("^\\d{4}$")){
            // Extract hours and minutes
            int hours = Integer.parseInt(time.substring(0, 2));
            int minutes = Integer.parseInt(time.substring(2));

            // Check if hours are in the valid range (00 to 11) and minutes are in the valid range (00 to 59)
            return (hours >= 00 && hours <= 23) && (minutes >= 00 && minutes <= 59);
        }
        return false;
     }

     private static boolean isValidFlightNumber(String flightNumber) {
         // Add your validation logic for flight number
         return flightNumber.matches("^ABC12([2-4][2-9]|5[0-2])$");
     }
}
