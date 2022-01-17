package Clinic;

<<<<<<< Updated upstream
=======
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
>>>>>>> Stashed changes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
<<<<<<< Updated upstream
import javax.swing.JDialog;
=======
import javax.swing.BorderFactory;
import javax.swing.JButton;
>>>>>>> Stashed changes
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jomari I. Custodio
 */
public class Main extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st = null;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        conn = connection.ConnecrDb();
        this.setLocationRelativeTo(null);

<<<<<<< Updated upstream
        updateTable();
        setTitle("Patients Record - table");
        updateTable();
        maintable.getColumnModel().getColumn(0).setPreferredWidth(900);
        maintable.getColumnModel().getColumn(1).setPreferredWidth(800);
        maintable.getColumnModel().getColumn(2).setPreferredWidth(880);
        maintable.getColumnModel().getColumn(3).setPreferredWidth(880);
        maintable.getColumnModel().getColumn(4).setPreferredWidth(400);
        maintable.getColumnModel().getColumn(5).setPreferredWidth(700);
        maintable.getColumnModel().getColumn(6).setPreferredWidth(880);
        maintable.getColumnModel().getColumn(7).setPreferredWidth(880);
        maintable.getColumnModel().getColumn(8).setPreferredWidth(700);
        maintable.getColumnModel().getColumn(9).setPreferredWidth(550);
        maintable.getColumnModel().getColumn(10).setPreferredWidth(700);
        maintable.getColumnModel().getColumn(11).setPreferredWidth(1000);

    }

    public void updateTable() {
        try {
//            String sql = "select * from clinicmanagement.patients";
            String sql = "select studentid as 'Student ID', firstname as 'Firstname', lastname as 'Lastname', middlename as 'Middle name', age as 'Age', gender as 'Gender', date as 'Date', contactnumber as 'Contact No.', "
                    + "time as 'Time Admit', bednumber as 'Bed No.', sick as 'Sick', guardiannumber as 'Guardian Contact No.' from clinicmanagement.patients";
=======
        search.setBorder(BorderFactory.createCompoundBorder(
                search.getBorder(), BorderFactory.createEmptyBorder(0, 15, 0, 0)));

        updateTable();
        setTitle("Patients Record - table");
        updateTable();

        //table columns
        maintable.getColumnModel().getColumn(0).setPreferredWidth(880);
        maintable.getColumnModel().getColumn(1).setPreferredWidth(800);
        maintable.getColumnModel().getColumn(2).setPreferredWidth(880);
        maintable.getColumnModel().getColumn(3).setPreferredWidth(900);
        maintable.getColumnModel().getColumn(4).setPreferredWidth(400);
        maintable.getColumnModel().getColumn(5).setPreferredWidth(680);
        maintable.getColumnModel().getColumn(6).setPreferredWidth(880);
        maintable.getColumnModel().getColumn(7).setPreferredWidth(920);
        maintable.getColumnModel().getColumn(8).setPreferredWidth(880);
        maintable.getColumnModel().getColumn(9).setPreferredWidth(500);
        maintable.getColumnModel().getColumn(10).setPreferredWidth(880);
        maintable.getColumnModel().getColumn(11).setPreferredWidth(920);
        //cell not editable     
        maintable.setDefaultEditor(Object.class, null);
        //header design
        maintable.getTableHeader().setDefaultRenderer(new HeaderColor());
        maintable.setRowHeight(32);
    }

    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            //table design
            setFont(new Font("Poppins", Font.PLAIN, 12));
            setBackground(new java.awt.Color(153, 255, 204));
            return this;
        }
    }

    public void updateTable() {
        try {
            String sql = "select studentid as 'STUDENT ID', firstname as 'FIRSTNAME', lastname as 'LASTNAME', middlename as 'MIDDLENAME', age as 'AGE', gender as 'GENDER', date as 'DATE', contactnumber as 'CONTACT NO.', "
                    + "time as 'TIME ADMIT', bednumber as 'BED NO.', sick as 'SICK', guardiannumber as 'GUARDIAN CONTACT NO.' from clinicmanagement.patients";
>>>>>>> Stashed changes
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
        jScrollPane2 = new javax.swing.JScrollPane();
        maintable = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("patientInformation");
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 46, 54));
        jPanel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/refresh.png"))); // NOI18N
        jButton4.setText("Refresh");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 100, 30));

<<<<<<< Updated upstream
=======
        search.setBackground(new java.awt.Color(10, 46, 54));
        search.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
>>>>>>> Stashed changes
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

        maintable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        maintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Last Name", "First Name", "Middle Name", "Gender", "Year and Course Section", "Age", "Contact No.", "Date", "Time Admit", "Guardian Contact Number", "Bed Number"
            }
        ));
        maintable.setPreferredSize(new java.awt.Dimension(375, 128));
        maintable.setRowHeight(32);
        jScrollPane2.setViewportView(maintable);
        if (maintable.getColumnModel().getColumnCount() > 0) {
            maintable.getColumnModel().getColumn(0).setResizable(false);
            maintable.getColumnModel().getColumn(0).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(1).setResizable(false);
            maintable.getColumnModel().getColumn(1).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(2).setResizable(false);
            maintable.getColumnModel().getColumn(2).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(3).setResizable(false);
            maintable.getColumnModel().getColumn(3).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(4).setResizable(false);
            maintable.getColumnModel().getColumn(4).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(5).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(6).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(7).setResizable(false);
            maintable.getColumnModel().getColumn(7).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(8).setResizable(false);
            maintable.getColumnModel().getColumn(8).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(9).setPreferredWidth(150);
            maintable.getColumnModel().getColumn(10).setResizable(false);
            maintable.getColumnModel().getColumn(10).setPreferredWidth(200);
            maintable.getColumnModel().getColumn(11).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 980, 540));

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
        jButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/addpatients.png"))); // NOI18N
        jButton2.setText("Add new patients");
<<<<<<< Updated upstream
=======
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
>>>>>>> Stashed changes
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 50));

        mainView.setBackground(new java.awt.Color(255, 255, 255));
        mainView.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        mainView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/viewinfo.png"))); // NOI18N
        mainView.setText("View information");
<<<<<<< Updated upstream
=======
        mainView.setBorder(null);
        mainView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainViewMouseExited(evt);
            }
        });
>>>>>>> Stashed changes
        mainView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainViewActionPerformed(evt);
            }
        });
        jPanel1.add(mainView, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 230, 50));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/update.png"))); // NOI18N
        jButton9.setText("Update Patient");
<<<<<<< Updated upstream
=======
        jButton9.setBorder(null);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
>>>>>>> Stashed changes
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/printer.png"))); // NOI18N
        jButton3.setText("Print");
<<<<<<< Updated upstream
=======
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
>>>>>>> Stashed changes
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 230, 50));

        mainDelete.setBackground(new java.awt.Color(255, 255, 255));
        mainDelete.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        mainDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/delete.png"))); // NOI18N
        mainDelete.setText("Delete");
<<<<<<< Updated upstream
=======
        mainDelete.setBorder(null);
        mainDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainDeleteMouseExited(evt);
            }
        });
>>>>>>> Stashed changes
        mainDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(mainDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 230, 50));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/back.png"))); // NOI18N
        jButton6.setText("Back");
<<<<<<< Updated upstream
=======
        jButton6.setBorder(null);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
>>>>>>> Stashed changes
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 230, 50));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/search.png"))); // NOI18N
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, -1, 30));

<<<<<<< Updated upstream
=======
        maintable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
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
        maintable.setRowHeight(32);
        maintable.setSelectionBackground(new java.awt.Color(87, 191, 109));
        maintable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        maintable.setShowGrid(true);
        maintable.getTableHeader().setResizingAllowed(false);
        maintable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(maintable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 980, 500));

>>>>>>> Stashed changes
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainViewActionPerformed
        try {
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
        new addnewPatients().setVisible(true);
=======
        addnewPatients c = new addnewPatients();
        c.setVisible(true);
        setVisible(false);

>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        updateTable();
=======
        DefaultTableModel table = (DefaultTableModel) maintable.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        maintable.setRowSorter(tr);

>>>>>>> Stashed changes
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
<<<<<<< Updated upstream


=======
>>>>>>> Stashed changes
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
        tr.setRowFilter(RowFilter.regexFilter("(?i)" +sea));
    }//GEN-LAST:event_searchKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
<<<<<<< Updated upstream
        logout c = new logout();
        c.setVisible(true);
        setVisible(false);


    }//GEN-LAST:event_jButton7ActionPerformed
=======
        this.toBack();
        logout l = new logout();
        l.setVisible(true);
        l.toFront();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed

    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setFont(new Font("Poppins", Font.PLAIN, 20));
        onClick(jButton2);


    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        onLeaveClick(jButton2);
        jButton2.setFont(new Font("Poppins", Font.PLAIN, 14));
    }//GEN-LAST:event_jButton2MouseExited

    private void mainViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainViewMouseEntered
        mainView.setFont(new Font("Poppins", Font.PLAIN, 20));
        onClick(mainView);
    }//GEN-LAST:event_mainViewMouseEntered

    private void mainViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainViewMouseExited
        onLeaveClick(mainView);
        mainView.setFont(new Font("Poppins", Font.PLAIN, 14));
    }//GEN-LAST:event_mainViewMouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        jButton9.setFont(new Font("Poppins", Font.PLAIN, 20));
        onClick(jButton9);
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        onLeaveClick(jButton9);
        jButton9.setFont(new Font("Poppins", Font.PLAIN, 14));
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setFont(new Font("Poppins", Font.PLAIN, 20));
        onClick(jButton3);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        onLeaveClick(jButton3);
        jButton3.setFont(new Font("Poppins", Font.PLAIN, 14));
    }//GEN-LAST:event_jButton3MouseExited

    private void mainDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainDeleteMouseEntered
        mainDelete.setFont(new Font("Poppins", Font.PLAIN, 20));
        onClick(mainDelete);
    }//GEN-LAST:event_mainDeleteMouseEntered

    private void mainDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainDeleteMouseExited
        onLeaveClick(mainDelete);
        mainDelete.setFont(new Font("Poppins", Font.PLAIN, 14));
    }//GEN-LAST:event_mainDeleteMouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setFont(new Font("Poppins", Font.PLAIN, 20));
        onClick(jButton6);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        onLeaveClick(jButton6);
        jButton6.setFont(new Font("Poppins", Font.PLAIN, 14));
    }//GEN-LAST:event_jButton6MouseExited
    private void onClick(JButton button) {
        button.setBackground(new Color(87, 191, 109));
    }

    private void onLeaveClick(JButton button) {
        button.setBackground(Color.white);
    }
>>>>>>> Stashed changes

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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainDelete;
    private javax.swing.JButton mainView;
    private javax.swing.JTable maintable;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
