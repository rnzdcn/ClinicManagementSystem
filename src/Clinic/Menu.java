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
    //    setDefaultLookAndFeelDecorated(true);
        
         currentDate();
         showTime();
       
         
          try{
          String f = "select * from clinicmanagement.patients where sick='Headache'";
          pst=conn.prepareStatement(f);
          rs=pst.executeQuery();
          Itable.setModel(DbUtils.resultSetToTableModel(rs));
          int f1=Itable.getRowCount();
         
          String g = "select * from clinicmanagement.patients where sick='Cold'";
          pst=conn.prepareStatement(g);
          rs=pst.executeQuery();
          Itable.setModel(DbUtils.resultSetToTableModel(rs));
          int g1=Itable.getRowCount();
         
          String h = "select * from clinicmanagement.patients where sick='Diarrhea'";
          pst=conn.prepareStatement(h);
          rs=pst.executeQuery();
          Itable.setModel(DbUtils.resultSetToTableModel(rs));
          int h1=Itable.getRowCount();
         
          String i = "select * from clinicmanagement.patients where sick='Flu'";
          pst=conn.prepareStatement(i);
          rs=pst.executeQuery();
          Itable.setModel(DbUtils.resultSetToTableModel(rs));
          int i1=Itable.getRowCount();
          
          String j = "select * from clinicmanagement.patients where sick='Injury'";
          pst=conn.prepareStatement(j);
          rs=pst.executeQuery();
          Itable.setModel(DbUtils.resultSetToTableModel(rs));
          int j1=Itable.getRowCount();
   
           String k = "select * from clinicmanagement.patients where sick='Stomachache'";
          pst=conn.prepareStatement(k);
          rs=pst.executeQuery();
          Itable.setModel(DbUtils.resultSetToTableModel(rs));
          int k1=Itable.getRowCount();
          
          DefaultPieDataset dataset2 = new DefaultPieDataset();
          dataset2.setValue("Headache",new Integer(f1));
          dataset2.setValue("Cold",new Integer(g1));
          dataset2.setValue("Diarrhea",new Integer(h1));
          dataset2.setValue("Flu",new Integer(i1));
          dataset2.setValue("Injury",new Integer(j1));
          dataset2.setValue("Stomachache",new Integer(k1));
       
          JFreeChart chart2 = ChartFactory.createPieChart3D("Common Student Illness",dataset2, true,true,true);
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
        //codes sa pie chart
//        try{
//          String f = "select * from clinicmanagement.inventory where status='Available'";
//          pst=conn.prepareStatement(f);
//          rs=pst.executeQuery();
//          Itable.setModel(DbUtils.resultSetToTableModel(rs));
//          int f1=Itable.getRowCount();
//         
//          String g = "select * from clinicmanagement.inventory where status='Not available'";
//          pst=conn.prepareStatement(g);
//          rs=pst.executeQuery();
//          Itable.setModel(DbUtils.resultSetToTableModel(rs));
//          int g1=Itable.getRowCount();
//          
//          
//          DefaultPieDataset dataset2 = new DefaultPieDataset();
//          dataset2.setValue("Available",new Integer(f1));
//          dataset2.setValue("Not Available",new Integer(g1));
//       
//          JFreeChart chart2 = ChartFactory.createPieChart3D("Available Medicine",dataset2, true,true,true);
//          PiePlot P = (PiePlot)chart2.getPlot();
//          ChartPanel CP2 = new ChartPanel(chart2);
//          jPanel6.setPreferredSize(new Dimension(500, 250));
//          jPanel6.setLayout(new java.awt.BorderLayout());
//          jPanel6.add(CP2,BorderLayout.CENTER);
//          jPanel6.validate();
//          chart2.setBackgroundPaint(Color.green);
//          chart2.getTitle().setPaint(Color.WHITE);
////          CategoryPlot ax =chart2.getCategoryPlot();
////          ax.setRangeGridlinePaint(Color.WHITE);
//        } catch (Exception e) {
//          JOptionPane.showMessageDialog(null, e);    
//        }
        
        
        //codes sa bar chart
         try {
            String query = "select date , quantity from clinicmanagement.studentmedicine";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection.ConnecrDb(), query);
            JFreeChart cha = ChartFactory.createBarChart("Number of medicine give", "Date", "quantity", dataset, PlotOrientation.VERTICAL, false, true, true);
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
            JFreeChart cha = ChartFactory.createLineChart3D("Number of medicine Recieved", "Daterecieved", "Quantity", dataset, PlotOrientation.VERTICAL, false, true, true);
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
            String sq1 = "select sum(quantity) from clinicmanagement.studentmedicine";
            pst = conn.prepareStatement(sq1);
            rs = pst.executeQuery();
            if (rs.next()) {
                String sum1 = rs.getString("sum(quantity)");
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-d");
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

        Label1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        Mtotalmedicine = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        Mnumberofpatients = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Mtime = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        givemedicine = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        button1 = new javax.swing.JPanel();
        indicator1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        button2 = new javax.swing.JPanel();
        indicator2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        button3 = new javax.swing.JPanel();
        indicator3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        button4 = new javax.swing.JPanel();
        indicator4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        Label1.setBackground(new java.awt.Color(10, 46, 54));
        Label1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 255, 255));
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("Number of Patients");
        Label1.setOpaque(true);

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

        jLabel3.setBackground(new java.awt.Color(10, 46, 54));
        jLabel3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Medicine");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Mtotalmedicine, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
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

        jPanel2.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 190, 120));

        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setOpaque(false);
        panel1.setPreferredSize(new java.awt.Dimension(190, 120));

        Mnumberofpatients.setBackground(new java.awt.Color(10, 46, 54));
        Mnumberofpatients.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        Mnumberofpatients.setForeground(new java.awt.Color(255, 255, 255));
        Mnumberofpatients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mnumberofpatients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/menupatient.png"))); // NOI18N
        Mnumberofpatients.setOpaque(true);
        Mnumberofpatients.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MnumberofpatientsMouseDragged(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Patients");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mnumberofpatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mnumberofpatients, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(10, 46, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 290, 310));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 270, 310));

        userName.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/user_icon.png"))); // NOI18N
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 230, -1));

        Mtime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mtime.setForeground(new java.awt.Color(255, 255, 255));
        Mtime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/MenuTime.png"))); // NOI18N
        jPanel2.add(Mtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 180, 30));

        Mcalendar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mcalendar.setForeground(new java.awt.Color(255, 255, 255));
        Mcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/Menucalendar.png"))); // NOI18N
        jPanel2.add(Mcalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 180, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 270, 310));

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

        jPanel2.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 1010, 600));

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

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });

        indicator1.setBackground(new java.awt.Color(0, 153, 51));
        indicator1.setOpaque(false);

        javax.swing.GroupLayout indicator1Layout = new javax.swing.GroupLayout(indicator1);
        indicator1.setLayout(indicator1Layout);
        indicator1Layout.setHorizontalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indicator1Layout.setVerticalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/medecine_record.png"))); // NOI18N
        jLabel9.setText("STUDENT MEDICINE");

        javax.swing.GroupLayout button1Layout = new javax.swing.GroupLayout(button1);
        button1.setLayout(button1Layout);
        button1Layout.setHorizontalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button1Layout.createSequentialGroup()
                .addComponent(indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        button1Layout.setVerticalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(button1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 50));

        jPanel16.setBackground(new java.awt.Color(87, 191, 109));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });

        indicator2.setBackground(new java.awt.Color(0, 153, 51));
        indicator2.setOpaque(false);

        javax.swing.GroupLayout indicator2Layout = new javax.swing.GroupLayout(indicator2);
        indicator2.setLayout(indicator2Layout);
        indicator2Layout.setHorizontalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indicator2Layout.setVerticalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/patient_record.png"))); // NOI18N
        jLabel10.setText("PATIENTS RECORD");

        javax.swing.GroupLayout button2Layout = new javax.swing.GroupLayout(button2);
        button2.setLayout(button2Layout);
        button2Layout.setHorizontalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button2Layout.createSequentialGroup()
                .addComponent(indicator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        button2Layout.setVerticalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(button2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 270, 50));

        jPanel19.setBackground(new java.awt.Color(87, 191, 109));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
        });

        indicator3.setBackground(new java.awt.Color(0, 153, 51));
        indicator3.setOpaque(false);

        javax.swing.GroupLayout indicator3Layout = new javax.swing.GroupLayout(indicator3);
        indicator3.setLayout(indicator3Layout);
        indicator3Layout.setHorizontalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indicator3Layout.setVerticalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/inventory.png"))); // NOI18N
        jLabel11.setText("INVENTORY");

        javax.swing.GroupLayout button3Layout = new javax.swing.GroupLayout(button3);
        button3.setLayout(button3Layout);
        button3Layout.setHorizontalGroup(
            button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button3Layout.createSequentialGroup()
                .addComponent(indicator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel11)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        button3Layout.setVerticalGroup(
            button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(button3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 270, 50));

        jPanel22.setBackground(new java.awt.Color(87, 191, 109));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
        });

        indicator4.setBackground(new java.awt.Color(0, 153, 51));
        indicator4.setOpaque(false);

        javax.swing.GroupLayout indicator4Layout = new javax.swing.GroupLayout(indicator4);
        indicator4.setLayout(indicator4Layout);
        indicator4Layout.setHorizontalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indicator4Layout.setVerticalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/profile.png"))); // NOI18N
        jLabel12.setText("MANAGE ADMIN");

        javax.swing.GroupLayout button4Layout = new javax.swing.GroupLayout(button4);
        button4.setLayout(button4Layout);
        button4Layout.setHorizontalGroup(
            button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button4Layout.createSequentialGroup()
                .addComponent(indicator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        button4Layout.setVerticalGroup(
            button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(16, 16, 16))
        );

        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 270, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnumberofpatientsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnumberofpatientsMouseDragged

    }//GEN-LAST:event_MnumberofpatientsMouseDragged

    private void MtotalmedicineMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MtotalmedicineMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_MtotalmedicineMouseDragged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        
        //different approach to logout
//        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?","Confirm",
//                JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
//        if(response==JOptionPane.YES_OPTION){
//            new signup().setVisible(true);
//            dispose();
//        }
         this.toBack();
        logout l = new logout();
        l.setVisible(true);
        l.toFront();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void givemedicineMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_givemedicineMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_givemedicineMouseDragged

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
       Main m = new Main();
        m.setVisible(true);
        setVisible(false);
       
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
       Inventory i = new Inventory();
        i.setVisible(true);
        setVisible(false);
       
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        manageAdmin c = new manageAdmin();
        c.setVisible(true);
        setVisible(false);
       
    }//GEN-LAST:event_button4MouseClicked

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
         onClick(button2);
        onLeaveClick(button1);
        onLeaveClick(button3);
        onLeaveClick(button4);
        
        indicator1.setOpaque(false);
        indicator2.setOpaque(true);
        indicator3.setOpaque(false);
        indicator4.setOpaque(false);
     
    }//GEN-LAST:event_button2MouseEntered

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
        onClick(button3);
        onLeaveClick(button2);
        onLeaveClick(button1);
        onLeaveClick(button4);
        
        indicator1.setOpaque(false);
        indicator2.setOpaque(false);
        indicator3.setOpaque(true);
        indicator4.setOpaque(false);
       
    }//GEN-LAST:event_button3MouseEntered

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered
       onClick(button4);
        onLeaveClick(button2);
        onLeaveClick(button3);
        onLeaveClick(button1);
        
        indicator1.setOpaque(false);
        indicator2.setOpaque(false);
        indicator3.setOpaque(false);
        indicator4.setOpaque(true);
    }//GEN-LAST:event_button4MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
       onLeaveClick(button2);
        indicator2.setOpaque(false);
    }//GEN-LAST:event_button2MouseExited

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
        onLeaveClick(button3);
        indicator3.setOpaque(false);
    }//GEN-LAST:event_button3MouseExited

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
        onLeaveClick(button4);
        indicator4.setOpaque(false);
    }//GEN-LAST:event_button4MouseExited

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
    
          StudentMedicine s = new StudentMedicine();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_button1MouseClicked

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        onClick(button1);
        onLeaveClick(button2);
        onLeaveClick(button3);
        onLeaveClick(button4);
        
        indicator1.setOpaque(true);
        indicator2.setOpaque(false);
        indicator3.setOpaque(false);
        indicator4.setOpaque(false);
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
       onLeaveClick(button1);
        indicator1.setOpaque(false);
    }//GEN-LAST:event_button1MouseExited
     private void onClick(JPanel panel){
        panel.setBackground(new Color(69,252,3));
    }
    private void onLeaveClick(JPanel panel){
        panel.setBackground(Color.white);
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
    private javax.swing.JPanel button1;
    private javax.swing.JPanel button2;
    private javax.swing.JPanel button3;
    private javax.swing.JPanel button4;
    private javax.swing.JLabel givemedicine;
    private javax.swing.JPanel indicator1;
    private javax.swing.JPanel indicator2;
    private javax.swing.JPanel indicator3;
    private javax.swing.JPanel indicator4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
