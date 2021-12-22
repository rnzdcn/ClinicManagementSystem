/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import static Clinic.Inventory.Itable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jomari
 */
public class Main extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st=null;
    /**
     * Creates new form Main
           */
    public Main() {
    initComponents();
    conn = connection.ConnecrDb();
    this.setLocationRelativeTo(null);

   
    updateTable();
    setTitle("Patients Record - table");
    updateTable();
    
    
     
    //table columns
         maintable.getColumnModel().getColumn(0).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(1).setPreferredWidth(800);
         maintable.getColumnModel().getColumn(2).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(3).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(4).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(5).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(6).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(7).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(8).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(9).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(10).setPreferredWidth(880);
         maintable.getColumnModel().getColumn(11).setPreferredWidth(880);
        
    //cell not editable     
    maintable.setDefaultEditor(Object.class, null);
    //header design
    maintable.getTableHeader().setDefaultRenderer(new HeaderColor());
        maintable.setRowHeight(30);
    
    }
    public class HeaderColor extends DefaultTableCellRenderer {
      public HeaderColor() {
            setOpaque(true);
            
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
             //table design
       setFont(new Font("Segoe UI", Font.BOLD, 12));
       setBackground(new java.awt.Color(32, 136, 203));
           return this;
       }
        }
    
     public void updateTable() {
        try {
           // String sql = "select * from clinicmanagement.patients";
             String sql = "select studentid as 'Student ID', firstname as 'Firstname', lastname as 'Lastname', middlename as 'Middle name', age as 'Age', gender as 'Gender', date as 'Date', contactnumber as 'Contact No.', "
                    + "time as 'Time Admit', bednumber as 'Bed No.', sick as 'Sick', guardiannumber as 'Guardian Contact No.' from clinicmanagement.patients";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            maintable.setModel(DbUtils.resultSetToTableModel(rs));

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

    public void update() {
        updateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mainView = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mainDelete = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("patientInformation");
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 46, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/refresh.png"))); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 100, 30));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 240, 30));
        search.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setBackground(new java.awt.Color(87, 191, 109));
        jPanel3.setForeground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/patient.png"))); // NOI18N
        jLabel2.setText("Patients Information");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 653, 75));

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
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        jLabel1.setBackground(new java.awt.Color(10, 46, 54));
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/managepatients.png"))); // NOI18N
        jLabel1.setText("MANAGE PATIENTS");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/addpatients.png"))); // NOI18N
        jButton2.setText("Add new patients");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 40));

        mainView.setBackground(new java.awt.Color(255, 255, 255));
        mainView.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        mainView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/viewinfo.png"))); // NOI18N
        mainView.setText("View information");
        mainView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainViewActionPerformed(evt);
            }
        });
        jPanel1.add(mainView, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 230, 40));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/update.png"))); // NOI18N
        jButton9.setText("Update Patient");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/printer.png"))); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 230, 40));

        mainDelete.setBackground(new java.awt.Color(255, 255, 255));
        mainDelete.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        mainDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/delete.png"))); // NOI18N
        mainDelete.setText("Delete");
        mainDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(mainDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 230, 40));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/back.png"))); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 230, 40));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/search.png"))); // NOI18N
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, -1, 30));

        maintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        maintable.setSelectionBackground(new java.awt.Color(87, 191, 109));
        maintable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(maintable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 980, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainViewActionPerformed
      try {

            int selectedRow = maintable.getSelectedRow();
            String row = (maintable.getModel().getValueAt(selectedRow, 0).toString());
            viewpatientsInformation.setRow(row);
            viewpatientsInformation view = new viewpatientsInformation();
            view.setVisible(true);
            setVisible(false);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Please select an account.", "Error", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_mainViewActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:

        addnewPatients c = new addnewPatients();
                c.setVisible(true);
                setVisible(false);
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       MessageFormat header = new MessageFormat("Cavite State University Silang Campus Student Clinic Patients Record.");

        MessageFormat footer = new MessageFormat("Page{10,number,integer}");
        try {

            maintable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
                                           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel table = (DefaultTableModel) maintable.getModel();
   
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        maintable.setRowSorter(tr);
      
        search.setText("");
                            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Menu c = new Menu();
        c.setVisible(true);
        setVisible(false);                      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
          updateTable();
          search.setText("");
                                        

    }//GEN-LAST:event_searchActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       try {
            int selectedRow = maintable.getSelectedRow();
            String row = (maintable.getModel().getValueAt(selectedRow, 0).toString());
            editPatients.setRow(row);
            editPatients er = new editPatients();
            er.setVisible(true);
            setVisible(false);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Please select an account.", "Error", JOptionPane.WARNING_MESSAGE);
        }
                                                                              
    }//GEN-LAST:event_jButton9ActionPerformed

    private void mainDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainDeleteActionPerformed
        try {
            int selectedRow = maintable.getSelectedRow();
            String tmp = (maintable.getValueAt(selectedRow, 0).toString());
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Delete Record", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                String sql = "Delete from clinicmanagement.patients where studentid = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, tmp);
                pst.execute();
                updateTable();
                JOptionPane.showMessageDialog(null, "Record deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                rs.close();
                pst.close();

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Please select an account", "Errpr", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                                    
    }//GEN-LAST:event_mainDeleteActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel table = (DefaultTableModel) maintable.getModel();
        String sea = search.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        maintable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(sea));

    }//GEN-LAST:event_searchKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//       int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?","Confirm",
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

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        setLblColor(jButton2);
    }//GEN-LAST:event_jButton2MousePressed
    public void setLblColor(JButton btn){
        btn.setForeground(new Color(48,201,235));
    }
    public void resetColor(JButton btn){
        btn.setForeground(new Color(166,166,166));
        
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainDelete;
    private javax.swing.JButton mainView;
    private javax.swing.JTable maintable;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
