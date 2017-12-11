/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author joshiaditya
 */
public class RobberyCaseWorkRequest extends CaseWorkRequest{
    
    private String valueRobbed;
    private boolean isSuspectArmed;
    private boolean suspectNotArmed;
    private int incidentID;
    private boolean associatedWithGang;
    private boolean notAssociatedWithGang;
    private String officerComments;
    private String gangName;
    
    public RobberyCaseWorkRequest(){
        super();
    }

    public String getValueRobbed() {
        return valueRobbed;
    }

    public void setValueRobbed(String valueRobbed) {
        this.valueRobbed = valueRobbed;
    }

    public boolean isIsSuspectArmed() {
        return isSuspectArmed;
    }

    public void setIsSuspectArmed(boolean isSuspectArmed) {
        this.isSuspectArmed = isSuspectArmed;
    }

    public boolean isSuspectNotArmed() {
        return suspectNotArmed;
    }

    public void setSuspectNotArmed(boolean suspectNotArmed) {
        this.suspectNotArmed = suspectNotArmed;
    }

    public int getIncidentID() {
        return incidentID;
    }

    public void setIncidentID(int incidentID) {
        this.incidentID = incidentID;
    }

    public boolean isAssociatedWithGang() {
        return associatedWithGang;
    }

    public void setAssociatedWithGang(boolean associatedWithGang) {
        this.associatedWithGang = associatedWithGang;
    }

    public boolean isNotAssociatedWithGang() {
        return notAssociatedWithGang;
    }

    public void setNotAssociatedWithGang(boolean notAssociatedWithGang) {
        this.notAssociatedWithGang = notAssociatedWithGang;
    }

    public String getOfficerComments() {
        return officerComments;
    }

    public void setOfficerComments(String officerComments) {
        this.officerComments = officerComments;
    }

    public String getGangName() {
        return gangName;
    }

    public void setGangName(String gangName) {
        this.gangName = gangName;
    }
    
    @Override
    public String toString() {
        return String.valueOf(super.getCaseID());
    } 
}
