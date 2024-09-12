/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bluewhale;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kavindi
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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

        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnReload = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSearchRoom = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRooms = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bluewhale/bg45.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(51, 204, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        btnReload.setBackground(new java.awt.Color(0, 0, 204));
        btnReload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setText("Reload");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        jPanel1.add(btnReload);
        jPanel1.add(jLabel4);

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Email Address", "Address", "Phone No", "Password"
            }
        ));
        tblUser.setCellSelectionEnabled(true);
        tblUser.setShowGrid(true);
        jScrollPane1.setViewportView(tblUser);

        jPanel1.add(jScrollPane1);

        jTabbedPane1.addTab("User", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        btnSearchRoom.setBackground(new java.awt.Color(0, 0, 204));
        btnSearchRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchRoom.setText("Reload");
        btnSearchRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchRoomActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearchRoom);

        tblRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room No", "Room Name", "Room Type", "Capacity", "Price per Day"
            }
        ));
        tblRooms.setCellSelectionEnabled(true);
        tblRooms.setShowGrid(true);
        jScrollPane2.setViewportView(tblRooms);

        jPanel2.add(jScrollPane2);

        jTabbedPane1.addTab("Rooms", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 600, 430));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("WELCOME ADMIN!!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bluewhale/close.jpg"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 0, 17, 19));

        btnSignOut.setBackground(new java.awt.Color(0, 153, 255));
        btnSignOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bluewhale/logout.png.jpg"))); // NOI18N
        btnSignOut.setText("Sign Out");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 160, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bluewhale/bg45.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1250, -840, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        int value = JOptionPane.showConfirmDialog(this, "Do you want to Sign Out ?");
        if (value == JOptionPane.YES_OPTION) {
            setVisible(false);
            signIn signIn = new signIn();
            signIn.setVisible(true);
        } else {
            setVisible(true);
        }
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
       //insert the database user table values for the table in admin page
       DefaultTableModel model = (DefaultTableModel) tblUser.getModel();
        model.setRowCount(0);
        String SQL = "SELECT * FROM User";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/HotelManagementSystem", "root", "1234");
            java.sql.Statement stm = connection.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(SQL);

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String phoneNo = rs.getString("phoneNo");
                String password = rs.getString("password");

                model.addRow(new Object[]{name,email, address, phoneNo, password});
            }
        //exception handling
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Not Found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
       
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnSearchRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchRoomActionPerformed
        //insert the database room table values for the table in admin page
        DefaultTableModel model = (DefaultTableModel) tblRooms.getModel();
        model.setRowCount(0);
        String SQL = "SELECT * FROM Room";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/HotelManagementSystem", "root", "1234");
            java.sql.Statement stm = connection.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(SQL);

            while (rs.next()) {
                String roomNo = rs.getString("roomNo");
                String roomName = rs.getString("roomName");
                String roomType = rs.getString("roomType");
                String capacity = rs.getString("capacity");
                double priceDay = rs.getDouble("priceDay");

                model.addRow(new Object[]{roomNo,roomName, roomType, capacity, priceDay});
            }
        //exception handling
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Not Found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSearchRoomActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnSearchRoom;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblRooms;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables
}
