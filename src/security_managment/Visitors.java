/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package security_managment;

//import com.sun.corba.se.spi.legacy.connection.Connection;
import DbConn.dbconnect;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author Tharindu sachintha
 */
public class Visitors extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    /** Creates new form Visitors */
    public Visitors() {
        initComponents();
       con=dbconnect.connect();
       SetTable();
       Vid.setEditable(false);
    }

    void reset()
    {
                Vid.setText(null);
                idno.setText(null);
                name.setText(null);
                address.setText(null);
                telno.setText(null);
                pur.setText(null); 
                stat.setText(null);
                crd.setText(null);
                se.setText(null);
                
    }
    
     void SetTable()
    {
            String sql="Select idvisitor,name,idno,purpose,status,card,telephoneno,dependent,date from visitor ";
            
            try{
                pst=con.prepareStatement(sql);
                rs=pst.executeQuery();
                
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e)
            {
            
            }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Vid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        telno = new javax.swing.JTextField();
        stat = new javax.swing.JTextField();
        pur = new javax.swing.JTextField();
        idno = new javax.swing.JTextField();
        se = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        crd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(165, 130));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1180, 650));
        setSize(new java.awt.Dimension(1180, 640));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visitor Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 59, -1));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Telephone No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 244, 80, -1));

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Purpose");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Id No");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 39, -1));

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Card");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 77, 31, -1));

        Vid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VidKeyReleased(evt);
            }
        });
        jPanel1.add(Vid, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 84, 200, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 144, 200, -1));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 324, 200, -1));

        telno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telnoKeyPressed(evt);
            }
        });
        jPanel1.add(telno, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 241, 200, -1));
        jPanel1.add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 77, 130, -1));
        jPanel1.add(pur, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 191, 300, -1));

        idno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idnoKeyPressed(evt);
            }
        });
        jPanel1.add(idno, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 284, 200, -1));

        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });
        jPanel1.add(se, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 144, 130, 28));

        jLabel18.setText("Add");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 144, -1, -1));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Update");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel21)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 80, -1));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Delete");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 80, -1));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("VISITOR DEATILS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(crd, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 77, 130, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Visitor Id", "Name", "Id no", "Purpose", "Status", "card", "mobile", "dependent", "date"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 750, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        
        String sql="select * from visitor where idvisitor=?";
        
        try{
            
            pst=con.prepareStatement(sql);
            pst.setString(1,se.getText());
            rs=pst.executeQuery();
            
            if(rs.next())
            {
                Vid.setText(rs.getString("idvisitor"));
                idno.setText(rs.getString("idno"));
                name.setText(rs.getString("name"));
                address.setText(rs.getString("address"));
                telno.setText(rs.getString("telephoneno"));
                pur.setText(rs.getString("purpose"));
                stat.setText(rs.getString("status"));
                crd.setText(rs.getString("card"));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Visitor ID");
            }
        }
        catch(Exception e)
        {
        
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        String sql="update visitor set idno=?,name=?,address=?,telephoneno=?,purpose=? where idvisitor=?";
        
        try{
            pst=con.prepareStatement(sql);
            
            pst.setString(1,idno.getText());
            pst.setString(2,name.getText());
            pst.setString(3,address.getText());
            pst.setString(4,telno.getText());
            pst.setString(5,pur.getText());
            pst.setString(6,Vid.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Suseesss");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        SetTable();
        reset();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        String sql="delete from visitor where idvisitor=? ";
        
        String id=Vid.getText();
        
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,Vid.getText());
            
            int msg=JOptionPane.showConfirmDialog(null,"Do you need to delete Visitor :"+id, "close",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
            
            if(msg==JOptionPane.YES_OPTION)
            {
                pst.executeUpdate();
            }
            
        }
        catch(Exception e)
        {
        
        }
        SetTable();
        reset();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void VidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VidKeyReleased
        // TODO add your handling code here:
        
               String visitor=Vid.getText();
        
          String sql="select idvisitor,status,card from visitor where idvisitor=?";
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,Vid.getText());
            rs=pst.executeQuery();
            
           if(rs.next())
            {
                if(visitor.equals(rs.getString("idvisitor")))
                {
                    stat.setText(rs.getString("status"));
                    crd.setText(rs.getString("card"));
                }
                
            }
                else
                {
                        stat.setText("wrong ID"); 
                        crd.setText("Not isssue Card");
                       
                   }
            

        }
        
         catch(Exception e)
        {
                             
        }
    }//GEN-LAST:event_VidKeyReleased

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        int x=JOptionPane.showConfirmDialog(null,"Do you really want to update");
        if (x==0);
        {  String sql="update visitor set idno=?,name=?,address=?,telephoneno=?,purpose=? where idvisitor=?";
        
        try{
            pst=con.prepareStatement(sql);
            
            pst.setString(1,idno.getText());
            pst.setString(2,name.getText());
            pst.setString(3,address.getText());
            pst.setString(4,telno.getText());
            pst.setString(5,pur.getText());
            pst.setString(6,Vid.getText());
            
            pst.executeUpdate();
            
            
            if(telno.getBackground()==Color.red || telno.getText().length()<10 )
            {
                JOptionPane.showMessageDialog(null,"Wrong Telephone number");
                telno.setText(null);
                
            }
            else if(idno.getBackground()==Color.red || idno.getText().length()<10 )
            {
                JOptionPane.showMessageDialog(null,"Wrong National Id");
                idno.setText(null);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Succeess");
                reset();
            
            }
                
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
        
        SetTable();
        
        
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void telnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telnoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()>=KeyEvent.VK_0 && evt.getKeyCode()<=KeyEvent.VK_9 || evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
        {
            if(telno.getText().length()>9)
            {
                if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
                {
                    telno.setEditable(true);
                }
                else
                {
                    telno.setBackground(Color.white);
                    telno.setEditable(false);
                }
            }
            else 
            {
                telno.setBackground(Color.white);
                telno.setEditable(true);
            }
        }
        else
        {
            telno.setEditable(false);
            telno.setBackground(Color.red);
        }
    }//GEN-LAST:event_telnoKeyPressed

    private void idnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()>=KeyEvent.VK_0 && evt.getKeyCode()<=KeyEvent.VK_9 || evt.getKeyCode()==KeyEvent.VK_V || evt.getKeyCode()==KeyEvent.VK_BACK_SPACE )
        {
             if(idno.getText().length()>9)
            {
                if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
                {
                    idno.setEditable(true);
                }
                else
                {
                    idno.setBackground(Color.white);
                    idno.setEditable(false);
                }
            }
            else 
            {
                idno.setBackground(Color.white);
                idno.setEditable(true );
            }
            //idno.setBackground(Color.white);
        }
        else
        {
            idno.setBackground(Color.red);
             idno.setEditable(false);
        }
    }//GEN-LAST:event_idnoKeyPressed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
         jPanel4.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
         jPanel5.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
         jPanel2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel2MouseExited

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
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visitors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Vid;
    private javax.swing.JTextField address;
    private javax.swing.JTextField crd;
    private javax.swing.JTextField idno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pur;
    private javax.swing.JTextField se;
    private javax.swing.JTextField stat;
    private javax.swing.JTable table;
    private javax.swing.JTextField telno;
    // End of variables declaration//GEN-END:variables

}
