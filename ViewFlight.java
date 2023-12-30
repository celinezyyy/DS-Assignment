package assignq1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

public class ViewFlight {

    public static void main(String[] args) {
        boolean system = true;
        while (system){
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Please select the week number of desired flight : Week ");
            String targetWeek = sc1.next();
            System.out.println("--------------------------------------------------------------");
            if (!(targetWeek.equals("1") || targetWeek.equals("2") || targetWeek.equals("3")|| targetWeek.equals("4") || targetWeek.equals("5") || targetWeek.equals("6"))) {
            System.out.println("Invalid Input, try again");
            System.out.println("--------------------------------------------------------------");
            }
            else {
                int targetWeekNumber = Integer.parseInt(targetWeek); 
                try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Downloads\\dataFlight.txt"))) /*change filepath!*/ {
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

                                System.out.println("Date: " + dateString);
                                System.out.println("Flight: " + flightNo);
                                System.out.println("Departure Time: " + startTime);
                                System.out.println("Arrival Time: " + endTime);
                                System.out.println(seatLeft + " seats left");
                                System.out.println("--------------------------------------------------------------");
                            }
                    }
                } catch (IOException | NumberFormatException e) {
                    System.err.println("Conversion error");
                    }
            }
            while(true){
                Scanner validate1 = new Scanner(System.in);
                System.out.println("Select another week ? (Y/N)");
                String validation = validate1.next();
                if (validation.toUpperCase().equals("N") || validation.equals("NO")){
                    system = false;
                    break;
                }
                else if(validation.toUpperCase().equals("Y") || validation.toUpperCase().equals("YES")) {
                    break;
                }
                
            }
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Thank you for choosing us !");
    }
}

