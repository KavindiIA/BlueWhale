/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bluewhale;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavindi
 */
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    public Bill() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtStay = new javax.swing.JTextField();
        txtOut = new javax.swing.JTextField();
        txtIn = new javax.swing.JTextField();
        txtFullAmount = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        btnReload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setText("BILL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 15, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Phone Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Check In Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Check Out Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("No of Days Stay");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Full Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel10.setText("THANK YOU!");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        txtPhoneNo.setEditable(false);
        txtPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 268, -1));

        txtAddress.setEditable(false);
        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 268, -1));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 268, -1));

        txtStay.setEditable(false);
        txtStay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtStay, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 268, -1));

        txtOut.setEditable(false);
        txtOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 268, -1));

        txtIn.setEditable(false);
        txtIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 268, -1));

        txtFullAmount.setEditable(false);
        txtFullAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtFullAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 268, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bluewhale/close.jpg"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 0, 16, 17));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("NIC");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 30, 40));

        txtNIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 150, -1));

        btnReload.setBackground(new java.awt.Color(0, 0, 0));
        btnReload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setText("Reload");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        getContentPane().add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        // TODO add your handling code here:
        String searchNIC = txtNIC.getText();
        String checkInSQL = "SELECT * FROM checkIn WHERE id = ?";
        
        try {
            // Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Get the database connection
            try (java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/HotelManagementSystem", "root", "1234")) {

                // set values from user table in database
                try (java.sql.PreparedStatement Pst = connection.prepareStatement(checkInSQL)) {
                    Pst.setString(1, searchNIC);
                    try (java.sql.ResultSet Rs = Pst.executeQuery()) {
                        if (Rs.next()) {
                            txtName.setText(Rs.getString("name"));
                            txtAddress.setText(Rs.getString("email"));
                            txtPhoneNo.setText(Rs.getString("phoneNo"));
                            txtIn.setText(Rs.getString("checkInDate"));
                            txtOut.setText(Rs.getString("checkOutDate"));
                            txtStay.setText(Rs.getString("noOfDay"));
                            txtFullAmount.setText(Rs.getString("fullAmount"));
                            //return RoomNo;
                        } else {
                            JOptionPane.showMessageDialog(this, "NIC not found in User table.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                
                
                //exception handling
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Driver Not Found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnReloadActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Bill().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFullAmount;
    private javax.swing.JTextField txtIn;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOut;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtStay;
    // End of variables declaration//GEN-END:variables
}
