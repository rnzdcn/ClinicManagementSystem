/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jomari
 */
public class addnewMedicine extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st=null;
    int id;
    private Object arg0;
    /**
     * Creates new form addnewMedicine
     */
    public addnewMedicine() {
        initComponents();
        conn = connection.ConnecrDb();  AMidmedicine.requestFocus();
        this.setLocationRelativeTo(null);
        id();

    }
    
    public void id(){
        try
        {
         String sql = "select max(id) from clinicmanagement.inventory";
         st = conn.createStatement();
         rs = st.executeQuery(sql);
         if(rs.next())
         {
             id=rs.getInt(1);
             id++;
             AMidmedicine.setText(Integer.toString(id));
         }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
    }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AMidmedicine = new javax.swing.JTextField();
        AMquantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        AMstatus = new javax.swing.JComboBox();
        AMdateE = new com.toedter.calendar.JDateChooser();
        AMdateR = new com.toedter.calendar.JDateChooser();
        AMstatusempty = new javax.swing.JLabel();
        AMmedicineempty = new javax.swing.JLabel();
        AMquantityempty = new javax.swing.JLabel();
        AMdateEempty = new javax.swing.JLabel();
        AMdateRempty = new javax.swing.JLabel();
        AMmedicine = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(87, 191, 109));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addMedicineIMG/addmedicineHeader.png"))); // NOI18N
        jLabel1.setText("Add Medicine");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 342, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        jPanel2.setBackground(new java.awt.Color(10, 46, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Medicine Report #");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 160, 30));

        AMidmedicine.setEditable(false);
        AMidmedicine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AMidmedicine.setPreferredSize(new java.awt.Dimension(60, 20));
        AMidmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMidmedicineActionPerformed(evt);
            }
        });
        AMidmedicine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AMidmedicineKeyPressed(evt);
            }
        });
        jPanel2.add(AMidmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 190, 30));

        AMquantity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AMquantity.setPreferredSize(new java.awt.Dimension(60, 20));
        AMquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMquantityActionPerformed(evt);
            }
        });
        AMquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AMquantityKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AMquantityKeyTyped(evt);
            }
        });
        jPanel2.add(AMquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 190, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addMedicineIMG/addnewmedicineQuantity.png"))); // NOI18N
        jLabel6.setText("Quantity");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addMedicineIMG/addnewmedicineDateR.png"))); // NOI18N
        jLabel7.setText("Date Recieved");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 160, 30));

        jLabel8.setBackground(new java.awt.Color(10, 46, 54));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addMedicineIMG/addnewmedicineEDate.png"))); // NOI18N
        jLabel8.setText("Expiration Date");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 160, 30));

        jLabel11.setBackground(new java.awt.Color(10, 46, 54));
        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addMedicineIMG/addnewmedicineStatus.png"))); // NOI18N
        jLabel11.setText("Status");
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 150, 30));

        jButton4.setBackground(new java.awt.Color(87, 191, 109));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSAVE.png"))); // NOI18N
        jButton4.setText("ADD");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 120, 40));

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
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 40));

        AMstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Not available" }));
        AMstatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AMstatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AMstatusKeyPressed(evt);
            }
        });
        jPanel2.add(AMstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 190, 30));

        AMdateE.setDateFormatString("yyyy-MM-d");
        AMdateE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AMdateEKeyPressed(evt);
            }
        });
        jPanel2.add(AMdateE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 190, 30));

        AMdateR.setDateFormatString("yyyy-MM-d");
        AMdateR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMdateRMouseClicked(evt);
            }
        });
        AMdateR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AMdateRKeyPressed(evt);
            }
        });
        jPanel2.add(AMdateR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 190, 30));

        AMstatusempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        AMstatusempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(AMstatusempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 190, 20));

        AMmedicineempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        AMmedicineempty.setForeground(new java.awt.Color(237, 74, 65));
        AMmedicineempty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AMmedicineemptyKeyPressed(evt);
            }
        });
        jPanel2.add(AMmedicineempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 20));

        AMquantityempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        AMquantityempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(AMquantityempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 190, 20));

        AMdateEempty.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        AMdateEempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(AMdateEempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 190, 20));

        AMdateRempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        AMdateRempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(AMdateRempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 190, 20));

        AMmedicine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AMmedicine.setPreferredSize(new java.awt.Dimension(60, 20));
        AMmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMmedicineActionPerformed(evt);
            }
        });
        AMmedicine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AMmedicineKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AMmedicineKeyReleased(evt);
            }
        });
        jPanel2.add(AMmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 190, 30));

        jLabel9.setBackground(new java.awt.Color(10, 46, 54));
        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Medicine Name");
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AMidmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMidmedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMidmedicineActionPerformed

    private void AMquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMquantityActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (AMmedicine.getText().trim().isEmpty() && AMquantity.getText().trim().isEmpty()) 
//error di makuha yung sa getdate   && AMdateR.getText().trim().isEmpty() && AMdateE.getText().trim().isEmpty()&& AMstatus.getSelectedItem().toString().isEmpty()) 
            
       {
            JOptionPane.showMessageDialog(null, "Enter all details before proceeding");
            AMmedicineempty.setText("Medicine is empty");
            AMquantityempty.setText("Quanity name is empty");
            AMdateRempty.setText("Date Recieved is empty");
           AMdateEempty.setText("Date Expired is empty");
       //    AMstatusempty.setText("select status is empty");

            
             } else if (AMidmedicine.getText().trim().isEmpty()) {
               AMmedicineempty.setText("Medicine is empty");
            } else if (AMquantity.getText().trim().isEmpty()) {
               AMquantityempty.setText("Quantity is empty");
//           } else if (AMdateR.getJCalendar().toString().isEmpty()) {
//              AMdateRempty.setText("Date recieved is empty");
//            } else if (AMdateE.getText().trim().isEmpty()) {
//                AMdateEempty.setText("Date Expired name is empty");
//           } else if (AMstatus.getSelectedItem().toString().isEmpty()) {
//               AMstatusempty.setText("status is empty");
            }else{
             String sql = "Insert into clinicmanagement.inventory (id,medicinename, quantity, daterecieved, expirationdate, status) values (?,?,?,?,?,?)";
             try{
              pst = conn.prepareStatement(sql);
       
               pst.setInt(1, Integer.parseInt(AMidmedicine.getText())); 
               pst.setString(2, AMidmedicine.getText());
               pst.setInt(3, Integer.parseInt(AMquantity.getText()));
               pst.setString(4, ((JTextField)AMdateR.getDateEditor().getUiComponent()).getText());
               pst.setString(5, ((JTextField)AMdateE.getDateEditor().getUiComponent()).getText());
               pst.setString(6, AMstatus.getSelectedItem().toString());
               pst.execute();

           
              JOptionPane.showMessageDialog(null,"Medicine Added");
               new Inventory().setVisible(true);
               setVisible(false);
                
               
       }
       catch(Exception e)
       {
    JOptionPane.showMessageDialog(null, "Medicine Name is already use");
       }     
             }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inventory c = new Inventory  ();
        c.setVisible(true);
        setVisible(false);
                        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AMmedicineemptyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMmedicineemptyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMmedicineemptyKeyPressed

    private void AMidmedicineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMidmedicineKeyPressed
        AMmedicineempty.setText("");
    }//GEN-LAST:event_AMidmedicineKeyPressed

    private void AMquantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMquantityKeyPressed
        AMquantityempty.setText("");
    }//GEN-LAST:event_AMquantityKeyPressed

    private void AMdateRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMdateRKeyPressed
        AMdateRempty.setText("");
    }//GEN-LAST:event_AMdateRKeyPressed

    private void AMdateEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMdateEKeyPressed
        AMdateEempty.setText("");
    }//GEN-LAST:event_AMdateEKeyPressed

    private void AMstatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMstatusKeyPressed
        AMstatusempty.setText("");
    }//GEN-LAST:event_AMstatusKeyPressed

    private void AMdateRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMdateRMouseClicked
        AMdateRempty.setText("");
    }//GEN-LAST:event_AMdateRMouseClicked

    private void AMmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMmedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMmedicineActionPerformed

    private void AMmedicineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMmedicineKeyPressed
       AMmedicineempty.setText("");
    }//GEN-LAST:event_AMmedicineKeyPressed

    private void AMmedicineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMmedicineKeyReleased
         char c = evt.getKeyChar();

    if(Character.isLetter(c) ||(c==KeyEvent.VK_BACK_SPACE) ||(c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_ENTER || c==KeyEvent.VK_MINUS){
    }else if(evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK ){
    }
    else if(evt.getKeyCode() == KeyEvent.VK_SHIFT ){    
       AMmedicine.setEditable(true);
    }else {
         JOptionPane.showMessageDialog(null, "Invalid Character.");
        AMmedicine.setText("");
    }
    }//GEN-LAST:event_AMmedicineKeyReleased

    private void AMquantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMquantityKeyTyped
       char c = evt.getKeyChar();

     if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )){
         getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Please enter quantity");
         evt.consume();
         
     
    }           
    }//GEN-LAST:event_AMquantityKeyTyped

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
            java.util.logging.Logger.getLogger(addnewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AMdateE;
    private javax.swing.JLabel AMdateEempty;
    private com.toedter.calendar.JDateChooser AMdateR;
    private javax.swing.JLabel AMdateRempty;
    private javax.swing.JTextField AMidmedicine;
    private javax.swing.JTextField AMmedicine;
    private javax.swing.JLabel AMmedicineempty;
    private javax.swing.JTextField AMquantity;
    private javax.swing.JLabel AMquantityempty;
    private javax.swing.JComboBox AMstatus;
    private javax.swing.JLabel AMstatusempty;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
