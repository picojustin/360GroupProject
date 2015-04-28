/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse360;
import java.sql.*;

import net.proteanit.sql.DbUtils;
import cse360.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson
 */
public class DoctorDatabseUI extends javax.swing.JFrame {

    int pCount = 0;
    int currentACount = 0;
    
    /**
     * Creates new form DoctorDatabseUI
     */
    public DoctorDatabseUI() {
        initComponents();
        
        try{
            String un = User.getUsername();
            String sql = "SELECT * FROM UserData";
            Connection conn = sqliteConnection.dbConnector();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String fname = rs.getString("firstname");
                String lname = rs.getString("lastname");
                String uname = rs.getString("username");
                String to = rs.getString("doctor");
                if(un.equals(to))
                {
                    jTable2.setValueAt(fname + " " + lname, currentACount, 0);
                    jTable2.setValueAt(uname, currentACount, 1);
                    
                    currentACount++;
                }
            }
            while(currentACount < 30)
            {
                jTable2.setValueAt("", currentACount, 0);
                
                currentACount++;
            }
            currentACount = 0;
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        historyLabel = new javax.swing.JLabel();
        backButtonDD = new javax.swing.JButton();
        currentPatientPane = new javax.swing.JPanel();
        currentPatientLabel = new javax.swing.JLabel();
        patientListTable = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        listLabel = new javax.swing.JLabel();
        recentAlerts = new javax.swing.JScrollPane();
        alertTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        historyLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        historyLabel.setText("Patient History");

        backButtonDD.setText("<< Back");
        backButtonDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonDDActionPerformed(evt);
            }
        });

        currentPatientPane.setBackground(new java.awt.Color(255, 255, 204));

        currentPatientLabel.setText("Currently Viewing: None");

        javax.swing.GroupLayout currentPatientPaneLayout = new javax.swing.GroupLayout(currentPatientPane);
        currentPatientPane.setLayout(currentPatientPaneLayout);
        currentPatientPaneLayout.setHorizontalGroup(
            currentPatientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentPatientPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentPatientLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        currentPatientPaneLayout.setVerticalGroup(
            currentPatientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentPatientPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentPatientLabel)
                .addContainerGap())
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        patientListTable.setViewportView(jTable2);

        listLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listLabel.setText("Patient List");

        alertTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Pain", "Tiredness", "Nausea", "Depression", "Anxiety", "Drowsiness", "Appetite", "Wellbeing", "Breath"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        alertTable.setColumnSelectionAllowed(true);
        recentAlerts.setViewportView(alertTable);
        alertTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(backButtonDD)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientListTable, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(historyLabel)
                                .addGap(0, 530, Short.MAX_VALUE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(recentAlerts, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                                    .addComponent(currentPatientPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButtonDD)
                .addGap(50, 50, 50)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listLabel)
                    .addComponent(historyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(currentPatientPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recentAlerts))
                    .addComponent(patientListTable, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonDDActionPerformed
        new DoctorUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonDDActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
            String pName = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 0);
            String uName = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 1);
            if(pName == null)
            {
                return;
            }
            else
            {
                
                String sql = "SELECT * FROM SymptomRatings";
                Connection conn = sqliteConnection.dbConnector();
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while(rs.next())
                {
                    String name = rs.getString("name");
                    String pain = rs.getString("painlevel");
                    int tired = rs.getInt("tiredlevel");
                    int nausea = rs.getInt("nausealevel");
                    int depression = rs.getInt("depressionlevel");
                    int anxiety = rs.getInt("anxietylevel");
                    int drowsiness = rs.getInt("drowsinesslevel");
                    int appetite = rs.getInt("appetitelevel");
                    int wellbeing = rs.getInt("wellbeinglevel");
                    int breath = rs.getInt("breathlevel");
                    String to = rs.getString("doctor");
                    String pUN = rs.getString("pusername");
                    if(to.equals(User.getUsername()) && pUN.equals(uName) && name.equals(pName))
                    {
                        alertTable.setValueAt(name, currentACount, 0);
                        alertTable.setValueAt(pain, currentACount, 1);
                        alertTable.setValueAt(tired, currentACount, 2);
                        alertTable.setValueAt(nausea, currentACount, 3);
                        alertTable.setValueAt(depression, currentACount, 4);
                        alertTable.setValueAt(anxiety, currentACount, 5);
                        alertTable.setValueAt(drowsiness, currentACount, 6);
                        alertTable.setValueAt(appetite, currentACount, 7);
                        alertTable.setValueAt(wellbeing, currentACount, 8);
                        alertTable.setValueAt(breath, currentACount, 9);
                    
                    currentACount++;
                    }
                }
                while(currentACount < 30)
            {
                alertTable.setValueAt("", currentACount, 0);
                alertTable.setValueAt(null, currentACount, 1);
                alertTable.setValueAt(null, currentACount, 2);
                alertTable.setValueAt(null, currentACount, 3);
                alertTable.setValueAt(null, currentACount, 4);
                alertTable.setValueAt(null, currentACount, 5);
                alertTable.setValueAt(null, currentACount, 6);
                alertTable.setValueAt(null, currentACount, 7);
                alertTable.setValueAt(null, currentACount, 8);
                alertTable.setValueAt(null, currentACount, 9);
                
                currentACount++;
            }
            currentACount = 0;
            currentPatientLabel.setText("Currently Viewing: " + pName);
            conn.close();
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable2MouseClicked
    
    // Event Listener for the back button
    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        new DoctorUI().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(DoctorDatabseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDatabseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDatabseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDatabseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDatabseUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alertTable;
    private javax.swing.JButton backButtonDD;
    private javax.swing.JLabel currentPatientLabel;
    private javax.swing.JPanel currentPatientPane;
    private javax.swing.JLabel historyLabel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel listLabel;
    private javax.swing.JScrollPane patientListTable;
    private javax.swing.JScrollPane recentAlerts;
    // End of variables declaration//GEN-END:variables
}
