/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha Varshney
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem ecoSystem;

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;
        populateAllRequestsTable();
        populateMyRequestsTable();
        testResultjTextArea.setEnabled(true);
    }
    
    public void populateAllRequestsTable() {

        DefaultTableModel dtm = (DefaultTableModel) allWorkRequestJTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest req : organization.getWorkQueue().getWorkRequestList()) {                
            if (req instanceof HospitalWorkRequest) {
                if(req.getStatus().equalsIgnoreCase("Not Assigned")){

                    Object[] row = new Object[4];
                    row[0] = ((HospitalWorkRequest) req).getRequestId();
                    row[1] = req;
                    row[2] = ((HospitalWorkRequest) req).getSender();
                    row[3] = ((HospitalWorkRequest) req).getStatus();

                    dtm.addRow(row);

                }
            }
        }   
    }
 
    public void populateMyRequestsTable(){
         
        DefaultTableModel dtm = (DefaultTableModel) myWorkRequestJTable.getModel();
        dtm.setRowCount(0);
        
        for (WorkRequest req : userAccount.getWorkQueue().getWorkRequestList()) {
            if (req instanceof HospitalWorkRequest) {
                    
                Object[] row = new Object[5];
                row[0] = ((HospitalWorkRequest) req).getRequestId();
                row[1] = req;
                row[2] = ((HospitalWorkRequest) req).getCaseId();
                row[3] = ((HospitalWorkRequest) req).getSender();
                row[4] = ((HospitalWorkRequest) req).getStatus();

                dtm.addRow(row);
                    
            }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        allWorkRequestJTable = new javax.swing.JTable();
        assignRequestjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        myWorkRequestJTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        testResultjTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnSubmitResponse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        allWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request ID", "Message", "Sender", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(allWorkRequestJTable);
        if (allWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            allWorkRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            allWorkRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            allWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            allWorkRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        assignRequestjButton.setText("Assign To Me");
        assignRequestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignRequestjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Requests Allocated To Me for Test:");

        myWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Message", "Case Id", "Sender", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(myWorkRequestJTable);
        if (myWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            myWorkRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        testResultjTextArea.setColumns(20);
        testResultjTextArea.setRows(5);
        jScrollPane1.setViewportView(testResultjTextArea);

        jLabel2.setText("Test Report:");

        btnSubmitResponse.setText("Submit Response");
        btnSubmitResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitResponseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Doctor Work Area Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSubmitResponse)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(assignRequestjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(411, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignRequestjButton)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmitResponse)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignRequestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignRequestjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = allWorkRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            
            HospitalWorkRequest hospitalWorkRequest= (HospitalWorkRequest) allWorkRequestJTable.getValueAt(selectedRow, 1);
            hospitalWorkRequest.setReceiver(userAccount);
            hospitalWorkRequest.setStatus("Assigned");
            userAccount.getWorkQueue().getWorkRequestList().add(hospitalWorkRequest);
            
            populateAllRequestsTable();
            populateMyRequestsTable();
            JOptionPane.showMessageDialog(null, "Request Assigned Successfully!");
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row from the cases table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_assignRequestjButtonActionPerformed

    private void btnSubmitResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitResponseActionPerformed
        // TODO add your handling code here:
        int selectedRow = myWorkRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            
            HospitalWorkRequest req = (HospitalWorkRequest) myWorkRequestJTable.getValueAt(selectedRow, 1);
            if(req.getStatus().equals("Assigned")){
                
                if(!testResultjTextArea.getText().trim().isEmpty()){
                    
                    req.setTestResult(testResultjTextArea.getText().trim());
                    req.setResolveDate(new Date());
                    req.setSender(userAccount);
                    req.setStatus("Completed");
                    
                    testResultjTextArea.setText("");
                    populateAllRequestsTable();
                    populateMyRequestsTable();
                    JOptionPane.showMessageDialog(null, "Response Submitted!");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter the response!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Response already submitted for this test!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from my cases table!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSubmitResponseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allWorkRequestJTable;
    private javax.swing.JButton assignRequestjButton;
    private javax.swing.JButton btnSubmitResponse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable myWorkRequestJTable;
    private javax.swing.JTextArea testResultjTextArea;
    // End of variables declaration//GEN-END:variables
}
