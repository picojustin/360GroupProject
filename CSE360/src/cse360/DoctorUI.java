/*
/ * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse360;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson
 */
public class DoctorUI extends javax.swing.JFrame {

    int currentACount = 0;
    /**
     * Creates new form NewJFrame1
     */
    public DoctorUI() {
        initComponents();
        try{
            int mCount = 0;
            String recieve = User.getUsername();
            String sql = "SELECT Recieve FROM Messages";
            Connection conn = sqliteConnection.dbConnector();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String check = rs.getString("Recieve");
                if(check.equals(recieve))
                {
                    mCount++;
                }
            }
            newMessagesInfoD.setText("There are "+mCount+" messages");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            String un = User.getUsername();
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
                if(un.equals(to))
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
        databaseD = new javax.swing.JButton();
        messagesPanelD = new javax.swing.JPanel();
        messagesButtonD = new javax.swing.JButton();
        newMessagesInfoD = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        logOutD = new javax.swing.JButton();
        viewPatientsD = new javax.swing.JToggleButton();
        recentAlertsLabel = new javax.swing.JLabel();
        recentAlerts = new javax.swing.JScrollPane();
        alertTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        databaseD.setText("Database");
        databaseD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseDActionPerformed(evt);
            }
        });

        messagesPanelD.setBackground(new java.awt.Color(255, 255, 204));

        messagesButtonD.setText("Messages");
        messagesButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagesButtonDActionPerformed(evt);
            }
        });

        newMessagesInfoD.setText("There are 0 messages");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout messagesPanelDLayout = new javax.swing.GroupLayout(messagesPanelD);
        messagesPanelD.setLayout(messagesPanelDLayout);
        messagesPanelDLayout.setHorizontalGroup(
            messagesPanelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagesPanelDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(messagesPanelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messagesButtonD)
                    .addComponent(refreshButton))
                .addGap(18, 18, 18)
                .addComponent(newMessagesInfoD)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        messagesPanelDLayout.setVerticalGroup(
            messagesPanelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagesPanelDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messagesButtonD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addContainerGap())
            .addGroup(messagesPanelDLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(newMessagesInfoD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logOutD.setText("Log Out");

        viewPatientsD.setText("View Patients");

        recentAlertsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        recentAlertsLabel.setText("Recent Alerts");

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
        alertTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(databaseD))
                            .addComponent(messagesPanelD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutD)
                        .addContainerGap())
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recentAlertsLabel)
                            .addComponent(viewPatientsD)
                            .addComponent(recentAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(86, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(databaseD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logOutD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(messagesPanelD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPatientsD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recentAlertsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recentAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
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

    private void messagesButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesButtonDActionPerformed
        new MessagesUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_messagesButtonDActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        try{
            int mCount = 0;
            String recieve = User.getUsername();
            String sql = "SELECT Recieve FROM Messages";
            Connection conn = sqliteConnection.dbConnector();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String check = rs.getString("Recieve");
                if(check.equals(recieve))
                {
                    mCount++;
                }
            }
            conn.close();
            newMessagesInfoD.setText("There are "+mCount+" messages");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_refreshButtonActionPerformed

    private void databaseDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseDActionPerformed
        new DoctorDatabseUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_databaseDActionPerformed
    
    /* Event Listener for the messages button. needs some way to track current user
    private void messageActionPerformed(java.awt.event.ActionEvent evt) {
        new MessagesUI().setVisible(true);
        this.setVisible(false);
    }*/
    
    //Event Listener for the logout button
    private void logOutDActionPerformed(java.awt.event.ActionEvent evt) {
    	JOptionPane.showMessageDialog(null, "You have succesfully logged out!");
    	new LogInUI().setVisible(true);
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
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alertTable;
    private javax.swing.JButton databaseD;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton logOutD;
    private javax.swing.JButton messagesButtonD;
    private javax.swing.JPanel messagesPanelD;
    private javax.swing.JLabel newMessagesInfoD;
    private javax.swing.JScrollPane recentAlerts;
    private javax.swing.JLabel recentAlertsLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JToggleButton viewPatientsD;
    // End of variables declaration//GEN-END:variables
}
