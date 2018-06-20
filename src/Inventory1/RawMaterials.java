/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;
import java.awt.Image;
import DbConn.dbconnect;
import static DbConn.dbconnect.connect;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.midi.SysexMessage;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Dharshika
 */
public class RawMaterials extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    /**
     * Creates new form RawMaterials
     */
    public RawMaterials() {
        initComponents();
        con= dbconnect.connect();
        Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    fillcombo ();
   
        
        showjTable();//Visibel after form loaded
    }
String ImgPath = null;
    private void fillcombo ()
    
            
    {
        try {
            
            
            String sql ="Select * from rawcategory";
            pst=con.prepareStatement(sql);
            rs =pst.executeQuery();
            while(rs.next())
            
            {
                
                
                String cat = rs.getNString("rawcategory");
                cmb_category.addItem(cat);
            
            
            }
            
        } catch (Exception e) {
        }
        
        
        
    }
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmb_category = new javax.swing.JComboBox();
        cmb_subcategory = new javax.swing.JComboBox();
        txt_name = new javax.swing.JTextField();
        cmb_unitmeasure = new javax.swing.JComboBox();
        txt_startinv = new javax.swing.JTextField();
        txt_reorder = new javax.swing.JTextField();
        txt_costperunit = new javax.swing.JTextField();
        cmb_color = new javax.swing.JComboBox();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_code = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        btn_image = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbl_namealert = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_inv = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(230, 120));
        setMaximizedBounds(new java.awt.Rectangle(0, 125, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1130, 610));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Raw Material Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        cmb_category.setBackground(new java.awt.Color(153, 153, 153));
        cmb_category.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_category.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_categoryItemStateChanged(evt);
            }
        });
        cmb_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoryActionPerformed(evt);
            }
        });

        cmb_subcategory.setBackground(new java.awt.Color(153, 153, 153));
        cmb_subcategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_name.setBackground(new java.awt.Color(153, 153, 153));
        txt_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cmb_unitmeasure.setBackground(new java.awt.Color(153, 153, 153));
        cmb_unitmeasure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_unitmeasure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Meter", "Number", "Bundle" }));
        cmb_unitmeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_unitmeasureActionPerformed(evt);
            }
        });

        txt_startinv.setBackground(new java.awt.Color(153, 153, 153));
        txt_startinv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_reorder.setBackground(new java.awt.Color(153, 153, 153));
        txt_reorder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_costperunit.setBackground(new java.awt.Color(153, 153, 153));
        txt_costperunit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cmb_color.setBackground(new java.awt.Color(153, 153, 153));
        cmb_color.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Blue", "Black", "Grey", "Purple", "Beige" }));
        cmb_color.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_colorItemStateChanged(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setText("Add");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbl_code.setForeground(new java.awt.Color(51, 51, 51));
        lbl_code.setText("jLabel9");

        lbl_image.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_image.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_image.setText("Upload Image");
        btn_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rs");

        lbl_namealert.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_namealert.setForeground(new java.awt.Color(51, 51, 51));
        lbl_namealert.setText("!");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subcategory");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Unit/measure");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Starting Inventory");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Re order Level");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cost/unit");

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel10))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_category, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_subcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_color, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_unitmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_startinv, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(lbl_namealert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(114, 114, 114)
                                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_code))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_reorder, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_costperunit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(181, 181, 181)
                        .addComponent(btn_image)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_subcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_unitmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_startinv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel1)
                            .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lbl_namealert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_reorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_costperunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_image)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_code)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnInsert)
                            .addComponent(btnDelete)
                            .addComponent(btn_clear)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        jTable_inv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Category", "Sub Category", "Name", "Color", "Units of measure", "Starting Inventory", "Re order Level", "Cost/Unit", "Stock Qty", "Status", "image"
            }
        ));
        jTable_inv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_invMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_inv);
        if (jTable_inv.getColumnModel().getColumnCount() > 0) {
            jTable_inv.getColumnModel().getColumn(11).setMinWidth(120);
            jTable_inv.getColumnModel().getColumn(11).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1137, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
   
   
    public ArrayList<RawmaterialsModel> getInventoryList()
    {
        ArrayList<RawmaterialsModel> inventoryList=new ArrayList<>();
        Connection connection = connect();
        String query="Select * from rawmaterials";
        
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
    
    public void showjTable()
    {
        ArrayList<RawmaterialsModel> listdata=getInventoryList();
        DefaultTableModel model =(DefaultTableModel)jTable_inv.getModel();
        
        Object [] row=new Object[12];
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
            row[11]=listdata.get(i).getMyImage();
                        
           


            
            model.addRow(row);
        }
    
    }
    
    //insert data method
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
       try{
         int x = JOptionPane.showConfirmDialog(null,"Do you want to add new record?");
        
        if(x==0)
        {
             String color = (String) cmb_color.getSelectedItem();
             String name =txt_name.getText();
             String sub =(String)cmb_subcategory.getSelectedItem();
                     
             String cat =(String)cmb_category.getSelectedItem();
             
            InputStream img = new FileInputStream(new File(ImgPath));
              String query="INSERT INTO `rawmaterials`(`category`, `subcategory`, `name`, `color`, `unitmeasure`,`startinginv`,`reorder`,`cost`,`stockqty`,`orderstatus`,`image`) "
                               + "VALUES ('"+cmb_category.getSelectedItem()+"','"+cmb_subcategory.getSelectedItem()+"','"+name+" "+sub+" "+color+" "+cat+"','"+cmb_color.getSelectedItem()+"','"+cmb_unitmeasure.getSelectedItem()+"','"+txt_startinv.getText()+"','"+txt_reorder.getText()+"','"+txt_costperunit.getText()+"','"+txt_startinv.getText()+"','NO','"+(img)+"')";
               executeSqlQuery2(query, "Insert");
                     
           
                 
                
                
               
        }
        else if( x==1) {
                  
                  ClearField();
              }
        
       }catch(Exception e){} 
        
        System.out.println("Image => "+ImgPath);
      
    }//GEN-LAST:event_btnInsertActionPerformed

    public ImageIcon ResizeImage(String imagePath, byte[] pic)
{
                ImageIcon myImage = null;

                if(imagePath != null)
            {
                myImage = new ImageIcon(imagePath);
            }
                else{
                        myImage = new ImageIcon(pic);
                    }

            Image img = myImage.getImage();
            Image img2 = img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(img2);
            return image;

}
   
    
    
    //when clicked the table  row appears on form
    private void jTable_invMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_invMouseClicked
        
        try{
        int i=jTable_inv.getSelectedRow();
        TableModel model=jTable_inv.getModel();
       
        lbl_code.setText(model.getValueAt(i, 0).toString());
        cmb_category.setSelectedItem(model.getValueAt(i, 1).toString());
        cmb_subcategory.setSelectedItem(model.getValueAt(i, 2).toString());
        txt_name.setText(model.getValueAt(i, 3).toString());
        cmb_color.setSelectedItem(model.getValueAt(i, 4).toString());
        cmb_unitmeasure.setSelectedItem(model.getValueAt(i, 5).toString());
        txt_startinv.setText(model.getValueAt(i, 6).toString());
        txt_reorder.setText(model.getValueAt(i, 7).toString());
        txt_costperunit.setText(model.getValueAt(i, 8).toString());
        
        
       
      BufferedImage buff=null;
      ImageIcon imgicon =null;
      Blob blob =(Blob) model.getValueAt(i, 11);
      InputStream is =blob.getBinaryStream();
      buff=ImageIO.read(is);
      imgicon=new ImageIcon(buff.getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(),java.awt.Image.SCALE_SMOOTH));
      lbl_image.setIcon(imgicon);
        } 
        
        
        catch (Exception e) {
        }
      
      
      
        
        
        
            
        
         

        
    }//GEN-LAST:event_jTable_invMouseClicked

    
    
    
    
    
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null,"Do you want to Update record?");
        
        if(x==0)
        {
        
        String query="UPDATE `rawmaterials` SET `category`='"+cmb_category.getSelectedItem()+"',`subcategory`='"+cmb_subcategory.getSelectedItem()+"',`name`='"+txt_name.getText()+"',`color`='"+cmb_color.getSelectedItem()+"',`unitmeasure`='"+cmb_unitmeasure.getSelectedItem()+"',`startinginv`='"+txt_startinv.getText()+"',`reorder`='"+txt_reorder.getText()+"',`cost`='"+txt_costperunit.getText()+"' WHERE `code`='"+lbl_code.getText()+"'";
        executeSqlQuery2(query, "Update");
        
        
        
         }
        else if( x==1) {
                  
                  ClearField();
              }
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      
        int x = JOptionPane.showConfirmDialog(null,"Do you want to Delete record ?");
        
        if(x==0)
        {
        
        String query="DELETE FROM `rawmaterials` WHERE `code`='"+lbl_code.getText()+"'";
        executeSqlQuery(query, "Delete");
        
        
           }
        else if( x==1) {
                  
                  ClearField();
              }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    
    private void btn_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lbl_image.setIcon(ResizeImage(path, null));
            ImgPath = path;
}
else{
System.out.println("No File Selected");
}  // TODO add your handling code here:
    }//GEN-LAST:event_btn_imageActionPerformed

    private void cmb_categoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_categoryItemStateChanged
        
       
    }//GEN-LAST:event_cmb_categoryItemStateChanged

    
    void  loadSubCat(){
    
    try {
             //if(evt.getStateChange() == ItemEvent.SELECTED)
               // {
                 //   if(this.cmb_category.getSelectedIndex()>0)
           //{
            cmb_subcategory.removeAllItems();
            String sql ="Select * from rawsubcategory where rawcategory ='"+cmb_category.getSelectedItem().toString()+"' ";
            pst1=con.prepareStatement(sql);
            rs1 =pst1.executeQuery();
            while(rs1.next())
            
            {
                
                
                String subcat = rs1.getNString("rawsubcategory");
                cmb_subcategory.addItem(subcat);
               
            
            } // }  
                //}
            
        } catch (Exception e) {
        }
    
    
    }
    
    private void cmb_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoryActionPerformed
        loadSubCat();
    }//GEN-LAST:event_cmb_categoryActionPerformed

    private void cmb_colorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_colorItemStateChanged
      
    }//GEN-LAST:event_cmb_colorItemStateChanged

    private void cmb_unitmeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_unitmeasureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_unitmeasureActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       ClearField();
               
               
               
               
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         SearchRawmaterialsbyName ra = new SearchRawmaterialsbyName();
                  ra.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    public void ClearField()
    {
        txt_name.setText(null);
        txt_costperunit.setText(null);
        txt_reorder.setText(null);
        txt_startinv.setText(null);
        lbl_image.setIcon(null);
        cmb_category.removeAll();
        
        cmb_color.removeAll();
        cmb_subcategory.removeAll();
        cmb_unitmeasure.removeAll();
        
        
    }
    
     public int found(String m)
    {
        int a=1;
        
        if(!m.isEmpty())
        {
            
            String query = "SELECT * FROM rawmaterials ";
            try {
                Connection connection = connect();
                Statement st;
                ResultSet rs;
              
            st=connection.createStatement();
            rs=st.executeQuery(query);
                while(rs.next())
                {
                    String name = rs.getString("name");
                    
                    if(m.equals(name))
                    {
                        a=0;
                    }
                }
                
            } catch (Exception e) {
                
                System.out.println(e);
            }
        }        
        return a;
    }

    
    
    
     //query execution main method
     public void executeSqlQuery(String query,String message)
     {
         Connection conn= connect();
         Statement st;
         try {
              st=con.createStatement();
              if((st.executeUpdate(query))==1)
              {
                  // data get refresh after query runs 
                  DefaultTableModel model = (DefaultTableModel)jTable_inv.getModel();
                  model.setRowCount(0);
                  showjTable();
                                    
                  // message box
                  JOptionPane.showMessageDialog(null, "Data "+message+" Successfully");
                  ClearField();
              }else{
                  JOptionPane.showMessageDialog(null, "Data "+message+" Failed");
              }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
            
         }
         
     }

    public void executeSqlQuery2(String query,String message)
     {
         Connection conn= connect();
         Statement st;
         try {
               
                    
                            st=con.createStatement();
                           
              
                           
               
                          //  if(found(txt_name.getText())==0)
                                         
                                      //  {
                    
                                                    if((st.executeUpdate(query))==1)
                                                                     {
                 
                                                                        DefaultTableModel model = (DefaultTableModel)jTable_inv.getModel();
                                                                        model.setRowCount(0);
                                                                        showjTable();
                                    
                  
                                                                         JOptionPane.showMessageDialog(null, "Data "+message+" Successfully");
                                                                         ClearField();
                                                                           
                                                                         lbl_namealert.setForeground(new Color(51,51,51));
                                                                         txt_name.setForeground(new Color(0,0,0));
                                                                             
                  
                                                                        }
              
                                        //}
                
                
                            else{
                                       
                
                
                                        
                                           // if(found(txt_name.getText())==1)
                                           // {
                                            //showMessageDialog(null,"Raw material details already added!");
                                            //                 txt_name.setForeground(new Color(255,0,0));
                                            //                  lbl_namealert.setForeground(new Color(255,0,0));
                                            
                                           // }  
                                        
                                        
                                            
                                 
              
                                                             
                                                                      
                             
                                                    JOptionPane.showMessageDialog(null, "Data "+message+" Failed");
                                                    
                                                    
                                                    
                                                    
                       }     
               
                
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
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
            java.util.logging.Logger.getLogger(RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RawMaterials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_image;
    private javax.swing.JComboBox cmb_category;
    private javax.swing.JComboBox cmb_color;
    private javax.swing.JComboBox cmb_subcategory;
    private javax.swing.JComboBox cmb_unitmeasure;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_inv;
    private javax.swing.JLabel lbl_code;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_namealert;
    private javax.swing.JTextField txt_costperunit;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_reorder;
    private javax.swing.JTextField txt_startinv;
    // End of variables declaration//GEN-END:variables
}
