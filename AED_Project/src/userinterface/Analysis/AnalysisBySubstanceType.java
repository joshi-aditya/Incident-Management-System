/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Analysis;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GunViolenceCaseWorkRequest;
import Business.WorkQueue.SubstanceAbuseCaseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Sneha
 */
public class AnalysisBySubstanceType extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisByIncidentType
     */
    private JPanel userProcessContainer;
    private Network network;

    public AnalysisBySubstanceType(JPanel userProcessContainer, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        generatePiechartAnalysis();
    }

    public void generatePiechartAnalysis() {
        int mariCount = 0;
        int hashishCount = 0;
        int heroinCount = 0;
        int opiumCount = 0;
        int cocaineCount = 0;
        int ampCount = 0;
        int ketamineCount = 0;
        int lsdCount = 0;
        int methCount = 0;

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    for (WorkRequest req : ua.getWorkQueue().getWorkRequestList()) {
                        if (req instanceof SubstanceAbuseCaseWorkRequest) {
                            if (((SubstanceAbuseCaseWorkRequest) req).getDrugsType().equalsIgnoreCase("MARIJUANA")) {
                                mariCount++;
                            } else if (((SubstanceAbuseCaseWorkRequest) req).getDrugsType().equalsIgnoreCase("HASHISH")) {
                                hashishCount++;
                            } else if (((SubstanceAbuseCaseWorkRequest) req).getDrugsType().equalsIgnoreCase("HEROIN")) {
                                heroinCount++;
                            } else if (((SubstanceAbuseCaseWorkRequest) req).getDrugsType().equalsIgnoreCase("OPIUM")) {
                                opiumCount++;
                            } else if (((SubstanceAbuseCaseWorkRequest) req).getDrugsType().equalsIgnoreCase("COCAINE")) {
                                cocaineCount++;
                            } else if (((SubstanceAbuseCaseWorkRequest) req).getDrugsType().equalsIgnoreCase("AMPHETAMINE")) {
                                ampCount++;
                            } else if (((SubstanceAbuseCaseWorkRequest) req).getDrugsType().equalsIgnoreCase("KETAMINE")) {
                                ketamineCount++;
                            } else if (((SubstanceAbuseCaseWorkRequest) req).getDrugsType().equalsIgnoreCase("LSD")) {
                                lsdCount++;
                            } else if (((SubstanceAbuseCaseWorkRequest) req).getDrugsType().equalsIgnoreCase("METHAMPHETAMINE")) {
                                methCount++;

                            }

                        }
                    }
                }
            }

            DefaultPieDataset pieDataset = new DefaultPieDataset();
            pieDataset.setValue("MARIJUANA", mariCount);
            pieDataset.setValue("HASHISH", hashishCount);
            pieDataset.setValue("HEROIN", heroinCount);
            pieDataset.setValue("OPIUM", opiumCount);
            pieDataset.setValue("COCAINE", cocaineCount);
            pieDataset.setValue("AMPHETAMINE", ampCount);
            pieDataset.setValue("KETAMINE", ketamineCount);
            pieDataset.setValue("LSD", lsdCount);
            pieDataset.setValue("METHAMPHETAMINE", methCount);

            JFreeChart chart = ChartFactory.createPieChart3D("Analysis by Substance Type", pieDataset, true, true, true);
            PiePlot3D P = (PiePlot3D) chart.getPlot();

            ChartPanel chartPanel = new ChartPanel(chart);
            Panel.setLayout(new BorderLayout());
            Panel.removeAll();
            Panel.add(chartPanel);
            Panel.validate();
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

        Panel = new javax.swing.JPanel();

        Panel.setBackground(new java.awt.Color(102, 102, 102));
        Panel.setForeground(new java.awt.Color(153, 153, 153));
        Panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
