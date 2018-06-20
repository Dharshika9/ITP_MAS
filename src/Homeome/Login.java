
package Homeome;

import Order_management.main;
import static Order_management.Order_details.main;
import ToinEmp.empMain;
import delivery.management.DeliveryMain;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        T1 = new javax.swing.JTextField();
        Pwd1 = new javax.swing.JPasswordField();
        L4 = new javax.swing.JLabel();
        com1 = new javax.swing.JComboBox();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T1.setBackground(new java.awt.Color(102, 102, 102));
        T1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T1.setBorder(null);
        T1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 210, 30));

        Pwd1.setBackground(new java.awt.Color(102, 102, 102));
        Pwd1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        Pwd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pwd1.setBorder(null);
        getContentPane().add(Pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 335, 210, 30));

        L4.setBackground(new java.awt.Color(204, 204, 255));
        L4.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        L4.setForeground(new java.awt.Color(153, 153, 153));
        L4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicle/image/User-Group-icon.png"))); // NOI18N
        L4.setText("     Login As");
        getContentPane().add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 130, 30));

        com1.setBackground(new java.awt.Color(51, 51, 51));
        com1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        com1.setForeground(new java.awt.Color(153, 153, 153));
        com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select  User", "Order Manager", "Clerk", "Manager", "Delivery Manager" }));
        com1.setBorder(null);
        com1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com1ActionPerformed(evt);
            }
        });
        getContentPane().add(com1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 210, 30));

        B1.setBackground(new java.awt.Color(51, 51, 51));
        B1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicle/image/103402-3d-glossy-green-orb-icon-business-key6.png"))); // NOI18N
        B1.setText("Login");
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B1.setMaximumSize(new java.awt.Dimension(110, 30));
        B1.setMinimumSize(new java.awt.Dimension(110, 30));
        B1.setPreferredSize(new java.awt.Dimension(110, 30));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 110, 30));

        B2.setBackground(new java.awt.Color(51, 51, 51));
        B2.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicle/image/reset.png"))); // NOI18N
        B2.setText("Reset");
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B2.setMaximumSize(new java.awt.Dimension(110, 30));
        B2.setMinimumSize(new java.awt.Dimension(110, 30));
        B2.setPreferredSize(new java.awt.Dimension(110, 30));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 110, 30));

        B3.setBackground(new java.awt.Color(51, 51, 51));
        B3.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicle/image/cancel.png"))); // NOI18N
        B3.setText("Cancel");
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B3.setMaximumSize(new java.awt.Dimension(110, 30));
        B3.setMinimumSize(new java.awt.Dimension(110, 30));
        B3.setPreferredSize(new java.awt.Dimension(110, 30));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicle/image/loginnew2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void com1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com1ActionPerformed

    }//GEN-LAST:event_com1ActionPerformed

    
    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_B3ActionPerformed

    
    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        T1.setText(null);
        Pwd1.setText(null);
        com1.setSelectedIndex(0);
    }//GEN-LAST:event_B2ActionPerformed

    
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

        String usertype = com1.getSelectedItem().toString();

        if(T1.getText().length()==0)  // Checking for empty field
                JOptionPane.showMessageDialog(null, "Empty fields detected !");

        else if(Pwd1.getPassword().length==0)  // Checking for empty field
                JOptionPane.showMessageDialog(null, "Empty fields detected !");

        else {
                String user = T1.getText();
                //char[] pass ;//= Pwd1.getPassword();//assign to string array
                String utype = (String) com1.getSelectedItem();
                String pwd =Pwd1.getText();// converting from array to string
                
                if(user.equals("aaa") && pwd.equals("123") && utype.equals("Clerk")/*validate_login(user,pwd,utype)&& (utype.equals("Manager"))*/){
                    T1.setText(null);
                    Pwd1.setText(null);
                    com1.setSelectedItem(null);
                               T1.setText(null);
         main M1=new main();//pop up new interface
                    M1.setVisible(true);
                    this.dispose();

                    }
                else if(user.equals("qqq") && pwd.equals("123") && utype.equals("Clerk")/*validate_login(user,pwd,utype)&& (utype.equals("Manager"))*/){
                    Pwd1.setText(null);
                    com1.setSelectedItem(null);
                    empMain M2=new empMain();//pop up new interface
                    M2.setVisible(true);
                    this.dispose();

                    }
                else if(user.equals("Delivery") && pwd.equals("Delivery123") && utype.equals("Delivery Manager")/*validate_login(user,pwd,utype)&& (utype.equals("Manager"))*/){
                    Pwd1.setText(null);
                    com1.setSelectedItem(null);
                    DeliveryMain M3=new DeliveryMain();//pop up new interface
                    M3.setVisible(true);
                    this.dispose();

                    }

//                else if(validate_login(user,pwd,utype)&& (utype.equals("Clerk"))){
//                    T1.setText(null);
//                    Pwd1.setText(null);
//                    com1.setSelectedItem(null);
//                    Employee C1=new Employee();//pop up new interface
//                    C1.setVisible(true);
//                    this.dispose();
//                    //JOptionPane.showMessageDialog(null, "Correct Login");
//                }

                else
                    JOptionPane.showMessageDialog(null, "Incorrect Login");
//        }
//        
    }//GEN-LAST:event_B1ActionPerformed

    
//private boolean validate_login(String username,String password,String usertype) {
//    
////        try{           
////            Class.forName("com.mysql.jdbc.Driver");  // get database connection
////            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testproject?" + "user=root&password=");     
////            PreparedStatement prest = conn.prepareStatement("Select * from login_ where username=? and password=? and usertype=?");
////            prest.setString(1, username); 
////            prest.setString(2, password);
////            prest.setString(3, usertype);
////            ResultSet rs = prest.executeQuery();                        
////            if(rs.next())            
////                return true;    
////            else
////                return false;            
////            }
////        
////        catch(Exception e){
////            e.printStackTrace();
////            return false;
////        }       
}

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JLabel L4;
    private javax.swing.JPasswordField Pwd1;
    private javax.swing.JTextField T1;
    private javax.swing.JComboBox com1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

  /* private void systemExit{

     WindowEvent winclosing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
}*/

    void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 



}
