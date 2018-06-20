
package Maintaince;

import DbConn.dbconnect;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;

public class Warranty_Details extends javax.swing.JFrame {

    //db connect    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;//table click
    
    public Warranty_Details() {
        initComponents();
        showdate();
        WarrantyCode.setText(function.getNextID("Wcode", "warranty", "W10", con)); //primary key auto increment
        
        //db connect
        con = dbconnect.connect();
        
        //tableload
        tableload();
    }
    
     public void tableload(){
    
    try{
    
        String sql = "SELECT * FROM warranty";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        WarrantyTable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch (Exception e) {
            System.out.println(e);
        }
    }
     public void showdate(){
         //date
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
            StartDate.setText(s.format(d));
            
//            Date d1 = new Date();
//            SimpleDateFormat s1 = new SimpleDateFormat("YYYY-MM-dd");
//            jTextField4.setText(s.format(d1));
            
            
    }
     //only number
      public int isnum(String aa){
       
          int a=1; 
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
      
      //only letters
      public int isletters(String aa){
       
          int a=1; 
        if(!aa.isEmpty())
        {
            for(int x=0;x<aa.length();x++)
            {
                if(!Character.isLetter(aa.charAt(x)))
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EndDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        WarrantySupplier = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ContactNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        WarrantyTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MachineID = new javax.swing.JTextField();
        StartDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        WarrantySearch = new javax.swing.JTextField();
        WarrantyCode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(231, 151));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    Warranty Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 183, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Machine ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 119, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Warranty Code");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 119, -1));

        EndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDateActionPerformed(evt);
            }
        });
        jPanel1.add(EndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 261, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Start Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 119, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("End Date");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 119, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Warranty Supplier");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 119, -1));

        WarrantySupplier.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                WarrantySupplierFocusLost(evt);
            }
        });
        WarrantySupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarrantySupplierActionPerformed(evt);
            }
        });
        jPanel1.add(WarrantySupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 261, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contact No:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 119, -1));

        ContactNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContactNoFocusLost(evt);
            }
        });
        ContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNoActionPerformed(evt);
            }
        });
        jPanel1.add(ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 261, -1));

        WarrantyTable.setBackground(new java.awt.Color(102, 102, 102));
        WarrantyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Warranty Code", "Machine ID", "Start Date", "End Date", "Warranty Sup.", "Contact No."
            }
        ));
        WarrantyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WarrantyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(WarrantyTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1110, 190));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 10, 230));

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 1040, -1));

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
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Add");
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, 35, -1));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 160, 40));

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
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(" Update");
        jPanel18.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 160, 40));

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
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" Delete");
        jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 13, -1, -1));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 160, 40));

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
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Generate Report");
        jPanel15.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, -1, -1));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 160, 40));

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

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, -1, 40));

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
                .addGap(58, 58, 58)
                .addComponent(jLabel28)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("<");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, -1));

        MachineID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachineIDActionPerformed(evt);
            }
        });
        jPanel1.add(MachineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 261, -1));

        StartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateActionPerformed(evt);
            }
        });
        jPanel1.add(StartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 261, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Search by Machine ID/Warranty Code");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 60, -1, -1));

        WarrantySearch.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        WarrantySearch.setForeground(new java.awt.Color(51, 51, 51));
        WarrantySearch.setText("Search");
        WarrantySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarrantySearchActionPerformed(evt);
            }
        });
        WarrantySearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WarrantySearchKeyReleased(evt);
            }
        });
        jPanel1.add(WarrantySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 220, 20));

        WarrantyCode.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(WarrantyCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndDateActionPerformed

    private void WarrantySupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarrantySupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WarrantySupplierActionPerformed

    private void ContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNoActionPerformed

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
       this.dispose();
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        jPanel13.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseEntered
        jPanel18.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel18MouseEntered

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        jPanel14.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
       jPanel15.setBackground(new Color (0,0,0)); 
    }//GEN-LAST:event_jPanel15MouseEntered

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
        jPanel16.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        jPanel17.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
       jPanel17.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel17MouseExited

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
        jPanel16.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseExited
        jPanel15.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel15MouseExited

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        jPanel14.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseExited
        jPanel18.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel18MouseExited

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        jPanel13.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel13MouseExited

    private void MachineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MachineIDActionPerformed

    private void StartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDateActionPerformed

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        String wcode = WarrantyCode.getText();
        String mid = MachineID.getText();
        String sdate = StartDate.getText();
        String edate = EndDate.getText();
        String wsup = WarrantySupplier.getText();
        String phone = ContactNo.getText();
        
        if(mid.isEmpty() || sdate.isEmpty() || edate.isEmpty() || wsup.isEmpty() || phone.isEmpty()){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //only letters validation
        else if(isletters(wsup)==0)
         {
             showMessageDialog(null,"Can't use digits in warranty supplier field");
         }
        
        //phone validation
         else if(phone.isEmpty()){
                    showMessageDialog(null,"Contact No. field is null");
         }
         
        else if(isnum(phone)==0) //isnum method
                {
                    showMessageDialog(null,"Letters are not allowed in Contact Number");
                }
        else if((phone.length()<10))
                {
                    showMessageDialog(null,"Not enough digits in Contact Number");
                }
        else if((phone.length()>10))
                {
                    showMessageDialog(null,"Only 10 digits allowed in Contact Number");
                }
        
        
        
        else {
            try {
            String d = "INSERT INTO warranty (Wcode,MID,sdate,edate,wsup,phone) VALUES ('"+wcode+"', '"+mid+"', '"+sdate+"', '"+edate+"', '"+wsup+"', '"+phone+"')";
            pst = con.prepareStatement(d);
            pst.execute();
            WarrantyCode.setText(function.getNextID("Wcode", "warranty", "W10", con)); //primary key auto increment

            //load table
            tableload();
            
            showMessageDialog(null, "Succesfully added.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
         //refresh
        
            WarrantyCode.setText(function.getNextID("Wcode", "warranty", "W10", con)); //primary key auto increment
            MachineID.setText(null);
           // jTextField3.setText(null);
            EndDate.setText(null);
            WarrantySupplier.setText(null);
            ContactNo.setText(null);
            
            tableload();
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
       int x = JOptionPane.showConfirmDialog(null,"Do you want to Update this");
        
        if(x==0)
        {
            String wcode = WarrantyCode.getText();
            String mid = MachineID.getText();
            String sdate = StartDate.getText();
            String edate = EndDate.getText();
            String wsup = WarrantySupplier.getText();
            String phone = ContactNo.getText();
           
            
         
            String sql = "UPDATE warranty SET  Wcode='"+wcode+"' , MID='"+mid+"' , edate='"+edate+"' , wsup='"+wsup+"' , phone='"+phone+"' WHERE Wcode='"+wcode+"'";
            
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }  
    }//GEN-LAST:event_jPanel18MouseClicked

    private void ContactNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContactNoFocusLost
      //phone validation
        String phone = ContactNo.getText();
        if(phone.isEmpty()){
                    showMessageDialog(null,"Contact No. field is null");
         }
         else 
        if(isnum(phone)==0) //isnum method
                {
                    showMessageDialog(null,"Letters are not allowed in Contact Number");
                }
        else if((phone.length()<10))
                {
                    showMessageDialog(null,"Not enough digits in Contact Number");
                }
        else if((phone.length()>10))
                {
                    showMessageDialog(null,"Only 10 digits allowed in Contact Number");
                }
    }//GEN-LAST:event_ContactNoFocusLost

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
       //delete 
        int x = showConfirmDialog(null,"Do you want to Delete this");
        
        if(x==0)
        {
            String wcode= WarrantyCode.getText();
            
            String sql = "DELETE from warranty WHERE Wcode='"+ wcode+"'";
            
            try {
                
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
            WarrantyCode.setText(null);
            MachineID.setText(null);
            StartDate.setText(null);
            EndDate.setText(null);
            WarrantySupplier.setText(null);
            ContactNo.setText(null);
    }//GEN-LAST:event_jPanel14MouseClicked

    private void WarrantyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WarrantyTableMouseClicked
        int r = WarrantyTable.getSelectedRow();
        
        String wcode = WarrantyTable.getValueAt(r, 0).toString();
       String mid = WarrantyTable.getValueAt(r, 1).toString();
       String sdate = WarrantyTable.getValueAt(r, 2).toString();
       String edate    = WarrantyTable.getValueAt(r, 3).toString();
       String wsup = WarrantyTable.getValueAt(r, 4).toString();
       String phone = WarrantyTable.getValueAt(r, 5).toString();
      
        
        
        WarrantyCode.setText(wcode);
        MachineID.setText(mid);
        StartDate.setText(sdate);
        EndDate.setText(edate);
        WarrantySupplier.setText(wsup);
        ContactNo.setText(phone);
        
    }//GEN-LAST:event_WarrantyTableMouseClicked

    private void WarrantySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarrantySearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WarrantySearchActionPerformed

    private void WarrantySearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WarrantySearchKeyReleased
        String search=WarrantySearch.getText();
        try {

            String sql ="SELECT mid,wcode FROM warranty where mid LIKE'"+search+"%' OR wcode LIKE '"+search+"%' ";
            pst = con.prepareStatement(sql);

            rs =pst.executeQuery();

            WarrantyTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_WarrantySearchKeyReleased

    private void WarrantySupplierFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WarrantySupplierFocusLost
        //only letters validation
         String wsup = WarrantySupplier.getText();
         if(isletters(wsup)==0)
         {
             showMessageDialog(null,"Can't use digits in warranty Supplier field");
         }
    }//GEN-LAST:event_WarrantySupplierFocusLost

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
            java.util.logging.Logger.getLogger(Warranty_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Warranty_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Warranty_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Warranty_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Warranty_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContactNo;
    private javax.swing.JTextField EndDate;
    private javax.swing.JTextField MachineID;
    private javax.swing.JTextField StartDate;
    private javax.swing.JLabel WarrantyCode;
    private javax.swing.JTextField WarrantySearch;
    private javax.swing.JTextField WarrantySupplier;
    private javax.swing.JTable WarrantyTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
