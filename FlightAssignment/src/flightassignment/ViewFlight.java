package flightassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
                System.out.print("Please select the week number of desired flight : Week ");
                targetWeek = sc1.next();
            }
            
            System.out.println("Available Flight :");
            int targetWeekNumber = Integer.parseInt(targetWeek); 
            try (BufferedReader br = new BufferedReader(new FileReader("C://Users//user//OneDrive - Universiti Malaya//Desktop//UM_CLASS//dataFlight.txt"))) /*change filepath!*/ {
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
        
//        LinkedListPassenger comfirmTicketList = new LinkedListPassenger();
//        QueuePassenger waitingList = new QueuePassenger();
        
        System.out.println("Choose your booking flight:");
        System.out.println("---------------------------");
        System.out.print("Enter your name: ");
        String name = read.nextLine();
        System.out.print("Enter your Passport No: ");
        String passportNo = read.nextLine();
        System.out.print("Week flight: ");
        String week = read.nextLine();
        System.out.print("Date: ");
        String date = read.nextLine();
        System.out.print("Departure time: ");
        String time = read.nextLine();
        System.out.print("Flight no: ");
        String flightNo = read.nextLine();
        System.out.println();
        
        //search respective flight
        try (BufferedReader br = new BufferedReader(new FileReader("C://Users//user//OneDrive - Universiti Malaya//Desktop//UM_CLASS//dataFlight.txt"))) /*change filepath!*/ {
            String line;
            while ((line = br.readLine()) != null) {

                String[] fields = line.split("\t");
                int weekNumber = Integer.parseInt(fields[0]);
                String dateString = fields[1];
                String startTime = fields[2];
                String endTime = fields[3];
                int seatLeft = Integer.parseInt(fields[4]);
                String flight = fields[5];

                if (Integer.parseInt(week) == weekNumber && date.equals(dateString) && time.equals(startTime) && flightNo.equals(flight)) {

                    if(seatLeft>0){
                        PassengerInfo passenger = new PassengerInfo(name, passportNo,seatLeft,"Confirmed"); // assume seatNumber assign according to leaftSeat
                        confirmTicketList.addLastPassenger(passenger);
                        seatLeft--;
                        String newLine = fields[0]+"\t"+fields[1]+"\t"+fields[2]+"\t"+fields[3]+"\t" + Integer.toString(seatLeft)+ "\t"+fields[5];
                        updateTextFile(line, newLine);
                        break;
                    }else{
                        PassengerInfo passenger = new PassengerInfo(name, passportNo,-1,"Waiting List");
                        waitingList.enqueuePassenger(passenger);
                        break;
                    }
                }
            }
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
        
        File fileToBeModified = new File("C://Users//user//OneDrive - Universiti Malaya//Desktop//UM_CLASS//dataFlight.txt");
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
}

