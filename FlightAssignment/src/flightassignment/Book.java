
package flightassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Book extends javax.swing.JInternalFrame implements BookingListener{
    
    private LinkedListPassenger confirmTicketList = new LinkedListPassenger();
    private QueuePassenger waitingList = new QueuePassenger();
 
    private BookingListener bookingListener;
    
     public void setBookingListener(BookingListener listener) {
        this.bookingListener = listener;
    }

    public Book() {
        initComponents();
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_passengerName = new javax.swing.JTextField();
        txt_passportNum = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_weekFlight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_DateFlight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_TimeFlight = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_FlightNo = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Ticket Info");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Passport Number: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Booking Details");

        jPanel3.setBackground(new java.awt.Color(192, 189, 189));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Passport Number: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Passenger Name:");

        txt_passengerName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_passengerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passengerNameActionPerformed(evt);
            }
        });

        txt_passportNum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_passportNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passportNumActionPerformed(evt);
            }
        });

        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Week Flight:");

        txt_weekFlight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_weekFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_weekFlightActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Date:");

        txt_DateFlight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_DateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DateFlightActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Departure Time:");

        txt_TimeFlight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_TimeFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TimeFlightActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Flight No:");

        txt_FlightNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_FlightNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FlightNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_FlightNo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txt_TimeFlight, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_DateFlight, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_weekFlight, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_passengerName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_passportNum, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_passengerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_passportNum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_weekFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TimeFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_FlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_submit)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passengerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passengerNameActionPerformed
//        String passengerName = txt_passengerName.getText().trim();
//        for(int i=0; i<)
//        if (Character.isAlphabetic(passengerName)) {
//            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
    }//GEN-LAST:event_txt_passengerNameActionPerformed

    private void txt_passportNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passportNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passportNumActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
       
        // Validate and get input values
        String passengerName = txt_passengerName.getText().trim();
        String passportNumber = txt_passportNum.getText().trim();
        String weekFlight = txt_weekFlight.getText().trim();
        String date = txt_DateFlight.getText().trim();
        String timeFlight = txt_TimeFlight.getText().trim();
        String flightNo = txt_FlightNo.getText().trim();

        // Validate passenger name
        if (passengerName.isEmpty() || !isValidPassengerName(passengerName)) {
            JOptionPane.showMessageDialog(this, "Invalid passenger name. Please enter a valid name.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate passport number
        if (passportNumber.isEmpty() || !isValidPassportNumber(passportNumber)) {
            JOptionPane.showMessageDialog(this, "Invalid passport number. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate week flight
        if (weekFlight.isEmpty() || !isValidWeek(weekFlight)) {
            JOptionPane.showMessageDialog(this, "Invalid week flight. Please enter a valid week.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate date
        if (date.isEmpty() || !isValidDate(date)) {
            JOptionPane.showMessageDialog(this, "Invalid date. Please enter a valid date.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate time flight
        if (timeFlight.isEmpty() || !isValidTime(timeFlight)) {
            JOptionPane.showMessageDialog(this, "Invalid departure time. Please enter a valid time.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate flight number
        if (flightNo.isEmpty() || !isValidFlightNumber(flightNo)) {
            JOptionPane.showMessageDialog(this, "Invalid flight number. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       bookFlight(confirmTicketList, waitingList);
    }//GEN-LAST:event_btn_submitActionPerformed

    private void txt_weekFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_weekFlightActionPerformed
        
    }//GEN-LAST:event_txt_weekFlightActionPerformed

    private void txt_DateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DateFlightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DateFlightActionPerformed

    private void txt_TimeFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TimeFlightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TimeFlightActionPerformed

    private void txt_FlightNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FlightNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FlightNoActionPerformed

   
   public boolean removePassengerAndUpdateSeats(String passengerName, String passportNumber) {
        PassengerInfo removedPassenger = confirmTicketList.removePassenger(passengerName, passportNumber);
            if (removedPassenger != null) {
              
               return true; // Successful removal
            }
            return false; 
}
   
    @Override
    public void onBookingMade(PassengerInfo passenger) { 
    }

    @Override
    public void onBookingCanceled(String passengerName, String passportNumber) {
       if (removePassengerAndUpdateSeats(passengerName, passportNumber)) {
        if (!waitingList.isEmpty()) {
            PassengerInfo firstInWaiting = waitingList.dequeuePassenger().passenger; 
            firstInWaiting.setStatus("Confirmed");
            confirmTicketList.addLastPassenger(firstInWaiting);
            JOptionPane.showMessageDialog(this, "A passenger from the waiting list has been confirmed.", "Update", JOptionPane.INFORMATION_MESSAGE);
            
            
            
            // Notify the listener about the change
            if (bookingListener != null) {
                 bookingListener.onStatusUpdated(firstInWaiting.getName(), firstInWaiting.getPassportNo(), "Confirmed");
            }
        }
    }
       
    }
    
    @Override
    public void onStatusUpdated(String passengerName, String passportNumber, String newStatus) {
    }

    private void bookFlight(LinkedListPassenger confirmTicketList, QueuePassenger waitingList) {
        
        PassengerInfo passenger = null;
        String passengerName = txt_passengerName.getText().trim();
        String passportNumber = txt_passportNum.getText().trim();
        String weekFlight = txt_weekFlight.getText().trim();
        String date = txt_DateFlight.getText().trim();
        String timeFlight = txt_TimeFlight.getText().trim();
        String flightNo = txt_FlightNo.getText().trim();

        if (passengerName.isEmpty() || passportNumber.isEmpty() || date.isEmpty() || timeFlight.isEmpty() || flightNo.isEmpty() || weekFlight.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Scanner read = new Scanner(System.in);
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

                if (Integer.parseInt(weekFlight) == weekNumber && date.equals(dateString) && timeFlight.equals(startTime) && flightNo.equals(flight)) {

                    if(seatLeft>0){
                        passenger = new PassengerInfo(passengerName, passportNumber,seatLeft,"Confirmed",weekFlight,date,timeFlight,endTime,flightNo); // assume seatNumber assign according to leaftSeat
                        confirmTicketList.addLastPassenger(passenger);
                        seatLeft--;
                        String newLine = fields[0]+"\t"+fields[1]+"\t"+fields[2]+"\t"+fields[3]+"\t" + Integer.toString(seatLeft)+ "\t"+fields[5];
                        updateTextFile(line, newLine);
                        JOptionPane.showMessageDialog(this, "Ticket booked successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }else{
                        passenger = new PassengerInfo(passengerName, passportNumber,-1,"Waiting List",weekFlight,date,timeFlight,endTime,flightNo);
                        waitingList.enqueuePassenger(passenger);
                        JOptionPane.showMessageDialog(this, "No available seats. You have been added to the waiting list.", "Waiting List", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    
                }
            }
            // Notify the listener
                if (bookingListener != null) {
                    bookingListener.onBookingMade(passenger);
                }

                // Clear the input fields
                txt_passengerName.setText("");
                txt_passportNum.setText("");
                txt_DateFlight.setText("");
                txt_TimeFlight.setText("");
                txt_FlightNo.setText("");
                txt_weekFlight.setText("");
                
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

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_DateFlight;
    private javax.swing.JTextField txt_FlightNo;
    private javax.swing.JTextField txt_TimeFlight;
    private javax.swing.JTextField txt_passengerName;
    private javax.swing.JTextField txt_passportNum;
    private javax.swing.JTextField txt_weekFlight;
    // End of variables declaration//GEN-END:variables

    private boolean isValidPassengerName(String name) {
         // Add your validation logic for passenger name (e.g., check if it contains only letters)
         return name.matches("^[a-zA-Z]+$");
     }

     private boolean isValidPassportNumber(String passportNumber) {
         // Add your validation logic for passport number
         return passportNumber.matches("^[A-Z]*\\d{5}$");
     }

     private boolean isValidWeek(String week) {
         // Add your validation logic for week (e.g., check if it's a valid week number)
         return week.matches("^[1-5]$");
     }

     private boolean isValidDate(String date) {
         // Add your validation logic for date
         // Example: Check if the date follows a specific format (you can use SimpleDateFormat for more advanced validation)
        return date.matches("^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$");
     }

     private boolean isValidTime(String time) {
        if (time.matches("^\\d{4}$")){
            // Extract hours and minutes
            int hours = Integer.parseInt(time.substring(0, 2));
            int minutes = Integer.parseInt(time.substring(2));

            // Check if hours are in the valid range (00 to 11) and minutes are in the valid range (00 to 59)
            return (hours >= 00 && hours <= 23) && (minutes >= 00 && minutes <= 59);
        }
        return false;
     }

     private boolean isValidFlightNumber(String flightNumber) {
         // Add your validation logic for flight number
         return flightNumber.matches("^ABC12([2-4][2-9]|5[0-2])$");
     }
   
}

   


