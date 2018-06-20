
package Maintaince;

import DbConn.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dulangi Rathnayaka
 */
public class Bill_details extends javax.swing.JFrame {
     //db connect    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;//table click

   
    public Bill_details() {
        initComponents();
        showdate();
         //db connect
        con = dbconnect.connect();
        BillNumber.setText(function.getNextID("Bno", "bill", "B10", con));//primary key auto increment
        
        //tableload
        tableload();
    }
    public Bill_details(String Acost ,String Scharge){

        
        String r1 = Acost;
        String r2 = Scharge;
        
        System.out.println(r1);
        
//        double Acost1 = Double.parseDouble(r1);
//        double Scharge1 = Double.parseDouble(r2);
//        double total = Acost1+Scharge1;
//        
//        String total1 = Double.toString(total);
//        
//        RepairAmount.setText(total1);
    
    
    
    }
    
     public void tableload(){
    
    try{
    
        String sql = "SELECT * FROM bill";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        BillTable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch (Exception e) {
            System.out.println(e);
        }
    }
     
     public void showdate(){
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
            Date.setText(s.format(d));
     }
     
      public int isnum(String aa){
       
          int a=1; 
        if(!aa.isEmpty())
        {
            for(int x=0;x<aa.length();x++)
            {
                if(!Character.isDigit(aa.charAt(x)))
                {
                    
                    a=0;
                }
            }

        } 
       return a;
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        MachineID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        OutsourceAmount = new javax.swing.JTextField();
        BillType = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        RepairAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BillSearch = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        BillNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(231, 151));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1130, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MachineID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachineIDActionPerformed(evt);
            }
        });
        jPanel1.add(MachineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 261, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Machine ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 119, -1));

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 180, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 1060, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 10, 230));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Add");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel16)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, 40));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" Delete");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel26)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 160, 40));

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel15MouseExited(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Generate Report");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel27)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addContainerGap())
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 160, 40));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel16MouseExited(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Cancel");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel28)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, 40));

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Refresh");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel29)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, 40));

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel18MouseExited(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(" Update");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(51, 51, 51))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Bill Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 103, 29));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Outsource Amount");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bill Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 119, -1));

        OutsourceAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutsourceAmountActionPerformed(evt);
            }
        });
        jPanel1.add(OutsourceAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 261, -1));

        BillType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Bill Type", "a", "b", "c", "d", "e" }));
        BillType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BillTypeFocusGained(evt);
            }
        });
        jPanel1.add(BillType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 261, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bill Type");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 132, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Date");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Repair Amount");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 90, -1));

        RepairAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RepairAmountFocusLost(evt);
            }
        });
        RepairAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairAmountActionPerformed(evt);
            }
        });
        jPanel1.add(RepairAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 261, -1));

        BillTable.setBackground(new java.awt.Color(153, 153, 153));
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Machine ID", "Bill Number", "Bill Type", "Date", "No Of Unit", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BillTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 1100, 200));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Search by Machine ID/Bill Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 160, -1));

        BillSearch.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BillSearch.setForeground(new java.awt.Color(51, 51, 51));
        BillSearch.setText("Search");
        BillSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillSearchActionPerformed(evt);
            }
        });
        BillSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BillSearchKeyReleased(evt);
            }
        });
        jPanel1.add(BillSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 220, 20));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setMinimumSize(new java.awt.Dimension(74, 16));
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
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Add New");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 0, -1, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 100, 20));

        BillNumber.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BillNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 130, 20));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OutsourceAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutsourceAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutsourceAmountActionPerformed

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel16MouseClicked

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void MachineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MachineIDActionPerformed

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
         jPanel13.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
         jPanel13.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseEntered
        jPanel18.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel18MouseEntered

    private void jPanel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseExited
        jPanel18.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel18MouseExited

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        jPanel14.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
         jPanel14.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
         jPanel15.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel15MouseEntered

    private void jPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseExited
          jPanel15.setBackground(new Color(51,51,51));

    }//GEN-LAST:event_jPanel15MouseExited

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
          jPanel16.setBackground(new Color(0,0,0));
 
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
          jPanel16.setBackground(new Color(51,51,51));

    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
       jPanel17.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
        jPanel17.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel17MouseExited

    private void RepairAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepairAmountActionPerformed

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        String mid = MachineID.getText();
        String bno = BillNumber.getText();
        String btype = BillType.getSelectedItem().toString();
        String date = Date.getText();
        String ramount = RepairAmount.getText();
        String oamount = OutsourceAmount.getText();
        
        //|| ramount.isEmpty() || oamount.isEmpty()
        if(mid.isEmpty() || btype.isEmpty() || date.isEmpty() ){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
//         if(isnum(ramount)==0)
//         {
//             showMessageDialog(null,"Can't use letters in no of unit field");
//         }
        
        else {
        try {
            String h = "INSERT INTO bill (MID,Bno,Btype,date,ramount,oamount) VALUES ('"+mid+"', '"+bno+"', '"+btype+"', '"+date+"', '"+ramount+"', '"+oamount+"')";
            pst = con.prepareStatement(h);
            pst.execute();
            BillNumber.setText(function.getNextID("Bno", "bill", "B10", con));//primary key auto increment

            //load table
            tableload();
            
            JOptionPane.showMessageDialog(null, "Succesfully added.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
       int x = showConfirmDialog(null,"Do you want to Update this");
        
        if(x==0)
        {
             String mid = MachineID.getText();
             String bno = BillNumber.getText();
             String btype = BillType.getSelectedItem().toString();
             String date = Date.getText();
             String ramount = RepairAmount.getText();
             String oamount = OutsourceAmount.getText();
             //String cname = jTextField7.getText();
            // String cid = jTextField8.getText();
            
            
            String sql = "UPDATE bill SET  MID='"+mid+"' , bno='"+bno+"' , btype='"+btype+"' , date='"+date+"', ramount='"+ramount+"' , oamount='"+oamount+"' WHERE Bno='"+bno+"'";
            
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
         //delete 
        int x = showConfirmDialog(null,"Do you want to Delete this");
        
        if(x==0)
        {
            String bno = BillNumber.getText();
            
            String sql = "DELETE from bill WHERE Bno='"+bno+"'";
            
            try {
                
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
       MachineID.setText(null);
       BillNumber.setText(null);
       BillType.setSelectedIndex(0);
       //jTextField4.setText(null);
       RepairAmount.setText(null);
       OutsourceAmount.setText(null);
      // jTextField7.setText(null);
       //jTextField8.setText(null);
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
       BillNumber.setText(function.getNextID("Bno", "bill", "B10", con)); //primary key auto increment
       MachineID.setText(null);
      // jLabel0.setText(null);
       BillType.setSelectedIndex(0);
       //jTextField4.setText(null);
       RepairAmount.setText(null);
       OutsourceAmount.setText(null);
      //jTextField7.setText(null);
       //jTextField8.setText(null);
        
        tableload();
    }//GEN-LAST:event_jPanel17MouseClicked

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
        int r = BillTable.getSelectedRow();
        
        String mid = BillTable.getValueAt(r, 0).toString();
       String bno= BillTable.getValueAt(r, 1).toString();
       String btype = BillTable.getValueAt(r, 2).toString();
       String date = BillTable.getValueAt(r, 3).toString();
       String ramount = BillTable.getValueAt(r, 4).toString();
       String oamount = BillTable.getValueAt(r, 5).toString();
       //String vendor = jTable1.getValueAt(r, 6).toString();
       //String cname= jTable1.getValueAt(r, 7).toString();
       //String cid = jTable1.getValueAt(r, 8).toString();
        
        
       MachineID.setText(mid);
       BillNumber.setText(bno);
       BillType.setSelectedItem(btype);
       Date.setText(date);
       RepairAmount.setText(ramount);
       OutsourceAmount.setText(oamount);
       //jTextField7.setText(cname);
       //jTextField8.setText(cid);
    }//GEN-LAST:event_BillTableMouseClicked

    private void BillSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BillSearchKeyReleased
       String search=BillSearch.getText();
         try {
 
            String sql ="SELECT mid,bno FROM bill where mid LIKE'"+search+"%' OR bno LIKE '"+search+"%' "; 
            pst = con.prepareStatement(sql);
           
            rs =pst.executeQuery();
            
              BillTable.setModel(DbUtils.resultSetToTableModel(rs));

             
       }
       catch(Exception e)
       {
          JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_BillSearchKeyReleased

    private void BillSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillSearchActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        bill_type id;
        id = new bill_type();
        id.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_jPanel5MouseExited

    private void BillTypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BillTypeFocusGained
        BillType.removeAllItems();
        
        //set values to machine type combo box from db
        
        try {
            String sql = "SELECT DISTINCT btype FROM billtype";
            pst = con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
            
                String btype1 = rs.getString("btype");
                BillType.addItem(btype1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BillTypeFocusGained

    private void RepairAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairAmountFocusLost
        //no of unit validation
         String unit = RepairAmount.getText();
         if(isnum(unit)==0)
         {
             showMessageDialog(null,"Can't use letters in no of unit field");
         }
    }//GEN-LAST:event_RepairAmountFocusLost

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
            java.util.logging.Logger.getLogger(Bill_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BillNumber;
    private javax.swing.JTextField BillSearch;
    private javax.swing.JTable BillTable;
    private javax.swing.JComboBox BillType;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField MachineID;
    private javax.swing.JTextField OutsourceAmount;
    private javax.swing.JTextField RepairAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
