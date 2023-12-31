
package flightassignment;

import javax.swing.JOptionPane;


public class Book extends javax.swing.JInternalFrame implements BookingListener{
    
    private LinkedListPassenger comfirmTicketList = new LinkedListPassenger();
    private QueuePassenger waitingList = new QueuePassenger();
 
    private BookingListener bookingListener;
    
     public void setBookingListener(BookingListener listener) {
        this.bookingListener = listener;
    }

    //Need to load from file when the file is ready 
    private int availableSeat = 2;

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
        jLabel6 = new javax.swing.JLabel();
        txt_SeatNumber = new javax.swing.JTextField();
        txt_passengerName = new javax.swing.JTextField();
        txt_passportName = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Seat Number: ");

        txt_SeatNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_SeatNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SeatNumberActionPerformed(evt);
            }
        });

        txt_passengerName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_passengerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passengerNameActionPerformed(evt);
            }
        });

        txt_passportName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_passportName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passportNameActionPerformed(evt);
            }
        });

        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SeatNumber))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_passengerName, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txt_passportName))))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_passengerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_passportName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_submit)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_SeatNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SeatNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SeatNumberActionPerformed

    private void txt_passengerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passengerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passengerNameActionPerformed

    private void txt_passportNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passportNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passportNameActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
       
    String passengerName = txt_passengerName.getText().trim();
    String passportNumber = txt_passportName.getText().trim();
    String seatNumberString = txt_SeatNumber.getText().trim();
    int seatNumber = 0;

    if (passengerName.isEmpty() || passportNumber.isEmpty() || seatNumberString.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        seatNumber = Integer.parseInt(seatNumberString);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid seat number.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    String status;
    PassengerInfo passenger;
    if (availableSeat > 0) {
        status = "Confirmed";
        passenger = new PassengerInfo(passengerName, passportNumber, seatNumber, status);
        comfirmTicketList.addLastPassenger(passenger);
        availableSeat--; 
        JOptionPane.showMessageDialog(this, "Ticket booked successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        status = "Waiting List";
        passenger = new PassengerInfo(passengerName, passportNumber, seatNumber, status);
        waitingList.enqueuePassenger(passenger);
        JOptionPane.showMessageDialog(this, "No available seats. You have been added to the waiting list.", "Waiting List", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Notify the listener
    if (bookingListener != null) {
        bookingListener.onBookingMade(passenger);
    }
    
    // Clear the input fields
    txt_passengerName.setText("");
    txt_passportName.setText("");
    txt_SeatNumber.setText("");
    
    
        
    }//GEN-LAST:event_btn_submitActionPerformed

   
   public boolean removePassengerAndUpdateSeats(String passengerName, String passportNumber) {
        PassengerInfo removedPassenger = comfirmTicketList.removePassenger(passengerName, passportNumber);
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
            comfirmTicketList.addLastPassenger(firstInWaiting);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_SeatNumber;
    private javax.swing.JTextField txt_passengerName;
    private javax.swing.JTextField txt_passportName;
    // End of variables declaration//GEN-END:variables

   
   
}

   


