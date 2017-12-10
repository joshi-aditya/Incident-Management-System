/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author joshiaditya
 */
public class SubstanceAbuseCaseWorkRequest extends CaseWorkRequest{
    
    private String testResult;
    private Date testResultDate;
    private int incidentID;
   // private int CaseID;
    private String suspectAddress;
    private String drugsType;
    private boolean subsAbuseHistory;
    private boolean sellingDrugs;
    private boolean makingDrugs;
    private String drugSellerName;
    private boolean associatedWithGang;
    private String officerComments;
    private String drugSellerAddress;
    private String gangName;
    
    public SubstanceAbuseCaseWorkRequest(){
        super();
    }

    public int getIncidentID() {
        return incidentID;
    }

    public void setIncidentID(int incidentID) {
        this.incidentID = incidentID;
    }


    public String getTestResult() {
        return testResult;
    }
    
    public String getSuspectAddress() {
        return suspectAddress;
    }

    public void setSuspectAddress(String suspectAddress) {
        this.suspectAddress = suspectAddress;
    }

    public String getDrugsType() {
        return drugsType;
    }

    public void setDrugsType(String drugsType) {
        this.drugsType = drugsType;
    }

    public boolean isSubsAbuseHistory() {
        return subsAbuseHistory;
    }

    public void setSubsAbuseHistory(boolean subsAbuseHistory) {
        this.subsAbuseHistory = subsAbuseHistory;
    }

    public boolean isSellingDrugs() {
        return sellingDrugs;
    }

    public void setSellingDrugs(boolean sellingDrugs) {
        this.sellingDrugs = sellingDrugs;
    }

    public boolean isMakingDrugs() {
        return makingDrugs;
    }

    public void setMakingDrugs(boolean makingDrugs) {
        this.makingDrugs = makingDrugs;
    }

    public String getDrugSellerName() {
        return drugSellerName;
    }

    public void setDrugSellerName(String drugSellerName) {
        this.drugSellerName = drugSellerName;
    }

    public boolean isAssociatedWithGang() {
        return associatedWithGang;
    }

    public void setAssociatedWithGang(boolean associatedWithGang) {
        this.associatedWithGang = associatedWithGang;
    }

    public String getOfficerComments() {
        return officerComments;
    }

    public void setOfficerComments(String officerComments) {
        this.officerComments = officerComments;
    }

    public String getDrugSellerAddress() {
        return drugSellerAddress;
    }

    public void setDrugSellerAddress(String drugSellerAddress) {
        this.drugSellerAddress = drugSellerAddress;
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
