/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;
import DbConn.dbconnect;
import static DbConn.dbconnect.connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Dharshika
 */
public class SearchRawmaterialsbyName extends javax.swing.JFrame {

    /**
     * Creates new form SearchRawmaterialsbyName
     */
    public SearchRawmaterialsbyName() {
        initComponents();
    }

    public ArrayList<RawmaterialsModel> getInventoryList()
    {
        ArrayList<RawmaterialsModel> inventoryList=new ArrayList<>();
        Connection connection = connect();
        String query="Select * from rawmaterials WHERE category LIKE '%"+txt_search.getText()+"%'";
        
        Statement st;
        ResultSet rs;
        
        try {
            st=connection.createStatement();
            rs=st.executeQuery(query);
            RawmaterialsModel invmodel;
            
            while(rs.next())
            {
                invmodel=new RawmaterialsModel(rs.getInt("code"), rs.getString("category"), rs.getString("subcategory"), rs.getString("name"), rs.getString("color"), rs.getString("unitmeasure"), rs.getDouble("startinginv"), rs.getDouble("reorder"), rs.getDouble("cost"), rs.getDouble("stockqty"), rs.getString("orderstatus"),rs.getBytes("image"));
                inventoryList.add(invmodel);
            }
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return inventoryList;
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
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_inv_info = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(230, 120));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        txt_search.setBackground(new java.awt.Color(204, 204, 204));
        txt_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        jTable_inv_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Category", "SubCategory", "Name", "Color", "Units/ measure", "Starting Inventory", "Reorder Level", "Cost/Unit", "Stock Qty", "Status"
            }
        ));
        jTable_inv_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_inv_infoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_inv_info);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RawMeterial Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Press ENTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(300, 300, 300))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        ArrayList<RawmaterialsModel> listdata=getInventoryList();
        DefaultTableModel model =(DefaultTableModel)jTable_inv_info.getModel();
        
        //clear all the row before apend the data tot he view
        DefaultTableModel mod = (DefaultTableModel)jTable_inv_info.getModel();
        mod.setRowCount(0);
        
        Object [] row=new Object[11];
        for(int i = 0;i<listdata.size();i++)
        {
            row[0]=listdata.get(i).getCode();
            row[1]=listdata.get(i).getCategory();
            row[2]=listdata.get(i).getSubcategory();
            row[3]=listdata.get(i).getName();
            row[4]=listdata.get(i).getColor();
            row[5]=listdata.get(i).getUnitmeasure();
            row[6]=listdata.get(i).getStartinv();
            row[7]=listdata.get(i).getReorder();
            row[8]=listdata.get(i).getCost();
            row[9]=listdata.get(i).getStockqty();
            row[10]=listdata.get(i).getOrderstatus();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_txt_searchActionPerformed

    private void jTable_inv_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_inv_infoMouseClicked
        
    }//GEN-LAST:event_jTable_inv_infoMouseClicked

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
            java.util.logging.Logger.getLogger(SearchRawmaterialsbyName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRawmaterialsbyName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRawmaterialsbyName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRawmaterialsbyName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRawmaterialsbyName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_inv_info;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
