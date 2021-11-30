package Clinic;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static Clinic.Menu.userName;

public class signup extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

//     Creates new form signup
    public signup() {
        initComponents();
//may admin id talalga nilagyan ko lang yan haha
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Signin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();
        labelpass = new javax.swing.JLabel();
        labeluser = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 46, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLINIC MANAGEMENT SYSTEM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 80));

        jLabel2.setBackground(new java.awt.Color(10, 46, 54));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/nurse.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 280, 320));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 440));

        Signin.setBackground(new java.awt.Color(255, 255, 255));
        Signin.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        Signin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Signin.setText("Sign In");
        Signin.setOpaque(true);
        jPanel1.add(Signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 230, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/password.png"))); // NOI18N
        jLabel3.setText("Password");
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 100, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/usernameicon.png"))); // NOI18N
        jLabel4.setText("Username");
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 20));
        jLabel4.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 110, 30));

        username.setBackground(new java.awt.Color(87, 191, 109));
        username.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        username.setMargin(new java.awt.Insets(2, 10, 2, 2));
        username.setPreferredSize(new java.awt.Dimension(60, 20));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 280, 40));

        password.setBackground(new java.awt.Color(87, 191, 109));
        password.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        password.setPreferredSize(new java.awt.Dimension(60, 20));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 220, 40));

        jButton2.setBackground(new java.awt.Color(10, 46, 54));
        jButton2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/login.png"))); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 110, 40));

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(87, 191, 109));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/forgotpassword.png"))); // NOI18N
        jLabel5.setText("Forgot Password?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 170, -1));

        jPanel3.setBackground(new java.awt.Color(87, 191, 109));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 30));

        show.setBackground(new java.awt.Color(255, 255, 255));
        show.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 60, 40));

        labelpass.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        labelpass.setForeground(new java.awt.Color(237, 74, 65));
        labelpass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(labelpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 220, 20));

        labeluser.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        labeluser.setForeground(new java.awt.Color(237, 74, 65));
        labeluser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(labeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 280, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (username.getText().trim().isEmpty() && password.getText().trim().isEmpty()) {
            labeluser.setText("username is empty");
            labelpass.setText("password is empty");

        } else if (username.getText().trim().isEmpty()) {
            labelpass.setText("username is empty");
        } else if (password.getText().trim().isEmpty()) {
            labelpass.setText("password is empty");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicmanagement", "root", "");
                String sql = "select * from clinicmanagement.admin where binary username=? and binary password=?";
                //Connect con = new Connect();
                // con.connection = Connect.ConnecrDb();

                pst = connection.prepareStatement(sql);
                pst.setString(1, username.getText());
                pst.setString(2, password.getText());

                rs = pst.executeQuery();
                if (rs.next()) {
                    String a = rs.getString("firstname");
                    String b = rs.getString("lastname");
                    userName.setText(a + " " + b);
                    Menu s = new Menu();
                    s.setVisible(true);
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Username or password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            } finally {

                try {

                    rs.close();
                    pst.close();

                } catch (Exception e) {

                }
            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if (show.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }

    }//GEN-LAST:event_showActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        forgotpassword s = new forgotpassword();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String sql = "select * from admin where Username=? and Password=?";
            connection con = new connection();
//        con.connection = connection.ConnecrDb();
            try {
                con.pst = con.connection.prepareStatement(sql);
                con.pst.setString(1, username.getText());
                con.pst.setString(2, password.getText());

                con.rs = con.pst.executeQuery();
                if (con.rs.next()) {
                    JOptionPane.showMessageDialog(null, "Username and password is correct");
                    //database locked
                    con.rs.close();
                    con.pst.close();

                    Menu s = new Menu();
                    s.setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Username and password is not correct");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            } finally {
                try {
                    con.rs.close();
                    con.pst.close();

                } catch (Exception e) {

                }

            }
        }
    }//GEN-LAST:event_passwordKeyReleased

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        labeluser.setText("");
    }//GEN-LAST:event_usernameKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        labelpass.setText("");
    }//GEN-LAST:event_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Signin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelpass;
    private javax.swing.JLabel labeluser;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
