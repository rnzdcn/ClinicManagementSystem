/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jomari
 */
public class addnewPatients extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st = null;
    private Object arg0;

    public addnewPatients() {
        initComponents();
        this.setLocationRelativeTo(null);

        conn = connection.ConnecrDb();
        ANPstudId.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ANPfirst = new javax.swing.JTextField();
        ANPstudId = new javax.swing.JTextField();
        ANPlast = new javax.swing.JTextField();
        ANPmiddle = new javax.swing.JTextField();
        ANPage = new javax.swing.JTextField();
        ANPsick = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ANPbednumber = new javax.swing.JTextField();
        ANPguardian = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ANPtime = new javax.swing.JTextField();
        ANPcontactnumber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ANPadd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ANPdate = new com.toedter.calendar.JDateChooser();
        ANPgender = new javax.swing.JComboBox();
        ANPguardianempty = new javax.swing.JLabel();
        ANPstudentIDempty = new javax.swing.JLabel();
        ANPfirstempty = new javax.swing.JLabel();
        ANPlastempty = new javax.swing.JLabel();
        ANPmiddleempty = new javax.swing.JLabel();
        ANPageempty = new javax.swing.JLabel();
        ANPcontactempty = new javax.swing.JLabel();
        ANPtimeempty = new javax.swing.JLabel();
        ANPbedempty = new javax.swing.JLabel();
        ANPsickempty = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/firstname.png"))); // NOI18N
        jLabel4.setText("First Name");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jLabel4.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("addNewPatientModal");
        setUndecorated(true);
        setSize(new java.awt.Dimension(750, 500));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(87, 191, 109));

        jLabel1.setBackground(new java.awt.Color(87, 191, 109));
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewpatients.png"))); // NOI18N
        jLabel1.setText("Add New Patients ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        jPanel2.setBackground(new java.awt.Color(10, 46, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel5.setText("Student ID");
        jLabel5.setToolTipText("");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewFIRST.png"))); // NOI18N
        jLabel6.setText("First Name");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewLAST.png"))); // NOI18N
        jLabel7.setText("Last Name");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 30));

        jLabel8.setBackground(new java.awt.Color(10, 46, 54));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewMIDDLE.png"))); // NOI18N
        jLabel8.setText("Middle Name");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 30));

        jLabel10.setBackground(new java.awt.Color(10, 46, 54));
        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewGENDER.png"))); // NOI18N
        jLabel10.setText("Gender");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 30));

        jLabel11.setBackground(new java.awt.Color(10, 46, 54));
        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewAGE.png"))); // NOI18N
        jLabel11.setText("Age");
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 30));

        ANPfirst.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPfirst.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPfirst.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPfirstActionPerformed(evt);
            }
        });
        ANPfirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPfirstKeyPressed(evt);
            }
        });
        jPanel2.add(ANPfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 190, 30));

        ANPstudId.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPstudId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPstudId.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPstudId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPstudIdActionPerformed(evt);
            }
        });
        ANPstudId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPstudIdKeyPressed(evt);
            }
        });
        jPanel2.add(ANPstudId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 190, 30));

        ANPlast.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPlast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPlast.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPlastActionPerformed(evt);
            }
        });
        ANPlast.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPlastKeyPressed(evt);
            }
        });
        jPanel2.add(ANPlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 190, 30));

        ANPmiddle.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPmiddle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPmiddle.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPmiddle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPmiddleActionPerformed(evt);
            }
        });
        ANPmiddle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPmiddleKeyPressed(evt);
            }
        });
        jPanel2.add(ANPmiddle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 190, 30));

        ANPage.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPage.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPageActionPerformed(evt);
            }
        });
        ANPage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPageKeyPressed(evt);
            }
        });
        jPanel2.add(ANPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 190, 30));

        ANPsick.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPsick.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPsick.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPsick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPsickActionPerformed(evt);
            }
        });
        ANPsick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPsickKeyPressed(evt);
            }
        });
        jPanel2.add(ANPsick, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 210, 30));

        jLabel12.setBackground(new java.awt.Color(10, 46, 54));
        jLabel12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSICK.png"))); // NOI18N
        jLabel12.setText("Sick/Illness");
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 130, 30));

        jLabel13.setBackground(new java.awt.Color(10, 46, 54));
        jLabel13.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewBED.png"))); // NOI18N
        jLabel13.setText("Bed Number");
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 130, 30));

        ANPbednumber.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPbednumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPbednumber.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPbednumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPbednumberActionPerformed(evt);
            }
        });
        ANPbednumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPbednumberKeyPressed(evt);
            }
        });
        jPanel2.add(ANPbednumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 210, 30));

        ANPguardian.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPguardian.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPguardian.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPguardian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPguardianActionPerformed(evt);
            }
        });
        ANPguardian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPguardianKeyPressed(evt);
            }
        });
        jPanel2.add(ANPguardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 140, 30));

        jLabel9.setBackground(new java.awt.Color(10, 46, 54));
        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewGUARDIAN.png"))); // NOI18N
        jLabel9.setText("Guardian Contact Number");
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 210, 30));

        jLabel14.setBackground(new java.awt.Color(10, 46, 54));
        jLabel14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewTIME.png"))); // NOI18N
        jLabel14.setText("Time Admit");
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, 30));

        ANPtime.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPtime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPtime.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPtimeActionPerformed(evt);
            }
        });
        ANPtime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPtimeKeyPressed(evt);
            }
        });
        jPanel2.add(ANPtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 210, 30));

        ANPcontactnumber.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPcontactnumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANPcontactnumber.setPreferredSize(new java.awt.Dimension(60, 20));
        ANPcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPcontactnumberActionPerformed(evt);
            }
        });
        ANPcontactnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANPcontactnumberKeyPressed(evt);
            }
        });
        jPanel2.add(ANPcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 210, 30));

        jLabel15.setBackground(new java.awt.Color(10, 46, 54));
        jLabel15.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewCONTACT.png"))); // NOI18N
        jLabel15.setText("Contact Number");
        jLabel15.setOpaque(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 150, 30));

        jLabel16.setBackground(new java.awt.Color(10, 46, 54));
        jLabel16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewCALENDAR.png"))); // NOI18N
        jLabel16.setText("Date ");
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 130, 30));

        ANPadd.setBackground(new java.awt.Color(87, 191, 109));
        ANPadd.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ANPadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSAVE.png"))); // NOI18N
        ANPadd.setText("Add");
        ANPadd.setBorder(null);
        ANPadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPaddActionPerformed(evt);
            }
        });
        jPanel2.add(ANPadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 120, 40));

        jButton2.setBackground(new java.awt.Color(237, 74, 65));
        jButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerback.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 120, 40));

        ANPdate.setDateFormatString("yyyy-MM-d");
        jPanel2.add(ANPdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 210, 30));

        ANPgender.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ANPgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        ANPgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANPgenderActionPerformed(evt);
            }
        });
        jPanel2.add(ANPgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 190, 30));

        ANPguardianempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPguardianempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ANPguardianempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 140, 20));

        ANPstudentIDempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPstudentIDempty.setForeground(new java.awt.Color(237, 74, 65));
        ANPstudentIDempty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(ANPstudentIDempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 190, 20));

        ANPfirstempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPfirstempty.setForeground(new java.awt.Color(237, 74, 65));
        ANPfirstempty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(ANPfirstempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 190, 20));

        ANPlastempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPlastempty.setForeground(new java.awt.Color(237, 74, 65));
        ANPlastempty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(ANPlastempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 190, 20));

        ANPmiddleempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPmiddleempty.setForeground(new java.awt.Color(237, 74, 65));
        ANPmiddleempty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(ANPmiddleempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 190, 20));

        ANPageempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPageempty.setForeground(new java.awt.Color(237, 74, 65));
        ANPageempty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(ANPageempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 190, 20));

        ANPcontactempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPcontactempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ANPcontactempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 210, 20));

        ANPtimeempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPtimeempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ANPtimeempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 210, 20));

        ANPbedempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPbedempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ANPbedempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 210, 20));

        ANPsickempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ANPsickempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ANPsickempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 210, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ANPfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPfirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPfirstActionPerformed

    private void ANPstudIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPstudIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPstudIdActionPerformed

    private void ANPlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPlastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPlastActionPerformed

    private void ANPmiddleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPmiddleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPmiddleActionPerformed

    private void ANPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPageActionPerformed

    private void ANPsickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPsickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPsickActionPerformed

    private void ANPbednumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPbednumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPbednumberActionPerformed

    private void ANPguardianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPguardianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPguardianActionPerformed

    private void ANPtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPtimeActionPerformed

    private void ANPcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPcontactnumberActionPerformed

    private void ANPaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPaddActionPerformed
        // sa mga ADD at EDIT form di pa naayos yung sa text field na nakakapaginput si user sa textfield ng
        // number kahit text lang dapat ang dapat tinatamad pa ako

        if (ANPstudId.getText().trim().isEmpty() && ANPfirst.getText().trim().isEmpty() && ANPlast.getText().trim().isEmpty() && ANPmiddle.getText().trim().isEmpty()
                && ANPage.getText().trim().isEmpty() && ANPcontactnumber.getText().trim().isEmpty() && ANPtime.getText().trim().isEmpty()
                && ANPbednumber.getText().trim().isEmpty() && ANPsick.getText().trim().isEmpty() && ANPguardian.getText().trim().isEmpty()) //di pa naayos tinamad na
        {
            ANPstudentIDempty.setText("Student ID is empty");
            ANPfirstempty.setText("first name is empty");
            ANPlastempty.setText("last name is empty");
            ANPmiddleempty.setText("middle name is empty");
            ANPageempty.setText("Age is empty");
            ANPcontactempty.setText("contact number is empty");
            ANPtimeempty.setText("time admit is empty");
            ANPbedempty.setText("bed number is empty");
            ANPsickempty.setText("sickness is empty");
            ANPguardianempty.setText("Guardian contact number is empty");

        } else if (ANPstudId.getText().trim().isEmpty()) {
            ANPstudentIDempty.setText("record number  is empty");
        } else if (ANPfirst.getText().trim().isEmpty()) {
            ANPfirstempty.setText("first name is empty");
        } else if (ANPlast.getText().trim().isEmpty()) {
            ANPlastempty.setText("last name is empty");
        } else if (ANPmiddle.getText().trim().isEmpty()) {
            ANPmiddleempty.setText("middle name is empty");
        } else if (ANPage.getText().trim().isEmpty()) {
            ANPageempty.setText("Age is empty");
        } else if (ANPcontactnumber.getText().trim().isEmpty()) {
            ANPcontactempty.setText("contact number is empty");
        } else if (ANPtime.getText().trim().isEmpty()) {
            ANPtimeempty.setText("time admit is empty");
        } else if (ANPbednumber.getText().trim().isEmpty()) {
            ANPbedempty.setText("bed number is empty");
        } else if (ANPsick.getText().trim().isEmpty()) {
            ANPsickempty.setText("sickness is empty");
        } else if (ANPguardian.getText().trim().isEmpty()) {
            ANPguardianempty.setText("Guardian contact number is empty");
        } else {
            String sql = "Insert into clinicmanagement.patients (studentid, firstname, lastname, middlename, age, gender, date, contactnumber, time, bednumber, sick ,guardiannumber) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                pst = conn.prepareStatement(sql);

                pst.setInt(1, Integer.parseInt(ANPstudId.getText()));
                pst.setString(2, ANPfirst.getText());
                pst.setString(3, ANPlast.getText());
                pst.setString(4, ANPmiddle.getText());
                pst.setInt(5, Integer.parseInt(ANPage.getText()));
                pst.setString(6, ANPgender.getSelectedItem().toString());
                pst.setString(7, ((JTextField) ANPdate.getDateEditor().getUiComponent()).getText());
                  pst.setString(8, ANPcontactnumber.getText());
//                pst.setInt(8, Integer.parseInt(ANPcontactnumber.getText()));
                pst.setInt(9, Integer.parseInt(ANPtime.getText()));
                pst.setInt(10, Integer.parseInt(ANPbednumber.getText()));
                pst.setString(11, ANPsick.getText());
                pst.setString(12, ANPguardian.getText());
//                pst.setInt(12, Integer.parseInt(ANPguardian.getText()));

                pst.execute();

                JOptionPane.showMessageDialog(null, "Successfully Added");
                new Main().setVisible(true);
                setVisible(false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "studentID is already use");
            }
        }


    }//GEN-LAST:event_ANPaddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main c = new Main();
        c.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void ANPgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANPgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANPgenderActionPerformed

    private void ANPstudIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPstudIdKeyPressed
        ANPstudentIDempty.setText("");
    }//GEN-LAST:event_ANPstudIdKeyPressed

    private void ANPfirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPfirstKeyPressed
        ANPfirstempty.setText("");
    }//GEN-LAST:event_ANPfirstKeyPressed

    private void ANPlastKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPlastKeyPressed
        ANPlastempty.setText("");
    }//GEN-LAST:event_ANPlastKeyPressed

    private void ANPmiddleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPmiddleKeyPressed
        ANPmiddleempty.setText("");
    }//GEN-LAST:event_ANPmiddleKeyPressed

    private void ANPageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPageKeyPressed
        ANPageempty.setText("");
    }//GEN-LAST:event_ANPageKeyPressed

    private void ANPcontactnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPcontactnumberKeyPressed
        ANPcontactempty.setText("");
    }//GEN-LAST:event_ANPcontactnumberKeyPressed

    private void ANPtimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPtimeKeyPressed
        ANPtimeempty.setText("");
    }//GEN-LAST:event_ANPtimeKeyPressed

    private void ANPbednumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPbednumberKeyPressed
        ANPbedempty.setText("");
    }//GEN-LAST:event_ANPbednumberKeyPressed

    private void ANPsickKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPsickKeyPressed
        ANPsickempty.setText("");
    }//GEN-LAST:event_ANPsickKeyPressed

    private void ANPguardianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANPguardianKeyPressed
        ANPguardianempty.setText("");
    }//GEN-LAST:event_ANPguardianKeyPressed

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
            java.util.logging.Logger.getLogger(addnewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewPatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANPadd;
    private javax.swing.JTextField ANPage;
    private javax.swing.JLabel ANPageempty;
    private javax.swing.JLabel ANPbedempty;
    private javax.swing.JTextField ANPbednumber;
    private javax.swing.JLabel ANPcontactempty;
    private javax.swing.JTextField ANPcontactnumber;
    private com.toedter.calendar.JDateChooser ANPdate;
    private javax.swing.JTextField ANPfirst;
    private javax.swing.JLabel ANPfirstempty;
    private javax.swing.JComboBox ANPgender;
    private javax.swing.JTextField ANPguardian;
    private javax.swing.JLabel ANPguardianempty;
    private javax.swing.JTextField ANPlast;
    private javax.swing.JLabel ANPlastempty;
    private javax.swing.JTextField ANPmiddle;
    private javax.swing.JLabel ANPmiddleempty;
    private javax.swing.JTextField ANPsick;
    private javax.swing.JLabel ANPsickempty;
    private javax.swing.JTextField ANPstudId;
    private javax.swing.JLabel ANPstudentIDempty;
    private javax.swing.JTextField ANPtime;
    private javax.swing.JLabel ANPtimeempty;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
