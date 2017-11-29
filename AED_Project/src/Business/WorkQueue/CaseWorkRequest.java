/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Sneha
 */
public class CaseWorkRequest extends WorkRequest {
//    
    private UserAccount incidentReportedBy;
    private Date incidentOcuredDate;
    private String suspectName;
    private int caseID; 
    private static int counter = 1;

    public CaseWorkRequest() {
        caseID = counter;
        
    }

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    
    public UserAccount getIncidentReportedBy() {
        return incidentReportedBy;
    }

    public void setIncidentReportedBy(UserAccount incidentReportedBy) {
        this.incidentReportedBy = incidentReportedBy;
    }

    public Date getIncidentOcuredDate() {
        return incidentOcuredDate;
    }

    public void setIncidentOcuredDate(Date incidentOcuredDate) {
        this.incidentOcuredDate = incidentOcuredDate;
    }

    public String getSuspectName() {
        return suspectName;
    }

    public void setSuspectName(String suspectName) {
        this.suspectName = suspectName;
    }
    

}
