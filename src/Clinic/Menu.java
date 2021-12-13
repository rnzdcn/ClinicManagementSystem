/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import static Clinic.Inventory.Itable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;


/**
 *
 * @author jomari
 */
public class Menu extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st = null;
   
    public Menu() {
        initComponents();
        conn = connection.ConnecrDb();
        this.setLocationRelativeTo(null);
        setDefaultLookAndFeelDecorated(true);
        
         currentDate();
         showTime();
       
    
     
        //codes sa pie chart
        try{
          String f = "select * from clinicmanagement.inventory where status='Available'";
          pst=conn.prepareStatement(f);
          rs=pst.executeQuery();
          Itable.setModel(DbUtils.resultSetToTableModel(rs));
          int f1=Itable.getRowCount();
         
          String g = "select * from clinicmanagement.inventory where status='Not available'";
          pst=conn.prepareStatement(g);
          rs=pst.executeQuery();
          Itable.setModel(DbUtils.resultSetToTableModel(rs));
          int g1=Itable.getRowCount();
          
          
          DefaultPieDataset dataset2 = new DefaultPieDataset();
          dataset2.setValue("Available",new Integer(f1));
          dataset2.setValue("Not Available",new Integer(g1));
       
          JFreeChart chart2 = ChartFactory.createPieChart("Available Medicine",dataset2, true,true,true);
          PiePlot P = (PiePlot)chart2.getPlot();
          ChartPanel CP2 = new ChartPanel(chart2);
          jPanel6.setPreferredSize(new Dimension(500, 250));
          jPanel6.setLayout(new java.awt.BorderLayout());
          jPanel6.add(CP2,BorderLayout.CENTER);
          jPanel6.validate();
          chart2.setBackgroundPaint(Color.green);
          chart2.getTitle().setPaint(Color.WHITE);
//          CategoryPlot ax =chart2.getCategoryPlot();
//          ax.setRangeGridlinePaint(Color.WHITE);
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);    
        }
        
        
        //codes sa bar chart
         try {
            String query = "select date,count(studentid) from clinicmanagement.patients";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection.ConnecrDb(), query);
            JFreeChart cha = ChartFactory.createBarChart("Number of patients", "Date", "Student", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartPanel CP1 = new ChartPanel(cha);
            jPanel4.setPreferredSize(new Dimension(500, 250));
            jPanel4.setLayout(new java.awt.BorderLayout());
            jPanel4.add(CP1, BorderLayout.CENTER);
            cha.setBackgroundPaint(Color.green);
            cha.getTitle().setPaint(Color.WHITE);
            jPanel4.validate();

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
//        
//        
//       
////        //line chart codes
        try {
            String query = "select daterecieved,quantity from clinicmanagement.inventory";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection.ConnecrDb(), query);
            JFreeChart cha = ChartFactory.createLineChart("Number of medicine Recieved", "Daterecieved", "Quantity", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartPanel CP1 = new ChartPanel(cha);
            jPanel3.setPreferredSize(new Dimension(500, 250));
            jPanel3.setLayout(new java.awt.BorderLayout());
            jPanel3.add(CP1, BorderLayout.CENTER);
            cha.setBackgroundPaint(Color.green);
            cha.getTitle().setPaint(Color.WHITE);
            jPanel3.validate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
//        
//        Border whiteLine = BorderFactory.createLineBorder(Color.WHITE);
//        panel1.setBorder(whiteLine);
//        panel1.setBounds(6, 6, 180, 100);
//        panel1.setOpaque(false);
//        panel1.setBackground(new Color(10,46,54));
//        
//        panel2.setBorder(whiteLine);
//        panel2.setBounds(6, 6, 180, 100);
//        panel2.setOpaque(false);
//        panel2.setBackground(new Color(10,46,54));
        
        //codes sa panel na border keme
        
        // JPanel p2 = new RoundedPanel(40, new Color(10,46,54));
//        JPanel p2 = new RoundedPanel(40, new Color(10,46,54));
//        JPanel p1 = new RoundedPanel(40, new Color(10,46,54));
//        p1.setBounds(5, 5, 180, 100);
//        p1.setOpaque(false);
//        p1.setBorder(whiteLine);
//        panel1.add(p1);
//        panel2.add(p2);
        
       
       

        //codes sa mga total patients at medicine 
        try {
            String sq1 = "select sum(quantity) from clinicmanagement.inventory";
            pst = conn.prepareStatement(sq1);
            rs = pst.executeQuery();
            if (rs.next()) {
                String sum1 = rs.getString("sum(quantity)");
                Mtotalmedicine.setText(sum1);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String sq1 = "select count(studentid) from clinicmanagement.patients";
            pst = conn.prepareStatement(sq1);
            rs = pst.executeQuery();
            if (rs.next()) {
                String count2 = rs.getString("count(studentid)");
                Mnumberofpatients.setText(count2);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
          try {
            String sq1 = "select count(studreportno) from clinicmanagement.studentmedicine";
            pst = conn.prepareStatement(sq1);
            rs = pst.executeQuery();
            if (rs.next()) {
                String sum1 = rs.getString("count(studreportno)");
                givemedicine.setText(sum1);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
        void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
                Mtime.setText(f.format(d));
            }
        }).start();
    }
     public void  currentDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-d");
        Date d = new Date();
        Mcalendar.setText(dateFormat.format(d));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Mtotalmedicine = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        Mnumberofpatients = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Mtime = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        givemedicine = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 46, 54));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel2.setOpaque(false);

        jLabel3.setBackground(new java.awt.Color(10, 46, 54));
        jLabel3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Medicine");
        jLabel3.setOpaque(true);

        Mtotalmedicine.setBackground(new java.awt.Color(10, 46, 54));
        Mtotalmedicine.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        Mtotalmedicine.setForeground(new java.awt.Color(255, 255, 255));
        Mtotalmedicine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mtotalmedicine.setOpaque(true);
        Mtotalmedicine.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MtotalmedicineMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(Mtotalmedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mtotalmedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 190, 120));

        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setOpaque(false);
        panel1.setPreferredSize(new java.awt.Dimension(190, 120));

        Label1.setBackground(new java.awt.Color(10, 46, 54));
        Label1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 255, 255));
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("Number of Patients");
        Label1.setOpaque(true);

        Mnumberofpatients.setBackground(new java.awt.Color(10, 46, 54));
        Mnumberofpatients.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        Mnumberofpatients.setForeground(new java.awt.Color(255, 255, 255));
        Mnumberofpatients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mnumberofpatients.setOpaque(true);
        Mnumberofpatients.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MnumberofpatientsMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mnumberofpatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mnumberofpatients, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(10, 46, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 270, 310));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 270, 310));

        jPanel5.setBackground(new java.awt.Color(87, 191, 109));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(10, 46, 54));
        jButton3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/medecine_record.png"))); // NOI18N
        jButton3.setText("Student Medicine");
        jButton3.setBorder(null);
        jButton3.setHideActionText(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, 50));

        jButton1.setBackground(new java.awt.Color(10, 46, 54));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/patient_record.png"))); // NOI18N
        jButton1.setText("Patients Record");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 50));

        jButton4.setBackground(new java.awt.Color(10, 46, 54));
        jButton4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/inventory.png"))); // NOI18N
        jButton4.setText("Inventory");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, 50));

        jButton2.setBackground(new java.awt.Color(10, 46, 54));
        jButton2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/profile.png"))); // NOI18N
        jButton2.setText("Manage Admin");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 230, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 600));

        userName.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/user_icon.png"))); // NOI18N
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 230, -1));

        Mtime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mtime.setForeground(new java.awt.Color(255, 255, 255));
        Mtime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/MenuTime.png"))); // NOI18N
        jPanel2.add(Mtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 110, 180, 30));

        Mcalendar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mcalendar.setForeground(new java.awt.Color(255, 255, 255));
        Mcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/Menucalendar.png"))); // NOI18N
        jPanel2.add(Mcalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, 180, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 270, 310));

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel3.setOpaque(false);

        jLabel4.setBackground(new java.awt.Color(10, 46, 54));
        jLabel4.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Given Medicine");
        jLabel4.setOpaque(true);

        givemedicine.setBackground(new java.awt.Color(10, 46, 54));
        givemedicine.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        givemedicine.setForeground(new java.awt.Color(255, 255, 255));
        givemedicine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        givemedicine.setOpaque(true);
        givemedicine.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                givemedicineMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(givemedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(givemedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1280, 600));

        jPanel1.setBackground(new java.awt.Color(87, 191, 109));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/logo.png"))); // NOI18N
        jLabel1.setText("<html>Cavite State University - Silang Campus Clinic Management System</html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 80));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/mainLogout.png"))); // NOI18N
        jButton7.setText("LogOut");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StudentMedicine s = new StudentMedicine();
        s.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main m = new Main();
        m.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Inventory i = new Inventory();
        i.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        manageAdmin c = new manageAdmin();
        c.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void MnumberofpatientsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnumberofpatientsMouseDragged

    }//GEN-LAST:event_MnumberofpatientsMouseDragged

    private void MtotalmedicineMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MtotalmedicineMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_MtotalmedicineMouseDragged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//        logout c = new logout();
//        c.setVisible(true);
//        setVisible(false);
        
        
        //different approach to logout
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?","Confirm",
                JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if(response==JOptionPane.YES_OPTION){
            new signup().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void givemedicineMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_givemedicineMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_givemedicineMouseDragged

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    public static final javax.swing.JLabel Mcalendar = new javax.swing.JLabel();
    private javax.swing.JLabel Mnumberofpatients;
    private javax.swing.JLabel Mtime;
    private javax.swing.JLabel Mtotalmedicine;
    private javax.swing.JLabel givemedicine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    public static final javax.swing.JLabel userName = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables

    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint border
        }

    }

}
