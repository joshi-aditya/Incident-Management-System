/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Police.PoliceAdmin;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CaseWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderRequest;
import java.awt.CardLayout;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Neha Varshney
 */
public class ManageCasesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCasesJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public ManageCasesJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateTable();
        //populatePoliceTable();
    }

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblCases.getModel();
        dtm.setRowCount(0);

        for (WorkRequest req : enterprise.getWorkQueue().getWorkRequestList()) {
            if (req instanceof CaseWorkRequest) {
                if (req.getStatus().equals("Open")) {

                    Object[] row = new Object[5];
                    row[0] = req;
                    row[1] = ((CaseWorkRequest) req).getIncidentType();
                    row[2] = ((CaseWorkRequest) req).getIncidentOcuredDate();
                    row[3] = ((CaseWorkRequest) req).getZipCode();
                    row[4] = req.getStatus();

                    dtm.addRow(row);
                }
            }
        }
    }
    /*
    public void populatePoliceTable() {

        DefaultTableModel dtm = (DefaultTableModel) policeOfficerjTable.getModel();
        dtm.setRowCount(0);

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {

            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[3];
                row[0] = ua;
                row[1] = ua.getEmployee().getName();
                row[2] = ua.getEmployee().getLocation();

                dtm.addRow(row);
            }

        }
    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCases = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nearestPolicejButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        policeOfficerjTable = new javax.swing.JTable();
        assignjButton = new javax.swing.JButton();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        tblCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case ID", "Incident Type", "Date", "Area Zipcode", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCases);
        if (tblCases.getColumnModel().getColumnCount() > 0) {
            tblCases.getColumnModel().getColumn(0).setResizable(false);
            tblCases.getColumnModel().getColumn(1).setResizable(false);
            tblCases.getColumnModel().getColumn(2).setResizable(false);
            tblCases.getColumnModel().getColumn(3).setResizable(false);
            tblCases.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manage Cases");

        jLabel3.setText("Nearest Police Officers: ------ to be done ");

        nearestPolicejButton.setText("Find Nearest Ofiicers");
        nearestPolicejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nearestPolicejButtonActionPerformed(evt);
            }
        });

        policeOfficerjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Officer Username", "Officer Name", "Zip Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(policeOfficerjTable);
        if (policeOfficerjTable.getColumnModel().getColumnCount() > 0) {
            policeOfficerjTable.getColumnModel().getColumn(0).setResizable(false);
            policeOfficerjTable.getColumnModel().getColumn(1).setResizable(false);
            policeOfficerjTable.getColumnModel().getColumn(2).setResizable(false);
        }

        assignjButton.setText("Assign to selected Officer");
        assignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(nearestPolicejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(assignjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nearestPolicejButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButtonActionPerformed
        // TODO add your handling code here:

        int officerSelectedRow;
        int caseSelectedRow;
        caseSelectedRow = tblCases.getSelectedRow();
        officerSelectedRow = policeOfficerjTable.getSelectedRow();

        if (caseSelectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the cases table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (officerSelectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the officers table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {

            CaseWorkRequest caseWorkReq = (CaseWorkRequest) tblCases.getValueAt(caseSelectedRow, 0);
            UserAccount user = (UserAccount) policeOfficerjTable.getValueAt(officerSelectedRow, 0);

            CaseWorkRequest newCase = new CaseWorkRequest();
            newCase.setAddress(caseWorkReq.getAddress());
            newCase.setCaseID(caseWorkReq.getCaseID());
            newCase.setIncidentOcuredDate(caseWorkReq.getIncidentOcuredDate());
            newCase.setIncidentReportedBy(caseWorkReq.getIncidentReportedBy());
            newCase.setIncidentType(caseWorkReq.getIncidentType());
            newCase.setInitialObservation(caseWorkReq.getInitialObservation());
            newCase.setMessage(caseWorkReq.getMessage());
            newCase.setReceiver(caseWorkReq.getReceiver());
            newCase.setRequestDate(caseWorkReq.getRequestDate());
            newCase.setResolveDate(caseWorkReq.getResolveDate());
            newCase.setSender(caseWorkReq.getSender());
            newCase.setStatus("Assigned");
            newCase.setSuspectName(caseWorkReq.getSuspectName());
            newCase.setZipCode(caseWorkReq.getZipCode());

            caseWorkReq.setStatus("Assigned");

            user.getWorkQueue().getWorkRequestList().add(newCase);

            JOptionPane.showMessageDialog(null, "Case Assigned Successfully!");
            populateTable();
        }

    }//GEN-LAST:event_assignjButtonActionPerformed

    private void nearestPolicejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nearestPolicejButtonActionPerformed
        // TODO add your handling code here:
        int caseSelectedRow;
        caseSelectedRow = tblCases.getSelectedRow();
        CaseWorkRequest c = (CaseWorkRequest) tblCases.getValueAt(caseSelectedRow, 0);
        ArrayList<Double> distanceArray = new ArrayList<Double>();
        Map<String, Double> distanceMatrixPerStation = new HashMap<String, Double>();

        try {
            String officerAddress;
            officerAddress = "";
            //Get the address of the case
            String caseAddress = c.getAddress() + ", " + (c.getZipCode());
            Geocoder geocoder = new Geocoder();
            GeocoderRequest geocoderRequest = new GeocoderRequestBuilder().setAddress(caseAddress).setLanguage("en").getGeocoderRequest();
            GeocodeResponse geocoderResponse = geocoder.geocode(geocoderRequest);
            JSONObject json = new JSONObject(geocoderResponse);
            JSONArray result = json.getJSONArray("results");
            JSONObject result1 = result.getJSONObject(0);
            JSONObject geometry = result1.getJSONObject("geometry");
            JSONObject locat = geometry.getJSONObject("location");
            double lat1 = locat.getDouble("lat");
            double lng1 = locat.getDouble("lng");

            //PoliceOrganization po1 = new PoliceOrganization();
            //Get the address of nearest police officer
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof PoliceOrganization) {
                    //for (Employee emp : organization.getEmployeeDirectory().getEmployeeList()) {
                    officerAddress = String.valueOf(((PoliceOrganization) organization).getAddress()) + ", " + String.valueOf(((PoliceOrganization) organization).getZipcode());
                    Geocoder geocoder1 = new Geocoder();
                    GeocoderRequest geocoderRequest1 = new GeocoderRequestBuilder().setAddress(officerAddress).setLanguage("en").getGeocoderRequest();
                    GeocodeResponse geocoderResponse1 = geocoder1.geocode(geocoderRequest1);
                    JSONObject json1 = new JSONObject(geocoderResponse1);
                    JSONArray result2 = json1.getJSONArray("results");
                    JSONObject result3 = result2.getJSONObject(0);
                    JSONObject geometry1 = result3.getJSONObject("geometry");
                    JSONObject locat1 = geometry1.getJSONObject("location");
                    double lat2 = locat1.getDouble("lat");
                    double lng2 = locat1.getDouble("lng");

                    //find the distance between them
                    URL u;
                    InputStream is = null;
                    DataInputStream dis;
                    String s;
                    String s1 = "";

                    try {
                        String ns;
                        ns = "http://maps.googleapis.com/maps/api/distancematrix/json?origins=" + lat2 + "," + lng2 + "&destinations=" + lat1 + "," + lng1 + "&mode=driving&language=en-EN&sensor=false";
                        u = new URL(ns);
                        is = u.openStream();
                        dis = new DataInputStream(new BufferedInputStream(is));

                        while ((s = dis.readLine()) != null) {
                            //System.out.println(s);  //----------prints out entire JSON
                            s1 = s1 + s;
                        }

                        JSONObject json3 = new JSONObject(s1);
                        JSONArray result5 = json3.getJSONArray("rows");
                        JSONObject result6 = result5.getJSONObject(0);
                        JSONArray geometry5 = result6.getJSONArray("elements");
                        JSONObject geometry6 = geometry5.getJSONObject(0);
                        JSONObject locat6 = geometry6.getJSONObject("distance");
                        String distance = locat6.getString("text");
                        String[] sr = distance.split(" ");
                        double distance1 = Double.parseDouble(sr[0]);
                        JSONObject locat7 = geometry6.getJSONObject("duration");
                        String timetoreach = locat7.getString("text");
                        System.out.println(distance);
                        System.out.println(timetoreach);
                        //distanceArray.add(distance1);
                        distanceMatrixPerStation.put(((PoliceOrganization) organization).getName(), distance1);

                    } catch (MalformedURLException mue) {

                        System.out.println("Ouch - a MalformedURLException happened.");
                        //mue.printStackTrace();
                        //System.exit(1);

                    } catch (IOException ioe) {

                        System.out.println("Oops- an IOException happened.");
                        //ioe.printStackTrace();
                        //System.exit(1);

                    } finally {
                        try {
                            is.close();
                        } catch (IOException ioe) {
                            // just going to ignore this one
                        }
                    }
                }
            }

            for (Double d : distanceMatrixPerStation.values()) {
                distanceArray.add(d);
            }
            Double minDistance = Collections.min(distanceArray);
            String neareastOrgName = null;
            for (String s : distanceMatrixPerStation.keySet()) {
                if (distanceMatrixPerStation.get(s).equals(minDistance)) {
                    neareastOrgName = s;
                    break;
                }
            }

            DefaultTableModel dtm = (DefaultTableModel) policeOfficerjTable.getModel();
            dtm.setRowCount(0);
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof PoliceOrganization) {
                    if (((PoliceOrganization) o).getName().equals(neareastOrgName)) {
                        for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                            Object[] row = new Object[3];
                            row[0] = ua;
                            row[1] = ua.getEmployee().getName();
                            row[2] = ua.getEmployee().getLocation();

                            dtm.addRow(row);
                        }
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter the correct details");
        }
    }//GEN-LAST:event_nearestPolicejButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignjButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nearestPolicejButton;
    private javax.swing.JTable policeOfficerjTable;
    private javax.swing.JTable tblCases;
    // End of variables declaration//GEN-END:variables
}
