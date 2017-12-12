/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Police.PoliceOfficer;

import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RobberyCaseWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author joshiaditya
 */
public class RobberyCaseInvestigationJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    RobberyCaseWorkRequest request;
    Network network;
    UserAccount userAccount;
    /**
     * Creates new form RobberyCaseInvestigationJPanel
     */
    public RobberyCaseInvestigationJPanel(JPanel userProcessContainer, RobberyCaseWorkRequest request, UserAccount userAccount, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.request = request;
        this.userAccount = userAccount;
        populateData();
    }
    
    public void populateData(){
        
        txtCaseID.setText(String.valueOf(request.getCaseID()));
        txtIncidentType.setText(request.getIncidentType());
        txtSuspectName.setText(request.getSuspectName());
        txtIncidentDate.setText(request.getIncidentOcuredDate().toString());
        txtAmountWorth.setText(request.getValueRobbed());
        txtOfficerComments.setText(request.getOfficerComments());
        txtGangName.setText(request.getGangName());
        
        if(request.isAssociatedWithGang() == true)
            btnGangYes.setSelected(true);
        if(request.isNotAssociatedWithGang() == true)
            btnGangNo.setSelected(true);
        
        if(request.isIsSuspectArmed() == true)
            btnSuspectArmed.setSelected(true);
        if(request.isSuspectNotArmed() == true)
            btnSuspectNotArmed.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suspectArmed = new javax.swing.ButtonGroup();
        btnGroupGang = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCaseID = new javax.swing.JTextField();
        txtIncidentDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSuspectName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSuspectArmed = new javax.swing.JRadioButton();
        btnSuspectNotArmed = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtAmountWorth = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnGangNo = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txtGangName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtOfficerComments = new javax.swing.JTextArea();
        btnGangYes = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtIncidentType = new javax.swing.JTextField();

        jLabel1.setText("Investigation Questionnaire");

        jLabel5.setText("Case ID:");

        txtCaseID.setEnabled(false);

        txtIncidentDate.setEnabled(false);

        jLabel10.setText("Incident Date:");

        jLabel6.setText("Name of Suspect");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Was the suspect armed?");

        suspectArmed.add(btnSuspectArmed);
        btnSuspectArmed.setText("Yes");

        suspectArmed.add(btnSuspectNotArmed);
        btnSuspectNotArmed.setText("No");

        jLabel3.setText("Amount in $ of belongings robbed:");

        jLabel15.setText("Is suspect associated with any group/gang?");

        btnGroupGang.add(btnGangNo);
        btnGangNo.setText("No");

        jLabel16.setText("Name of Group associated if any:");

        jLabel17.setText("Observations/comments of Investaging Officer:");

        txtOfficerComments.setColumns(20);
        txtOfficerComments.setRows(5);
        jScrollPane5.setViewportView(txtOfficerComments);

        btnGroupGang.add(btnGangYes);
        btnGangYes.setText("Yes");

        jLabel4.setText("Incident Type:");

        txtIncidentType.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(btnBack))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGangName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnGangYes)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnGangNo))
                                .addComponent(btnSave)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCaseID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSuspectName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtIncidentDate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSuspectArmed)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSuspectNotArmed))
                                    .addComponent(txtAmountWorth)
                                    .addComponent(txtIncidentType))))))
                .addContainerGap(403, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCaseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIncidentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIncidentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSuspectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnSuspectArmed)
                    .addComponent(btnSuspectNotArmed))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAmountWorth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(btnGangNo)
                    .addComponent(btnGangYes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtGangName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(request.getStatus().equals("Closed")){

            JOptionPane.showMessageDialog(this, "Cannot update a closed case!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            request.setGangName(txtGangName.getText().trim());
            request.setOfficerComments(txtOfficerComments.getText().trim());
            request.setValueRobbed(txtAmountWorth.getText().trim());
            request.setSuspectName(txtSuspectName.getText().trim());
            
            if(btnGangYes.isSelected())
                request.setAssociatedWithGang(true);
            if(btnGangNo.isSelected())
                request.setNotAssociatedWithGang(true);
            
            if(btnSuspectArmed.isSelected())
                request.setIsSuspectArmed(true);
            if(btnSuspectNotArmed.isSelected())
                request.setSuspectNotArmed(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnGangNo;
    private javax.swing.JRadioButton btnGangYes;
    private javax.swing.ButtonGroup btnGroupGang;
    private javax.swing.JButton btnSave;
    private javax.swing.JRadioButton btnSuspectArmed;
    private javax.swing.JRadioButton btnSuspectNotArmed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.ButtonGroup suspectArmed;
    private javax.swing.JTextField txtAmountWorth;
    private javax.swing.JTextField txtCaseID;
    private javax.swing.JTextField txtGangName;
    private javax.swing.JTextField txtIncidentDate;
    private javax.swing.JTextField txtIncidentType;
    private javax.swing.JTextArea txtOfficerComments;
    private javax.swing.JTextField txtSuspectName;
    // End of variables declaration//GEN-END:variables
}
