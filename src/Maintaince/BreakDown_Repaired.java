
package Maintaince;

import DbConn.dbconnect;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dulangi Rathnayaka
 */
public class BreakDown_Repaired extends javax.swing.JFrame {
    //db connect    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;//table click

   
    public BreakDown_Repaired() {
        initComponents();
        showdate();
        
        //db connect
        con = dbconnect.connect();
        RepairCode.setText(function.getNextID("Rcode", "repair", "R10", con));//primary key auto increment
        
        //tableload
        tableload();
    }

   public void tableload(){
    
    try{
    
        String sql = "SELECT * FROM repair";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        RepairTable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch (Exception e) {
            System.out.println(e);
        }
    }
   public void showdate(){
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
            RecoveryDate.setText(s.format(d));
   }
   //only num
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

        jPanel2 = new javax.swing.JPanel();
        RecoveryDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MachineID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DamageDescription = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ServiceCharge = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        RepairTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Application = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        RepairedBy = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        ContactNo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ApplicationCost = new javax.swing.JTextField();
        NIC = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RepairSearch = new javax.swing.JTextField();
        RepairCode = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        Year = new javax.swing.JTextField();
        Month = new javax.swing.JTextField();
        Day = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(231, 151));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RecoveryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecoveryDateActionPerformed(evt);
            }
        });
        jPanel2.add(RecoveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 261, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Repair Code");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 119, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Machine ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 119, -1));

        MachineID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachineIDActionPerformed(evt);
            }
        });
        jPanel2.add(MachineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 261, -1));

        DamageDescription.setColumns(20);
        DamageDescription.setRows(5);
        jScrollPane1.setViewportView(DamageDescription);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 261, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Breakdown Date");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 119, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Repaired By");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 119, -1));

        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        jPanel2.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 261, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Application");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 119, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Address");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 119, -1));

        ServiceCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceChargeActionPerformed(evt);
            }
        });
        jPanel2.add(ServiceCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 261, -1));

        RepairTable.setBackground(new java.awt.Color(102, 102, 102));
        RepairTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Machine ID", "Repair Code", "Damage Description", "Breakdown Date", "Recovery Date", "Application", "Application Cost", "Service Charge", "Repaired By", "Contact No.", "NIC", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        RepairTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RepairTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(RepairTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 1100, 200));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Damage Description");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 132, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Recovery Date");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 119, -1));
        jPanel2.add(Application, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 261, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 1060, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 10, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Repair Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 120, 29));

        jSeparator3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 1060, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 10, 230));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 160, 40));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Update");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel10)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 160, 40));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" Delete");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel20)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 160, 40));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Generate Report");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel21)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 160, 40));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Cancel");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel25)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, 40));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Refresh");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel22)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, 40));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Service Charge");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 119, -1));

        RepairedBy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RepairedByFocusLost(evt);
            }
        });
        RepairedBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairedByActionPerformed(evt);
            }
        });
        jPanel2.add(RepairedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 261, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Contact No.");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 119, -1));

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
        jPanel2.add(ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 261, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Application Cost");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 119, -1));

        ApplicationCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplicationCostActionPerformed(evt);
            }
        });
        jPanel2.add(ApplicationCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 261, -1));

        NIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NICFocusLost(evt);
            }
        });
        NIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NICActionPerformed(evt);
            }
        });
        jPanel2.add(NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 261, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("NIC ");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 119, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Search by Machine ID/Repair Code");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 160, -1));

        RepairSearch.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        RepairSearch.setForeground(new java.awt.Color(51, 51, 51));
        RepairSearch.setText("Search");
        RepairSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairSearchActionPerformed(evt);
            }
        });
        RepairSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RepairSearchKeyReleased(evt);
            }
        });
        jPanel2.add(RepairSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 220, 20));

        RepairCode.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(RepairCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 20));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setMinimumSize(new java.awt.Dimension(74, 16));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Bill Details");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 60, 20));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 100, 20));

        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });
        jPanel2.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 40, -1));
        jPanel2.add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 40, -1));
        jPanel2.add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ServiceChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiceChargeActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void MachineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MachineIDActionPerformed

    private void RecoveryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecoveryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecoveryDateActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel9.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
       jPanel3.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
       jPanel8.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
       jPanel8.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
       jPanel11.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        jPanel11.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel11MouseExited

    private void RepairedByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairedByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepairedByActionPerformed

    private void ContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNoActionPerformed

    private void ApplicationCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplicationCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApplicationCostActionPerformed

    private void NICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NICActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        String mid = MachineID.getText();
        String rcode = RepairCode.getText();
        String description = DamageDescription.getText();
        //String bdate = BreakdownDate.getText();
        String year = Year.getText();
        String month = Month.getText();
        String day = Day.getText();
        String rdate = RecoveryDate.getText();
        String application = Application.getText();
        String acost = ApplicationCost.getText();
        String scharge = ServiceCharge.getText();
        String rby = RepairedBy.getText();
        String phone = ContactNo.getText();
        String nic = NIC.getText();
        String address = Address.getText();
        
        String bdate= year+"-"+month+"-"+day;
        
//        new Bill_details(acost,scharge).setVisible(true);
        
//        BreakdownDate.setText(date);
        
        if(mid.isEmpty() || description.isEmpty() ||  bdate.isEmpty() || rdate.isEmpty() || application.isEmpty() || acost.isEmpty() || scharge.isEmpty() ||  rby.isEmpty() || phone.isEmpty() || nic.isEmpty() ||  address.isEmpty()){
        
           showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //only num validation
        else if(isnum(acost)==0) {
            
            showMessageDialog(null,"Can't use letters in Appliction Cost field");
        }
        
        //only num validation
         else if(isnum(scharge)==0) {
            
            showMessageDialog(null,"Can't use letters in Service Charge field");
        }
        
        //only letters validation
        else if(isletters(rby)==0)
         {
             showMessageDialog(null,"Can't use digits in Repaired By field");
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
//               new Bill_details(acost,scharge).setVisible(true);
                 
                
                 
        try {
            //insert
            String h = "INSERT INTO repair (MID,Rcode,description,bdate,rdate,application,acost,scharge,Rby,phone,NIC,address) VALUES ('"+mid+"', '"+rcode+"', '"+description+"', '"+bdate+"', '"+rdate+"', '"+application+"', '"+acost+"', '"+scharge+"', '"+rby+"', '"+phone+"', '"+nic+"', '"+address+"')";
            pst = con.prepareStatement(h);
            pst.execute();
            RepairCode.setText(function.getNextID("Rcode", "repair", "R10", con));//primary key auto increment

            //load table
            tableload();
            
            showMessageDialog(null, "Succesfully added.");

        } catch (Exception e) {
            showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
         int x = showConfirmDialog(null,"Do you want to Update this");
        
        if(x==0)
        {
             String mid = MachineID.getText();
             String rcode = RepairCode.getText();
             String description=DamageDescription.getText();
             String year = Year.getText();
             String month = Month.getText();
             String day = Day.getText();
             String rdate =RecoveryDate.getText(); 
             String application = Application.getText();
             String acost = ApplicationCost.getText();
             String scharge = ServiceCharge.getText();
             String rby = RepairedBy.getText();
             String phone = ContactNo.getText();
             String nic = NIC.getText();
             String address = Address.getText();
            String bdate= year+"-"+month+"-"+day;
            
            String sql = "UPDATE repair SET  MID='"+mid+"' , Rcode='"+rcode+"', description='"+description+"' , bdate='"+bdate+"' ,rdate='"+rdate+"' , application='"+application+"' , acost='"+acost+"', scharge='"+scharge+"' , Rby='"+rby+"' , phone='"+phone+"' , NIC='"+nic+"', address='"+address+"' WHERE Rcode='"+rcode+"'";
            
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
       //delete 
        int x = showConfirmDialog(null,"Do you want to Delete this");
        
        if(x==0)
        {
            String rcode = RepairCode.getText();
            
            String sql = "DELETE from repair WHERE Rcode='"+rcode+"'";
            
            try {
                
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
       MachineID.setText(null);
       RepairCode.setText(function.getNextID("Rcode", "repair", "R10", con));//primary key auto increment
       DamageDescription.setText(null);
       Year.setText(null);
       Month.setText(null);
       Day.setText(null);
       //BreakdownDate.setText(null);
       //jTextField105.setText(null);
       Application.setText(null);
       ApplicationCost.setText(null);
       ServiceCharge.setText(null);
       RepairedBy.setText(null);
       ContactNo.setText(null);
       NIC.setText(null);
       Address.setText(null);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
       MachineID.setText(null);
       RepairCode.setText(function.getNextID("Rcode", "repair", "R10", con));//primary key auto increment
       DamageDescription.setText(null);
       Year.setText(null);
       Month.setText(null);
       Day.setText(null);
       //BreakdownDate.setText(null);
       //RecoveryDate.setText(null);
       Application.setText(null);
       ApplicationCost.setText(null);
       ServiceCharge.setText(null);
       RepairedBy.setText(null);
       ContactNo.setText(null);
       NIC.setText(null);
       Address.setText(null);
       
       tableload();
    }//GEN-LAST:event_jPanel11MouseClicked

    private void RepairTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepairTableMouseClicked
       int r = RepairTable.getSelectedRow();
        
       String mid = RepairTable.getValueAt(r, 0).toString();
       String rcode= RepairTable.getValueAt(r, 1).toString();
       String description = RepairTable.getValueAt(r, 2).toString();
       String bdate = RepairTable.getValueAt(r, 3).toString();
       String rdate = RepairTable.getValueAt(r, 4).toString();
       String application = RepairTable.getValueAt(r, 5).toString();
       String acost = RepairTable.getValueAt(r, 6).toString();
       String scharge= RepairTable.getValueAt(r, 7).toString();
       String rby = RepairTable.getValueAt(r, 8).toString();
       String phone = RepairTable.getValueAt(r, 9).toString();
       String nic= RepairTable.getValueAt(r, 10).toString();
       String address = RepairTable.getValueAt(r, 11).toString();
        
        
       MachineID.setText(mid);
       RepairCode.setText(rcode);
       DamageDescription.setText(description);
      // Year.setText(year);
       RecoveryDate.setText(rdate);
       Application.setText(application);
       ApplicationCost.setText(acost);
       ServiceCharge.setText(scharge);
       RepairedBy.setText(rby);
       ContactNo.setText(phone);
       NIC.setText(nic);
       Address.setText(address);
    }//GEN-LAST:event_RepairTableMouseClicked

    private void ContactNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContactNoFocusLost
        //phone validation
        String phone = ContactNo.getText();
        if(phone.isEmpty()){
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
    }//GEN-LAST:event_ContactNoFocusLost

    private void NICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NICFocusLost
//        String nic=NIC.getText();
//        if(!nic.isEmpty())
//        {
//            if(nic.length()<10)
//                {
//                    showMessageDialog(null,"not enough digits in NIC");
//                    NIC.setText(null);
//                   
//                }
//            
//            for(int x=0;x<9;x++)
//            {
//                if(!Character.isDigit(nic.charAt(x)))
//                {
//                    showMessageDialog(null,"first 9 charactores should be numbers in NIC");
//                    NIC.setText(null);
//                       
//                    break;
//                }
//            }
//               
//                 if(nic.length()>10)
//                 { {
//                    showMessageDialog(null,"no more than 10 digits in NIC");
//                    NIC.setText(null);
//                }
//             
//                  if(nic.charAt(9)!='v'&&nic.charAt(9)!='V')
//                {
//                    showMessageDialog(null,"NIC. field is null");
//                    NIC.setText(null);
//                }
//                  
//                 }
//             }
//        showMessageDialog(null,"NIC. field is null");
//////        if(!nic.isEmpty()){
//////            showMessageDialog(null,"ok");
////        
////        }
        if(!(NIC.getText().trim().matches("^[0-9]{9}[vVxX]$")))
{
    JOptionPane.showMessageDialog(null,"Invalid NIC ");
}
        
        
    }//GEN-LAST:event_NICFocusLost

    private void RepairSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepairSearchActionPerformed

    private void RepairSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RepairSearchKeyReleased
        String search=RepairSearch.getText();
        try {

            String sql ="SELECT mid,rid FROM repair where mid LIKE'"+search+"%' OR rid LIKE '"+search+"%' ";
            pst = con.prepareStatement(sql);

            rs =pst.executeQuery();

            RepairTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RepairSearchKeyReleased

    private void RepairedByFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairedByFocusLost
        //only letter validation
         String rby = RepairedBy.getText();
         if(isletters(rby)==0)
         {
             showMessageDialog(null,"Can't use digits in Repaired By. field");
         }
    }//GEN-LAST:event_RepairedByFocusLost

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        Bill_details id;
        id = new Bill_details();
        id.setVisible(true);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        jPanel10.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        jPanel10.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_jPanel10MouseExited

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearActionPerformed

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
            java.util.logging.Logger.getLogger(BreakDown_Repaired.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BreakDown_Repaired.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BreakDown_Repaired.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BreakDown_Repaired.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BreakDown_Repaired().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Application;
    private javax.swing.JTextField ApplicationCost;
    private javax.swing.JTextField ContactNo;
    private javax.swing.JTextArea DamageDescription;
    private javax.swing.JTextField Day;
    private javax.swing.JTextField MachineID;
    private javax.swing.JTextField Month;
    private javax.swing.JTextField NIC;
    private javax.swing.JTextField RecoveryDate;
    private javax.swing.JLabel RepairCode;
    private javax.swing.JTextField RepairSearch;
    private javax.swing.JTable RepairTable;
    private javax.swing.JTextField RepairedBy;
    private javax.swing.JTextField ServiceCharge;
    private javax.swing.JTextField Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
