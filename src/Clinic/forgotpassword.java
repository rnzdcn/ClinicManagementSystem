/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jomari
 */
public class forgotpassword extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form forgotpassword
     */
    public forgotpassword() {
        initComponents();
        conn = connection.ConnecrDb();
        this.setLocationRelativeTo(null);
        
        //for modal
//        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FPsearch = new javax.swing.JButton();
        FPretrieve = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        FPfirst = new javax.swing.JTextField();
        FPlast = new javax.swing.JTextField();
        FPpassword = new javax.swing.JTextField();
        FPusername = new javax.swing.JTextField();
        FPsecuritycode = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        FPpasswordempty = new javax.swing.JLabel();
        FPusernameempty = new javax.swing.JLabel();
        FPfirstempty = new javax.swing.JLabel();
        FPlastempty = new javax.swing.JLabel();
        FPsecurityempty = new javax.swing.JLabel();
        retrieveclick = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel8.setBackground(new java.awt.Color(204, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerUsername.png"))); // NOI18N
        jLabel8.setText("Username");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jLabel8.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(87, 191, 109));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/ForgotpasswordIMG/forgotHeader.png"))); // NOI18N
        jLabel1.setText("Forgot Password");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 390, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 100));

        jPanel1.setBackground(new java.awt.Color(10, 46, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(10, 46, 54));
        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/ForgotpasswordIMG/forgotUsername.png"))); // NOI18N
        jLabel9.setText("Username");
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 130, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/ForgotpasswordIMG/lastname.png"))); // NOI18N
        jLabel6.setText("Last Name");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, 30));

        jLabel4.setBackground(new java.awt.Color(10, 46, 54));
        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/ForgotpasswordIMG/firstname.png"))); // NOI18N
        jLabel4.setText("First Name");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/ForgotpasswordIMG/forgotCode.png"))); // NOI18N
        jLabel7.setText("Security Code");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, 30));

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerpassword.png"))); // NOI18N
        jLabel5.setText("Your Password");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 130, 30));

        FPsearch.setBackground(new java.awt.Color(204, 255, 255));
        FPsearch.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        FPsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/ForgotpasswordIMG/forgotSearch.png"))); // NOI18N
        FPsearch.setText("SEARCH");
        FPsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPsearchActionPerformed(evt);
            }
        });
        jPanel1.add(FPsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 110, 30));

        FPretrieve.setBackground(new java.awt.Color(87, 191, 109));
        FPretrieve.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        FPretrieve.setForeground(new java.awt.Color(255, 255, 255));
        FPretrieve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/ForgotpasswordIMG/forgotRetrieve.png"))); // NOI18N
        FPretrieve.setText("RETRIEVE");
        FPretrieve.setBorder(null);
        FPretrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPretrieveActionPerformed(evt);
            }
        });
        jPanel1.add(FPretrieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 120, 40));

        jButton4.setBackground(new java.awt.Color(237, 74, 65));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/ForgotpasswordIMG/forgotClear.png"))); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 120, 40));

        FPfirst.setEditable(false);
        FPfirst.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        FPfirst.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FPfirst.setPreferredSize(new java.awt.Dimension(60, 20));
        FPfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPfirstActionPerformed(evt);
            }
        });
        jPanel1.add(FPfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 190, 30));

        FPlast.setEditable(false);
        FPlast.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        FPlast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FPlast.setPreferredSize(new java.awt.Dimension(60, 20));
        FPlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPlastActionPerformed(evt);
            }
        });
        jPanel1.add(FPlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 190, 30));

        FPpassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        FPpassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FPpassword.setPreferredSize(new java.awt.Dimension(60, 20));
        FPpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(FPpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 190, 30));

        FPusername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        FPusername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FPusername.setPreferredSize(new java.awt.Dimension(60, 20));
        FPusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPusernameActionPerformed(evt);
            }
        });
        jPanel1.add(FPusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 190, 30));

        FPsecuritycode.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        FPsecuritycode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FPsecuritycode.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(FPsecuritycode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 190, 30));

        jButton5.setBackground(new java.awt.Color(237, 74, 65));
        jButton5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/ForgotpasswordIMG/forgotBack.png"))); // NOI18N
        jButton5.setText("BACK");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 120, 40));

        FPpasswordempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        FPpasswordempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(FPpasswordempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 190, 20));

        FPusernameempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        FPusernameempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(FPusernameempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 190, 20));

        FPfirstempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        FPfirstempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(FPfirstempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 190, 20));

        FPlastempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        FPlastempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(FPlastempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 190, 20));

        FPsecurityempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        FPsecurityempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(FPsecurityempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 190, 20));

        retrieveclick.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        retrieveclick.setForeground(new java.awt.Color(237, 74, 65));
        retrieveclick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(retrieveclick, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 440, 20));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Type your username here and click search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 260, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FPsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPsearchActionPerformed
        if (FPusername.getText().trim().isEmpty()) {
            FPusernameempty.setText("username is empty");
        } else if (FPusername.getText().trim().isEmpty()) {
            FPusernameempty.setText("username is empty");
        } else {
            FPsearch.setEnabled(rootPaneCheckingEnabled);
            String al = FPusername.getText();
            String all = "select * from clinicmanagement.admin where username= '" + al + "'";
            try {
                pst = conn.prepareStatement(all);
                rs = pst.executeQuery();
                if (rs.next()) {
                    FPfirst.setText(rs.getString(2));
                    FPlast.setText(rs.getString(3));
                    FPsecuritycode.setEditable(rootPaneCheckingEnabled);

                    rs.close();
                    pst.close();
                    retrieveclick.setText("<--Click this to retrieve your account");
                    FPsecurityempty.setText("type your security answer here");

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username");
                    FPusernameempty.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_FPsearchActionPerformed

    private void FPretrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPretrieveActionPerformed
        if (FPsecuritycode.getText().trim().isEmpty()) {
            FPsecurityempty.setText("security code is empty");
        } else if (FPsecuritycode.getText().trim().isEmpty()) {
            FPsecurityempty.setText("answer is empty");
        } else {
             String user = FPusername.getText();
            String asl = FPsecuritycode.getText();
            String asllQuery =  "select * from clinicmanagement.admin where username='" + user + "' and code='" + asl + "'";
            try {
                pst = conn.prepareStatement(asllQuery);
                rs = pst.executeQuery();
                if (rs.next()) {
                    FPpassword.setText(rs.getString(4));
                    rs.close();
                    pst.close();
                    FPpasswordempty.setText("Your password is ");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Answer");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_FPretrieveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FPusername.setText("");
        FPpassword.setText("");
        FPfirst.setText("");
        FPlast.setText("");
        FPsecuritycode.setText("");
        //all label text
        FPusernameempty.setText("");
        FPpasswordempty.setText("");
        FPfirstempty.setText("");
        FPlastempty.requestFocus();
        FPsecurityempty.setText("");
        retrieveclick.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void FPfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPfirstActionPerformed

    }//GEN-LAST:event_FPfirstActionPerformed

    private void FPlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPlastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FPlastActionPerformed

    private void FPpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FPpasswordActionPerformed

    private void FPusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FPusernameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Back button
        signup back = new signup();
        back.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FPfirst;
    private javax.swing.JLabel FPfirstempty;
    private javax.swing.JTextField FPlast;
    private javax.swing.JLabel FPlastempty;
    private javax.swing.JTextField FPpassword;
    private javax.swing.JLabel FPpasswordempty;
    private javax.swing.JButton FPretrieve;
    private javax.swing.JButton FPsearch;
    private javax.swing.JPasswordField FPsecuritycode;
    private javax.swing.JLabel FPsecurityempty;
    private javax.swing.JTextField FPusername;
    private javax.swing.JLabel FPusernameempty;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel retrieveclick;
    // End of variables declaration//GEN-END:variables
}
