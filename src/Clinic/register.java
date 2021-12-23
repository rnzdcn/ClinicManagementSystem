/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jomari
 */
public class register extends javax.swing.JDialog {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form register
     */
    public register() {
        //for modal
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
//        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        initComponents();
        //Connection
        conn = connection.ConnecrDb();
        this.setLocationRelativeTo(null);
        setTitle("Create Account");
            
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        CRfirstname = new javax.swing.JTextField();
        CRlastname = new javax.swing.JTextField();
        CRusername = new javax.swing.JTextField();
        CRpassword = new javax.swing.JPasswordField();
        CRconfirmpassword = new javax.swing.JPasswordField();
        CRcode = new javax.swing.JPasswordField();
        CRuserempty = new javax.swing.JLabel();
        CRfirstempty = new javax.swing.JLabel();
        CRlastempty = new javax.swing.JLabel();
        CRcodeempty = new javax.swing.JLabel();
        CRpassempty = new javax.swing.JLabel();
        CRconfirmempty = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 500));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 46, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(10, 46, 54));
        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/confirmPass.png"))); // NOI18N
        jLabel3.setText("Confirm Password");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 160, 30));

        jLabel4.setBackground(new java.awt.Color(10, 46, 54));
        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/firstname.png"))); // NOI18N
        jLabel4.setText("First Name");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, 30));

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerpassword.png"))); // NOI18N
        jLabel5.setText("Password");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/lastname.png"))); // NOI18N
        jLabel6.setText("Last Name");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registercode.png"))); // NOI18N
        jLabel7.setText("Security Code");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 30));

        jLabel8.setBackground(new java.awt.Color(10, 46, 54));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerUsername.png"))); // NOI18N
        jLabel8.setText("Username");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, 30));

        jButton2.setBackground(new java.awt.Color(237, 74, 65));
        jButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerback.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, 40));

        jButton3.setBackground(new java.awt.Color(87, 191, 109));
        jButton3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerCreate.png"))); // NOI18N
        jButton3.setText("CREATE");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 120, 40));

        jButton4.setBackground(new java.awt.Color(237, 74, 65));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerClear.png"))); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 40));

        CRfirstname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CRfirstname.setPreferredSize(new java.awt.Dimension(60, 20));
        CRfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRfirstnameActionPerformed(evt);
            }
        });
        CRfirstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CRfirstnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CRfirstnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CRfirstnameKeyTyped(evt);
            }
        });
        jPanel1.add(CRfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 190, 30));

        CRlastname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CRlastname.setPreferredSize(new java.awt.Dimension(60, 20));
        CRlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRlastnameActionPerformed(evt);
            }
        });
        CRlastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CRlastnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CRlastnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CRlastnameKeyTyped(evt);
            }
        });
        jPanel1.add(CRlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 190, 30));

        CRusername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CRusername.setPreferredSize(new java.awt.Dimension(60, 20));
        CRusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRusernameActionPerformed(evt);
            }
        });
        CRusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CRusernameKeyPressed(evt);
            }
        });
        jPanel1.add(CRusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 190, 30));

        CRpassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CRpassword.setPreferredSize(new java.awt.Dimension(60, 20));
        CRpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CRpasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CRpasswordKeyReleased(evt);
            }
        });
        jPanel1.add(CRpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 190, 30));

        CRconfirmpassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CRconfirmpassword.setPreferredSize(new java.awt.Dimension(60, 20));
        CRconfirmpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CRconfirmpasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CRconfirmpasswordKeyReleased(evt);
            }
        });
        jPanel1.add(CRconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 190, 30));

        CRcode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CRcode.setPreferredSize(new java.awt.Dimension(60, 20));
        CRcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CRcodeKeyPressed(evt);
            }
        });
        jPanel1.add(CRcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 190, 30));

        CRuserempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        CRuserempty.setForeground(new java.awt.Color(237, 65, 65));
        jPanel1.add(CRuserempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 190, 20));

        CRfirstempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        CRfirstempty.setForeground(new java.awt.Color(237, 65, 65));
        jPanel1.add(CRfirstempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 190, 20));

        CRlastempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        CRlastempty.setForeground(new java.awt.Color(237, 65, 65));
        jPanel1.add(CRlastempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 20));

        CRcodeempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        CRcodeempty.setForeground(new java.awt.Color(237, 65, 65));
        jPanel1.add(CRcodeempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 190, 20));

        CRpassempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        CRpassempty.setForeground(new java.awt.Color(237, 65, 65));
        jPanel1.add(CRpassempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 190, 20));

        CRconfirmempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        CRconfirmempty.setForeground(new java.awt.Color(237, 65, 65));
        jPanel1.add(CRconfirmempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 190, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 400));

        jPanel2.setBackground(new java.awt.Color(87, 191, 109));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/nurseadminn.png"))); // NOI18N
        jLabel1.setText("Create Admin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 330, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        manageAdmin s = new manageAdmin();
        s.setVisible(false);
        setVisible(false); 
    

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     if (CRfirstname.getText().trim().isEmpty() && CRlastname.getText().trim().isEmpty() && CRusername.getText().trim().isEmpty()   &&  CRpassword.getText().trim().isEmpty() && CRconfirmpassword.getText().trim().isEmpty() && CRcode
             .getText().trim().isEmpty()) {
                    
         
            JOptionPane.showMessageDialog(null, "Enter all details before proceeding", "Error", JOptionPane.ERROR_MESSAGE);
            CRfirstempty.setText("fistname is empty");
            CRlastempty.setText("lastname is empty");
             CRuserempty.setText("username is empty");
            CRpassempty.setText("password is empty");
             CRconfirmempty.setText("confirm password is empty");
            CRcodeempty.setText("code is empty");
            

        } else if (CRfirstname.getText().trim().isEmpty()) {
            CRfirstempty.setText("fistname is empty");
            } else if (CRlastname.getText().trim().isEmpty()) {
            CRlastempty.setText("lastname is empty");
            } else if (CRusername.getText().trim().isEmpty()) {
            CRuserempty.setText("username is empty");
        } else if (CRpassword.getText().trim().isEmpty()) {
            CRpassempty.setText("password is empty");
            } else if (CRconfirmpassword.getText().trim().isEmpty()) {
            CRconfirmempty.setText("confirm password is empty");
            } else if (CRcode.getText().trim().isEmpty()) {
            CRcodeempty.setText("code is empty");
            }else if(CRpassword.getText().length()<6){
        JOptionPane.showMessageDialog(null, "password must be 6 character .");
            }else if(CRusername.getText().length()<6){
        JOptionPane.showMessageDialog(null, "username must be 6 character .");
        
            
        } else {
        String Pass = CRpassword.getText();
        String Cpass = CRconfirmpassword.getText();
        if(Pass.equals(Cpass)){
        String sql2 = "Insert into clinicmanagement.admin (firstname,lastname,username,password,confirmpassword,code) values(?,?,?,?,?,?)";
        try{
        pst=conn.prepareStatement(sql2);
                
                pst.setString(1, CRfirstname.getText());
                pst.setString(2, CRlastname.getText());
                pst.setString(3, CRusername.getText());
                pst.setString(4, CRpassword.getText());
                pst.setString(5,  CRconfirmpassword.getText());
                pst.setString(6, CRcode.getText());
                pst.execute();
                         
                JOptionPane.showMessageDialog(null,"Registration Success");
               new manageAdmin().setVisible(true);
              setVisible(false);
              
         }
        catch(Exception e)
        {
         
            JOptionPane.showMessageDialog(null,"username is already used");
            CRusername.setText("");
        }
         finally{
            try{
                rs.close();
                pst.close();   
            }
            catch(Exception e){
                
            }
        }
   
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"Passwords does not match.");
        
        
        }
            }
            

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    CRfirstname.setText(""); 
    CRlastname.setText("");
    CRusername.setText("");
    CRpassword.setText("");
    CRconfirmpassword.setText("");
    CRcode.setText("");
    CRfirstname.requestFocus();
    CRfirstempty.setText(""); 
    CRlastempty.setText(""); 
    CRuserempty.setText(""); 
    CRpassempty.setText(""); 
    CRconfirmempty.setText(""); 
    CRcodeempty.setText(""); 

    }//GEN-LAST:event_jButton4ActionPerformed

    private void CRfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRfirstnameActionPerformed

    private void CRlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRlastnameActionPerformed

    private void CRusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRusernameActionPerformed

    private void CRpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRpasswordKeyReleased
       if(CRpassword.getText().length()>15){
        JOptionPane.showMessageDialog(null, "Password must be 15 characters only.");
        }
                                  

    }//GEN-LAST:event_CRpasswordKeyReleased

    private void CRconfirmpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRconfirmpasswordKeyReleased
       if(CRconfirmpassword.getText().length()>15){
        JOptionPane.showMessageDialog(null, "Password must be 15 characters only.");
        }
                                   

    }//GEN-LAST:event_CRconfirmpasswordKeyReleased

    private void CRfirstnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRfirstnameKeyReleased
        
                    
    }//GEN-LAST:event_CRfirstnameKeyReleased

    private void CRlastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRlastnameKeyReleased
                   
    }//GEN-LAST:event_CRlastnameKeyReleased

    private void CRfirstnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRfirstnameKeyPressed
        CRfirstempty.setText("");
      
    }//GEN-LAST:event_CRfirstnameKeyPressed

    private void CRlastnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRlastnameKeyPressed
       CRlastempty.setText("");
    }//GEN-LAST:event_CRlastnameKeyPressed

    private void CRusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRusernameKeyPressed
        CRuserempty.setText("");
    }//GEN-LAST:event_CRusernameKeyPressed

    private void CRpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRpasswordKeyPressed
        CRpassempty.setText("");
    }//GEN-LAST:event_CRpasswordKeyPressed

    private void CRconfirmpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRconfirmpasswordKeyPressed
       CRconfirmempty.setText("");
    }//GEN-LAST:event_CRconfirmpasswordKeyPressed

    private void CRcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRcodeKeyPressed
       CRcodeempty.setText("");
    }//GEN-LAST:event_CRcodeKeyPressed

    private void CRfirstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRfirstnameKeyTyped
        //Letter only 
        if (!Character.isAlphabetic(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())) {
        evt.consume();
       
    } else if (CRfirstname.getText().trim().length() == 0 && Character.isLowerCase(evt.getKeyChar())) {
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }
    }//GEN-LAST:event_CRfirstnameKeyTyped

    private void CRlastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CRlastnameKeyTyped
          if (!Character.isAlphabetic(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())) {
        evt.consume();
       
    } else if (CRlastname.getText().trim().length() == 0 && Character.isLowerCase(evt.getKeyChar())) {
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }
    }//GEN-LAST:event_CRlastnameKeyTyped

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CRcode;
    private javax.swing.JLabel CRcodeempty;
    private javax.swing.JLabel CRconfirmempty;
    private javax.swing.JPasswordField CRconfirmpassword;
    private javax.swing.JLabel CRfirstempty;
    private javax.swing.JTextField CRfirstname;
    private javax.swing.JLabel CRlastempty;
    private javax.swing.JTextField CRlastname;
    private javax.swing.JLabel CRpassempty;
    private javax.swing.JPasswordField CRpassword;
    private javax.swing.JLabel CRuserempty;
    private javax.swing.JTextField CRusername;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
