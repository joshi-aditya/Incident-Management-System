/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Ambulance;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AmbulanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha Varshney
 */
public class AmbulanceStaffWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceStaffWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem ecoSystem;
    
   
    

    public AmbulanceStaffWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;
        
        populateTable();
        
    }
        
        
    
    

    
    
    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) ambulanceRquestsjTable.getModel();
        dtm.setRowCount(0);
        
        
        for(WorkRequest req : enterprise.getWorkQueue().getWorkRequestList()){
            
            if( req instanceof AmbulanceWorkRequest){
                
                AmbulanceWorkRequest ambulanceRequest = (AmbulanceWorkRequest)req;
                Object[] row =new Object[7];
                row[0] = ambulanceRequest;
                row[1] = ambulanceRequest.getIncidentType();
                row[2] = ambulanceRequest.getAddress();
                row[3] = ambulanceRequest.getZipCode();
                row[4] = ambulanceRequest.getStatus();
                row[5] = ambulanceRequest.getMessage();
                row[6] = ambulanceRequest.getIncidentOcuredDate();
                
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ambulanceRquestsjTable = new javax.swing.JTable();
        sendAmbulancejButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        ambulanceRquestsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case ID", "Incident Type", "Address", "ZipCode", "Status", "Message", " Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ambulanceRquestsjTable);
        if (ambulanceRquestsjTable.getColumnModel().getColumnCount() > 0) {
            ambulanceRquestsjTable.getColumnModel().getColumn(0).setResizable(false);
            ambulanceRquestsjTable.getColumnModel().getColumn(1).setResizable(false);
            ambulanceRquestsjTable.getColumnModel().getColumn(2).setResizable(false);
            ambulanceRquestsjTable.getColumnModel().getColumn(3).setResizable(false);
            ambulanceRquestsjTable.getColumnModel().getColumn(4).setResizable(false);
            ambulanceRquestsjTable.getColumnModel().getColumn(5).setResizable(false);
            ambulanceRquestsjTable.getColumnModel().getColumn(6).setResizable(false);
        }

        sendAmbulancejButton.setText("Send Ambulance");
        sendAmbulancejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAmbulancejButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ambulance Staff Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(sendAmbulancejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(sendAmbulancejButton)
                .addContainerGap(253, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendAmbulancejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendAmbulancejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow= ambulanceRquestsjTable.getSelectedRow();
        
         if (selectedRow >= 0) {
             
              
             AmbulanceWorkRequest request = (AmbulanceWorkRequest) ambulanceRquestsjTable.getValueAt(selectedRow, 0);
             request.setStatus("Departed");
             populateTable();
             JOptionPane.showMessageDialog(null, "Ambulance sent");
           
        } 
         
         else
         {
            JOptionPane.showMessageDialog(null, "Please select a row from the cases table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return; 
         }
        
        
        
        
        
        
    }//GEN-LAST:event_sendAmbulancejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ambulanceRquestsjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendAmbulancejButton;
    // End of variables declaration//GEN-END:variables
}
