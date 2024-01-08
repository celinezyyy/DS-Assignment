
package flightassignment;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ticket_Info extends javax.swing.JInternalFrame implements BookingListener {

   private BookingListener bookingListener; 
  
    public Ticket_Info(BookingListener listener) {
    this.bookingListener = listener;  // Set the listener
    initComponents();
    }

   
    @Override
    public void onBookingMade(PassengerInfo passenger) {
        addRowToTable(passenger);
    }
    
     @Override
    public void onBookingCanceled(String passengerName, String passportNumber, String flightNo) {
        
       
    }
    
      @Override
    public void onStatusUpdated(String passengerName, String passportNumber, String newStatus, int newSeatNo) {
         updatePassengerStatus(passengerName, passportNumber, newStatus,newSeatNo);
    }
    
    public void updatePassengerStatus(String passengerName, String passportNumber, String newStatus, int newSeatNo) {
    DefaultTableModel model = (DefaultTableModel) Table.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        if (model.getValueAt(i, 1).equals(passengerName) && model.getValueAt(i, 4).equals(passportNumber)) {
            model.setValueAt(newStatus, i, 9); 
            model.setValueAt(newSeatNo, i, 3);
            break;
        }
    }
}

    
    public void addRowToTable(PassengerInfo passenger) {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.addRow(new Object[]{
            passenger.getFlightNo(), 
            passenger.getName(), 
            passenger.getDate(), 
            passenger.getSeatnumber(), 
            passenger.getPassportNo(), 
            "KL", 
            "Penang",
            passenger.getDepartureTime(), 
            passenger.getArrivalTime(), 
            passenger.getStatus()
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Ticket Info");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No", "Passenger Name", "Date", "Seat Number", "Passport Number", "Departure", "Arrival", "Departure Time", "Arrival Time", "Status"
            }
        ));
        jScrollPane2.setViewportView(Table);

        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cancel.setText("Cancel Booking");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(939, 939, 939))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        
        int selectedRow = Table.getSelectedRow();
        String flightNo = (String) Table.getValueAt(selectedRow, 0);


        if (selectedRow >= 0) { 
        String status = (String) Table.getValueAt(selectedRow, 9); 
        if ("Confirmed".equals(status)) { 
            int response = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to cancel the selected booking?",
                "Cancel Booking",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.YES_OPTION) {
                String passengerName = (String) Table.getValueAt(selectedRow, 1); 
                String passportNumber = (String) Table.getValueAt(selectedRow, 4); 
                
                ((DefaultTableModel) Table.getModel()).removeRow(selectedRow);
              
                 if(bookingListener != null) {
                bookingListener.onBookingCanceled(passengerName, passportNumber,flightNo);
            }
               
                 
              
            }
        } else {
            JOptionPane.showMessageDialog(this,
                "Only confirmed bookings can be canceled.",
                "Cancellation Error",
                JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this,
            "Please select a booking to cancel.",
            "No Selection",
            JOptionPane.WARNING_MESSAGE);
    }
                
    }//GEN-LAST:event_CancelActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Book book = new Book(); 
                Ticket_Info ticketInfo = new Ticket_Info(book);
                ticketInfo.setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

  

   
}


