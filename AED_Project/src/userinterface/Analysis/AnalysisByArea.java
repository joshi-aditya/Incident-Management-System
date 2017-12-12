/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Analysis;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CaseWorkRequest;
import Business.WorkQueue.GunViolenceCaseWorkRequest;
import Business.WorkQueue.RobberyCaseWorkRequest;
import Business.WorkQueue.SubstanceAbuseCaseWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.awt.Graphics2D;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sneha
 */
public class AnalysisByArea extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisByArea
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;

    public AnalysisByArea(JPanel userProcessContainer, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;

        populateTable();

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) areaTable.getModel();
        model.setRowCount(0);
        int incidentCount = 0;
        ArrayList<String> zipcodes = new ArrayList<>();
        Set<String> hs = new HashSet<>();
        Map<String, ArrayList<String>> crimeCountMap = new HashMap<String, ArrayList<String>>();
        ArrayList<String> incidentTypes = new ArrayList<>();

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                for (WorkRequest req : ua.getWorkQueue().getWorkRequestList()) {
                    // if ((req instanceof GunViolenceCaseWorkRequest)
                    //       || (req instanceof SubstanceAbuseCaseWorkRequest)
                    //     || (req instanceof RobberyCaseWorkRequest)) {
                    String zip = ((CaseWorkRequest) req).getZipCode();
                    zipcodes.add(zip);

                }
            }
        }
        hs.addAll(zipcodes);
        zipcodes.clear();
        zipcodes.addAll(hs);

        String zip1 = null;
        int gunCount;
        int substanceCount;
        int robberyCount;
        for (int hashvalue=0;hashvalue<zipcodes.size();hashvalue++) {
            gunCount = 0;
            substanceCount = 0;
            robberyCount = 0;
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    for (WorkRequest req : ua.getWorkQueue().getWorkRequestList()) {
                        incidentTypes.clear();
                        zip1 = ((CaseWorkRequest) req).getZipCode();
                        if (zipcodes.get(hashvalue).equals(zip1)) {
                            if (req instanceof GunViolenceCaseWorkRequest) {
                                gunCount++;
                            } else if (req instanceof RobberyCaseWorkRequest) {
                                robberyCount++;
                            } else if (req instanceof SubstanceAbuseCaseWorkRequest) {
                                substanceCount++;
                            }
                        }
                    }
                }
            }
            incidentTypes.add(String.valueOf(gunCount));
            incidentTypes.add(String.valueOf(robberyCount));
            incidentTypes.add(String.valueOf(substanceCount));
            crimeCountMap.put(zipcodes.get(hashvalue), incidentTypes);
        }

        for (String s : crimeCountMap.keySet()) {
            Object[] row = new Object[3];
            for (int i = 0; i < crimeCountMap.get(s).size(); i++) {
                row[0] = s;
                if (i == 0) {
                    row[1] = "GUN VIOLENCE";
                } else if (i == 1) {
                    row[1] = "ROBBERY EVENT";
                } else if (i == 2) {
                    row[1] = "SUBSTANCE ABUSE";
                }
                row[2] = crimeCountMap.get(s).get(i);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        areaTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        areaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Zipcode", "Incident Type", "Crime Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(areaTable);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create a PDF report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(87, 87, 87)
                        .addComponent(jButton2)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Document document = new Document();
        boolean shapes = true;
            try {
                PdfWriter writer;
                if (shapes) {
                    writer = PdfWriter.getInstance(document,
                            new FileOutputStream("IncidentReport.pdf"));
                } else {
                    writer = PdfWriter.getInstance(document,
                            new FileOutputStream("IncidentReport.pdf"));
                }
                document.open();
                PdfContentByte cb = writer.getDirectContent();
                PdfTemplate tp = cb.createTemplate(500, 500);
                Graphics2D g2;
                if (shapes) {
                    g2 = tp.createGraphicsShapes(500, 500);
                } else {
                    g2 = tp.createGraphics(500, 500);
                }
               // shapes=true;
                areaTable.print(g2);
                g2.dispose();
                cb.addTemplate(tp, 30, 300);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            document.close();
            JOptionPane.showMessageDialog(null, "Report generated succesfully");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable areaTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
