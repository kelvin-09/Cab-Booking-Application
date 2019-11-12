/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingcabapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Confirmation extends javax.swing.JFrame implements Runnable{
    int driverIndex;
    int dur;
    int distance;
    int fare;
    String drivername;
    /**
     * Creates new form Confirmation
     */
    public Confirmation(int pi,int di) {
        initComponents();
        Location l = new Location();
        distance = l.getDistance(pi,di);
        dur = l.tripDuration(pi,di);
        fare = l.getfare(pi,di);
        driverIndex = Customer.BookACab(pi);
        double rati;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabbookingapp?serverTimezone=UTC","root","preet@0431");
                ResultSet rs;
                String query = "select * from driver";
                PreparedStatement st = con.prepareStatement(query);
                rs = st.executeQuery();
                rs.next();
                for(int i=0;i<driverIndex;++i)
                    rs.next();
                rati =  rs.getDouble("rating");
                DecimalFormat df = new DecimalFormat("#.0");
                
                drivername = rs.getString("drivername");
                jLabeld_name1.setText("Drivername : "+drivername);
                jLabeld_rating.setText("Rating :"+df.format(rati));
                jLabeld_t_no.setText("Vehicle ID :"+rs.getString("tno"));
                jlabeld_phno.setText("Phone Number :"+rs.getString("phno"));
                jLabeldistance.setText("Approximate Trip Distance :"+ distance+" Km");
                jLabelduration.setText("Approximate Trip Duration :"+dur+" minutes");
                jLabelfare.setText("Approximate Fare : "+fare+" Rs");
                Customer.reduceWallet(fare);
                st.close();
                con.close();
                }
            catch(ClassNotFoundException | SQLException e){
                System.out.println("Exception:"+e);
                }
            
    }

    @Override
    public void run(){
            Driver.updateAval(driverIndex,0);
            try{Thread.sleep(dur*10000);} catch(InterruptedException e){}
            Driver.updateAval(driverIndex,1);
            int wallet = Customer.getWallet();
            Bill b = new Bill();
            b.setVisible(true);
            b.pack();
            b.setLocationRelativeTo(null);
            b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            b.getDriverIndex(driverIndex);
            b.jLabel_fare.setText(fare+"");
            b.jLabel_Duration.setText(dur+"");
            b.jLabel_Distance.setText(distance+"");
            b.jLabel_Wallet.setText(wallet+"");
            this.dispose();
        } 
      
    

    
    private Confirmation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_minimizewind = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabeld_name1 = new javax.swing.JLabel();
        jlabeld_phno = new javax.swing.JLabel();
        jLabeld_t_no = new javax.swing.JLabel();
        jLabeld_rating = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabeldistance = new javax.swing.JLabel();
        jLabelduration = new javax.swing.JLabel();
        jLabelfare = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Booking Details");

        jLabel_minimizewind.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_minimizewind.setText("_");
        jLabel_minimizewind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimizewind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizewindMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(176, 176, 176)
                .addComponent(jLabel_minimizewind)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_minimizewind)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Driver Details :");

        jLabeld_name1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabeld_name1.setForeground(new java.awt.Color(255, 255, 255));
        jLabeld_name1.setText("jLabel1");

        jlabeld_phno.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jlabeld_phno.setForeground(new java.awt.Color(255, 255, 255));
        jlabeld_phno.setText("jLabel1");

        jLabeld_t_no.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabeld_t_no.setForeground(new java.awt.Color(255, 255, 255));
        jLabeld_t_no.setText("jLabel1");

        jLabeld_rating.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabeld_rating.setForeground(new java.awt.Color(255, 255, 255));
        jLabeld_rating.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ride Details :");

        jLabeldistance.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabeldistance.setForeground(new java.awt.Color(255, 255, 255));
        jLabeldistance.setText("jLabel1");

        jLabelduration.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelduration.setForeground(new java.awt.Color(255, 255, 255));
        jLabelduration.setText("jLabel1");

        jLabelfare.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelfare.setForeground(new java.awt.Color(255, 255, 255));
        jLabelfare.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabeldistance, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlabeld_phno, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabeld_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabeld_t_no, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabeld_rating, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelduration, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelfare, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabeld_name1)
                .addGap(18, 18, 18)
                .addComponent(jlabeld_phno)
                .addGap(18, 18, 18)
                .addComponent(jLabeld_t_no)
                .addGap(18, 18, 18)
                .addComponent(jLabeld_rating)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabeldistance)
                .addGap(18, 18, 18)
                .addComponent(jLabelduration)
                .addGap(18, 18, 18)
                .addComponent(jLabelfare)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimizewindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizewindMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizewindMouseClicked

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
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_minimizewind;
    private javax.swing.JLabel jLabeld_name1;
    private javax.swing.JLabel jLabeld_rating;
    private javax.swing.JLabel jLabeld_t_no;
    private javax.swing.JLabel jLabeldistance;
    private javax.swing.JLabel jLabelduration;
    private javax.swing.JLabel jLabelfare;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabeld_phno;
    // End of variables declaration//GEN-END:variables

   // @Override
    //public void run() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
}
