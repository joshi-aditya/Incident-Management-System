/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.User;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BroadcastWorkRequest;
import Business.WorkQueue.IncidentWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sneha
 */
public class UserAreaWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserAreaWorkJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem ecoSystem;
    private Network network;

    public UserAreaWorkJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecoSystem) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.userAccount = account;
        this.network = network;
        this.ecoSystem = ecoSystem;
        populateTable();
       // populatepoliceStatusTable();
        populateUserIncidents();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblMessage.getModel();
        model.setRowCount(0);

        for (int i = organization.getWorkQueue().getWorkRequestList().size() - 1; i >= 0; i--) {
            if (organization.getWorkQueue().getWorkRequestList().get(i) instanceof BroadcastWorkRequest) {

                BroadcastWorkRequest broadcastWorkRequest = (BroadcastWorkRequest) organization.getWorkQueue().getWorkRequestList().get(i);
                Object[] row = new Object[2];
                row[0] = broadcastWorkRequest.getTimestamp();
                row[1] = broadcastWorkRequest.getMessage();

                model.addRow(row);
            }
        }

        //Timer to refresh table every 60 seconds
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                populateTable();
            }
        },
                60000
        );
    }
/*
    public void populatepoliceStatusTable() {
        DefaultTableModel model = (DefaultTableModel) policestatusTable.getModel();
        model.setRowCount(0);
        for (int i : ecoSystem.getTimingMap().keySet()) {
            for (int j : userAccount.getIncidentList()) {
                if (i == j) {
                    if (ecoSystem.getTimingMap().get(i).size() == 3) {
                        Object[] row = new Object[3];
                        row[0] = ecoSystem.getTimingMap().get(i).get(2);
                        row[1] = ecoSystem.getTimingMap().get(i).get(0);
                        row[2] = ecoSystem.getTimingMap().get(i).get(1);
                        model.addRow(row);
                       // break;
                    }
                }
            }
        }
    */
        /*
        for (int i : ecoSystem.getTimingMap().keySet()) {
            //create har user ka incident directory
            if (incident 
                
                
                present 
            
            
            in user ke incident directory me
            
            
            
                ){
            Arraylist<String> al = ecosytem.gettimingmap().get(i)
                {
                    for (int i = 0; i < al.size() , i++) {
                        1. incidentype al
                        .get(0) or else al[0];
                        2. timetoreach
                        3. police wale ka naam        
                    }
                }
            }
        }
         */
 /*
        //trial
        ArrayList<String> a1 = new ArrayList<>();
        for (int i : ecoSystem.getTimingMap().keySet()) {
            for (int i1 = organization.getWorkQueue().getWorkRequestList().size() - 1; i1 >= 0; i1--) {
                if (organization.getWorkQueue().getWorkRequestList().get(i1) instanceof IncidentWorkRequest) {
                    IncidentWorkRequest incidentWorkRequest = (IncidentWorkRequest) organization.getWorkQueue().getWorkRequestList().get(i);
                    if (this.userAccount.getUserName().equalsIgnoreCase(incidentWorkRequest.getSender().getUserName())) {
                        //a1 = ecoSystem.getTimingMap().get(i);
                        a1 = ecoSystem.getInfoString();
                        for (int j = 0; j < a1.size(); j++) {
                            Object[] row = new Object[2];
                            row[0] = a1.get(0);
                            row[1] = a1.get(1);
                            row[3] = a1.get(3);
                            model.addRow(row);
                        }
                    }

                }
            }
        }
         */
    //}
    
    public void populateUserIncidents(){
        
        DefaultTableModel model = (DefaultTableModel) tblUserReportedInc.getModel();
        model.setRowCount(0);

        for (int i = userAccount.getWorkQueue().getWorkRequestList().size() - 1; i >= 0; i--) {
            if (userAccount.getWorkQueue().getWorkRequestList().get(i) instanceof IncidentWorkRequest) {

                IncidentWorkRequest incidentWorkRequest = (IncidentWorkRequest) organization.getWorkQueue().getWorkRequestList().get(i);
                Object[] row = new Object[4];
                row[0] = incidentWorkRequest;
                row[1] = incidentWorkRequest.getRequestDate();
                row[2] = incidentWorkRequest.getIncidentType();
                row[3] = incidentWorkRequest.getMessage();

                model.addRow(row);
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMessage = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUserReportedInc = new javax.swing.JTable();

        jButton1.setText("Report an incident");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblMessage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMessage);

        jLabel1.setText("Alerts broadcast by Police:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("User Work Area");

        jLabel3.setText("User Reported Incidents");

        tblUserReportedInc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incident ID", "Reported Date", "Incident Type", "Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblUserReportedInc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(530, 530, 530))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ReportAnIncidentJPanel incidentJPanel = new ReportAnIncidentJPanel(userProcessContainer, userAccount, enterprise, network, ecoSystem);
        userProcessContainer.add("ReportAnIncidentJPanel", incidentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMessage;
    private javax.swing.JTable tblUserReportedInc;
    // End of variables declaration//GEN-END:variables
}
