/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

import DbConn.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;
public class CMeats extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    public CMeats() {
        initComponents();
        conn = dbconnect.connect();
        tableload1();
        foodName.setVisible(false);
    }

    public void tableload1(){
    
        try{
        
            String sql = "SELECT FoodName as 'Vegi Name',Quantity FROM Food where FoodID like 'm%'";
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rst));
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    public int isnumber(String m)
    {
        int a = 1;
        
        if(!m.isEmpty())
        {
            for(int i=0;i<m.length();i++)
            {
                if(!Character.isDigit(m.charAt(i)))
                {
                    a=0;
                }
            }
        }
        
        return a;
    }
    public int width(String m)
    {
        int a=1;
        
        if(!m.isEmpty())
        {
            if(m.length()>=4)
            {
                a =0;
            }
        }
        return a;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Get = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchtext = new javax.swing.JTextField();
        Search = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        foodName = new javax.swing.JLabel();
        Refresh = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(457, 247));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(871, 424));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Meats");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 29, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Foodname", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 108, 515, 216));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel4.setPreferredSize(new java.awt.Dimension(871, 424));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Foodname", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 108, 515, 216));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(124, 37));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quanitity");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 195, 132, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Foodname");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 140, -1, -1));

        quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 197, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("kg");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, -1, -1));

        Get.setBackground(new java.awt.Color(51, 51, 51));
        Get.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Get.setPreferredSize(new java.awt.Dimension(124, 37));
        Get.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GetMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GetMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Get");

        javax.swing.GroupLayout GetLayout = new javax.swing.GroupLayout(Get);
        Get.setLayout(GetLayout);
        GetLayout.setHorizontalGroup(
            GetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GetLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        GetLayout.setVerticalGroup(
            GetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel4.add(Get, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, -1));

        searchtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(searchtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 342, 118, 37));

        Search.setBackground(new java.awt.Color(102, 102, 102));
        Search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Search.setForeground(new java.awt.Color(102, 102, 102));
        Search.setPreferredSize(new java.awt.Dimension(124, 37));
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchMouseExited(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Search");

        javax.swing.GroupLayout SearchLayout = new javax.swing.GroupLayout(Search);
        Search.setLayout(SearchLayout);
        SearchLayout.setHorizontalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        SearchLayout.setVerticalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel4.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 342, -1, -1));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        foodName.setBackground(new java.awt.Color(51, 51, 51));
        foodName.setForeground(new java.awt.Color(255, 255, 255));
        foodName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foodName, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foodName, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 140, 90, 30));

        Refresh.setBackground(new java.awt.Color(51, 51, 51));
        Refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Refresh.setForeground(new java.awt.Color(51, 51, 51));
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RefreshMouseExited(evt);
            }
        });
        Refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Refresh");
        Refresh.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 1, 47, 26));

        jPanel4.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 320, 120, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();

        String v_name  = jTable1.getValueAt(r,0).toString();
        //        String v_Quan  = jTable1.getValueAt(r, 1).toString();

        foodName.setText(v_name);
        quantity.setText(null);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int r = jTable1.getSelectedRow();

        String v_name  = jTable1.getValueAt(r,0).toString();
        //        String v_Quan  = jTable1.getValueAt(r, 1).toString();

        foodName.setText(v_name);
        quantity.setText(null);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void GetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetMouseClicked
        String v_quan1 =quantity.getText();
        String v_id = foodName.getText();
        //        String v_id = "V0";

        double v1 = 0;
        double v2 = 0;
        double vv = 0;

        if( v_id.isEmpty())
        {
            showMessageDialog(null,"please Select from Table");

        }
        else if( v_quan1.isEmpty())
        {
            showMessageDialog(null,"please set quantity");

        }
        else if(isnumber(v_quan1)==0)
        {
            showMessageDialog(null,"No letters are allowed ");
            quantity.setText(null);
        }
        else if(width(v_quan1)==0)
        {
            showMessageDialog(null,"No more than 3 digits ");
            quantity.setText(null);
        }

        else{
            int x = JOptionPane.showConfirmDialog(null,"Do you want to Get this ?");

            if(x==0)
            {
                try {
                    String sql1 = "SELECT * FROM Food WHERE FoodName='"+v_id+"'";
                    pst = conn.prepareStatement(sql1);
                    rst = pst.executeQuery();

                    {
                        while(rst.next())
                        {

                            v2 = rst.getDouble("Quantity");
                            //                            System.out.println(v2);

                        }

                        v1 = Double.parseDouble(v_quan1);
                        vv=v2-v1;
                        String v_quan2 = Double.toString(vv);

                        String sql = "UPDATE Food SET Quantity='"+v_quan2+"' WHERE FoodName='"+v_id+"'";
                        pst = conn.prepareStatement(sql);
                        pst.execute();

                        tableload1();
                        showMessageDialog(null,"Successfully Got");
                    }

                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }

    }//GEN-LAST:event_GetMouseClicked

    private void GetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetMouseEntered
        int r = jTable1.getSelectedRow();
        if(r>=0){
            String v_id = jTable1.getValueAt(r,0).toString();
            jLabel2.setText(v_id);

            Get.setBackground(new Color (255,102,102));
        }
        else
        {
            Get.setBackground(new Color (255,102,102));
        }
    }//GEN-LAST:event_GetMouseEntered

    private void GetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetMouseExited
        int r = jTable1.getSelectedRow();
        if(r>=0){
            String v_id = jTable1.getValueAt(r,0).toString();
            //        jLabel5.setText(null);

            Get.setBackground(new Color (51,51,51));
        }
        else
        {
            Get.setBackground(new Color (51,51,51));
        }

    }//GEN-LAST:event_GetMouseExited

    private void GetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetMousePressed
        Get.setBackground(new Color (0,255,0));
    }//GEN-LAST:event_GetMousePressed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked

        String search = searchtext.getText();

        if(search.isEmpty())
        {
            showMessageDialog(null,"Eneter Vegi Name");
        }
        else
        {
            String sql = "SELECT FoodName,Quantity FROM Food WHERE FoodName LIKE '%"+search+"%' and FoodID LIKE 'm%'";

            try {
                pst = conn.prepareStatement(sql);
                rst = pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rst));

                searchtext.setText(null);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_SearchMouseClicked

    private void SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseEntered
        Search.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_SearchMouseEntered

    private void SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseExited
        Search.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_SearchMouseExited

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        foodName.setText(null);
        quantity.setText(null);
        searchtext.setText(null);

        tableload1();
    }//GEN-LAST:event_RefreshMouseClicked

    private void RefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseEntered

        Refresh.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_RefreshMouseEntered

    private void RefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseExited
        Refresh.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_RefreshMouseExited

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
            java.util.logging.Logger.getLogger(CMeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CMeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CMeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CMeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CMeats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Get;
    private javax.swing.JPanel Refresh;
    private javax.swing.JPanel Search;
    private javax.swing.JLabel foodName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField searchtext;
    // End of variables declaration//GEN-END:variables
}
