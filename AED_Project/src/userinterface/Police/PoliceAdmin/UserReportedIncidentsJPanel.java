/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Police.PoliceAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.IncidentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sneha
 */
public class UserReportedIncidentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserReportedIncidentsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;

    public UserReportedIncidentsJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        populateTable();
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) ReportedIncidentTable.getModel();
        model.setRowCount(0);
        
        ArrayList<WorkRequest> reqObj = enterprise.getWorkQueue().getWorkRequestList();
        for(int i = enterprise.getWorkQueue().getWorkRequestList().size() - 1 ; i>=0 ; i-- ){
            if(reqObj.get(i) instanceof IncidentWorkRequest){
                
                IncidentWorkRequest incidentWorkRequest = (IncidentWorkRequest) reqObj.get(i);
                Object[] row = new Object[5];
                row[0] = incidentWorkRequest;
                row[1] = incidentWorkRequest.getIncidentType();
                //row[2] = incidentWorkRequest.getSender().getUserName();
                row[2] = incidentWorkRequest.getSender().getFirstName()+" "+incidentWorkRequest.getSender().getLastName();
                row[3] = incidentWorkRequest.getAddress()+" "+ incidentWorkRequest.getZipCode();
                row[4] = incidentWorkRequest.getStatus();

                model.addRow(row);
            }
        }
        
//        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            ArrayList<WorkRequest> reqObj = org.getWorkQueue().getWorkRequestList();
//            for (int i = org.getWorkQueue().getWorkRequestList().size() - 1 ; i>=0 ; i--) {
//                if (reqObj.get(i) instanceof IncidentWorkRequest) {
//
//                    IncidentWorkRequest incidentWorkRequest = (IncidentWorkRequest) reqObj.get(i);
//                    Object[] row = new Object[5];
//                    row[0] = incidentWorkRequest;
//                    row[1] = incidentWorkRequest.getIncidentType();
//                    //row[2] = incidentWorkRequest.getSender().getUserName();
//                    row[2] = incidentWorkRequest.getSender().getFirstName()+" "+incidentWorkRequest.getSender().getLastName();
//                    row[3] = incidentWorkRequest.getAddress()+" "+ incidentWorkRequest.getZipCode();
//                    row[4] = incidentWorkRequest.getStatus();
//
//                    model.addRow(row);
//                }
//            }
//        }
        
        //Timer to refresh table every 5 seconds
        new java.util.Timer().schedule( 
            new java.util.TimerTask() {
                @Override
                public void run() {
                    populateTable();
                }
            }, 
            5000000
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ReportedIncidentTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnViewIncident = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        ReportedIncidentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incident ID", "Incident Type", "Reported By", "Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ReportedIncidentTable);
        if (ReportedIncidentTable.getColumnModel().getColumnCount() > 0) {
            ReportedIncidentTable.getColumnModel().getColumn(0).setResizable(false);
            ReportedIncidentTable.getColumnModel().getColumn(1).setResizable(false);
            ReportedIncidentTable.getColumnModel().getColumn(2).setResizable(false);
            ReportedIncidentTable.getColumnModel().getColumn(3).setResizable(false);
            ReportedIncidentTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setText("Authenticate an incident");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnViewIncident.setText("View Incident Details");
        btnViewIncident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewIncidentActionPerformed(evt);
            }
        });

        jButton3.setText("Close the case");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewIncident, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnViewIncident)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = ReportedIncidentTable.getSelectedRow();
        if (selectedRow >= 0) {
            IncidentWorkRequest request = (IncidentWorkRequest) ReportedIncidentTable.getValueAt(selectedRow, 0);
            request.setStatus("Resolved");
            populateTable();

        } else {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = ReportedIncidentTable.getSelectedRow();
        if (selectedRow >= 0) {
            IncidentWorkRequest request = (IncidentWorkRequest) ReportedIncidentTable.getValueAt(selectedRow, 0);
            request.setStatus("Authenticated");
            ecoSystem.getTimingMap().put(request.getIncidentId(), new ArrayList<>());
            ecoSystem.getInfoString().clear();
            ecoSystem.getInfoString().add(request.getIncidentType().getValue());
            populateTable();

        } else {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewIncidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewIncidentActionPerformed
        // TODO add your handling code here:
        int selectedRow = ReportedIncidentTable.getSelectedRow();
        if(selectedRow >= 0){
            IncidentWorkRequest request = (IncidentWorkRequest) ReportedIncidentTable.getValueAt(selectedRow, 0);
            ViewIncidentDetailsJPanel panel = new ViewIncidentDetailsJPanel(userProcessContainer, request,enterprise);
            userProcessContainer.add("ViewIncidentDetailsJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an incident from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnViewIncidentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReportedIncidentTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnViewIncident;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
