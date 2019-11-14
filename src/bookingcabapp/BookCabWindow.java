/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingcabapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Manan patel
 */
public class BookCabWindow extends javax.swing.JFrame {

    /**
     * Creates new form BookCabWindow
     */
    public Customer Customer;
    public void transC(Customer Customer)
    {
        this.Customer=Customer;
    }
    
    public BookCabWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jlabel_closewind = new javax.swing.JLabel();
        jLabel_minimizewind = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5Back = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1_pickup = new javax.swing.JComboBox<>();
        jComboBox2_dropoff = new javax.swing.JComboBox<>();
        jButton1_BookNow = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        jlabel_closewind.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlabel_closewind.setText("X");
        jlabel_closewind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabel_closewind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel_closewindMouseClicked(evt);
            }
        });

        jLabel_minimizewind.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_minimizewind.setText("_");
        jLabel_minimizewind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimizewind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizewindMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Ride Details");

        jLabel5Back.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5Back.setText("←");
        jLabel5Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(243, 243, 243)
                .addComponent(jLabel_minimizewind)
                .addGap(18, 18, 18)
                .addComponent(jlabel_closewind)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_closewind)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5Back)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel_minimizewind)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DropOff Location");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PickUp Location");

        jComboBox1_pickup.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBox1_pickup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fist of the First Men", "Castle Black", "East Watch", "Shadow Tower", "Craster's Keep" }));
        jComboBox1_pickup.setSelectedIndex(1);
        jComboBox1_pickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_pickupActionPerformed(evt);
            }
        });

        jComboBox2_dropoff.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBox2_dropoff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fist of the First Men", "Castle Black", "East Watch", "Shadow Tower", "Craster's Keep" }));
        jComboBox2_dropoff.setSelectedIndex(1);
        jComboBox2_dropoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2_dropoffActionPerformed(evt);
            }
        });

        jButton1_BookNow.setBackground(new java.awt.Color(255, 255, 0));
        jButton1_BookNow.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1_BookNow.setText("Confirm Booking");
        jButton1_BookNow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_BookNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_BookNowMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TARAL THAKKAR\\Desktop\\Tale_map_Three-Eyed_Raven_North1.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(233, 233, 233))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2_dropoff, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1_pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jButton1_BookNow)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1_pickup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox2_dropoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1_BookNow)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1_pickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_pickupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_pickupActionPerformed

    private void jComboBox2_dropoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2_dropoffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2_dropoffActionPerformed

    private void jButton1_BookNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_BookNowMouseClicked
        String pl = jComboBox1_pickup.getSelectedItem().toString();
        String dl = jComboBox2_dropoff.getSelectedItem().toString();
        int pi = jComboBox1_pickup.getSelectedIndex();
        int di = jComboBox2_dropoff.getSelectedIndex();
        Location loc = new Location();
        int fare = loc.getfare(pi, di);
        if (pl.equals(dl))
            {
                JOptionPane.showMessageDialog(null, "Change Dropoff Location.");
            }
        else{
            if( fare > Customer.getWallet()){
                        JOptionPane.showMessageDialog(null, "Insufficient Wallet balance for the trip.");
                    }
            else if (Customer.BookACab(pi)==-1)
            {
                JOptionPane.showMessageDialog(null, "Request Timeout!");
            }
            else{
                    Confirmation cf = new Confirmation(pi,di,Customer);
                    cf.setVisible(true);
                    cf.pack();
                    cf.setLocationRelativeTo(null);
                    cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                    
                    Thread t1 = new Thread(cf);
                    t1.start();
            }
        }
    }//GEN-LAST:event_jButton1_BookNowMouseClicked

    private void jlabel_closewindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel_closewindMouseClicked
        this.dispose();
    }//GEN-LAST:event_jlabel_closewindMouseClicked

    private void jLabel_minimizewindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizewindMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizewindMouseClicked

    private void jLabel5BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5BackMouseClicked
        HomePage mp = new HomePage();
        mp.setVisible(true);
        mp.pack();
        mp.setLocationRelativeTo(null);
        mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String usname = Customer.getUsername();
        mp.jLabel_u.setText("Welcome, "+ usname);
        mp.transC(Customer);
        this.dispose();
    }//GEN-LAST:event_jLabel5BackMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookCabWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookCabWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookCabWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookCabWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookCabWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_BookNow;
    private javax.swing.JComboBox<String> jComboBox1_pickup;
    private javax.swing.JComboBox<String> jComboBox2_dropoff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5Back;
    private javax.swing.JLabel jLabel_minimizewind;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlabel_closewind;
    // End of variables declaration//GEN-END:variables
}
