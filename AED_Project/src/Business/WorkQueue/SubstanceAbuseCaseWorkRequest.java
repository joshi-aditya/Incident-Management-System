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
    
    private int incidentID;
    private String suspectAddress;
    private String drugsType;
    private boolean hasSubsAbuseHistory;
    private boolean noSubsAbuseHistory;
    private boolean suspectSellingDrugs;
    private boolean notSellingDrugs;
    private boolean suspectMakingDrugs;
    private boolean notMakingDrugs;
    private String drugSellerName;
    private boolean associatedWithGang;
    private boolean notAssociatedWithGang;
    private String officerComments;
    private String drugSellerAddress;
    private String gangName;
    private Date suspectDateOfBirth;
    
    public SubstanceAbuseCaseWorkRequest(){
        super();
    }

    public int getIncidentID() {
        return incidentID;
    }

    public void setIncidentID(int incidentID) {
        this.incidentID = incidentID;
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

    public boolean isHasSubsAbuseHistory() {
        return hasSubsAbuseHistory;
    }

    public void setHasSubsAbuseHistory(boolean hasSubsAbuseHistory) {
        this.hasSubsAbuseHistory = hasSubsAbuseHistory;
    }

    public boolean isNoSubsAbuseHistory() {
        return noSubsAbuseHistory;
    }

    public void setNoSubsAbuseHistory(boolean noSubsAbuseHistory) {
        this.noSubsAbuseHistory = noSubsAbuseHistory;
    }

    public boolean isSuspectSellingDrugs() {
        return suspectSellingDrugs;
    }

    public void setSuspectSellingDrugs(boolean suspectSellingDrugs) {
        this.suspectSellingDrugs = suspectSellingDrugs;
    }

    public boolean isNotSellingDrugs() {
        return notSellingDrugs;
    }

    public void setNotSellingDrugs(boolean notSellingDrugs) {
        this.notSellingDrugs = notSellingDrugs;
    }

    public boolean isSuspectMakingDrugs() {
        return suspectMakingDrugs;
    }

    public void setSuspectMakingDrugs(boolean suspectMakingDrugs) {
        this.suspectMakingDrugs = suspectMakingDrugs;
    }

    public boolean isNotMakingDrugs() {
        return notMakingDrugs;
    }

    public void setNotMakingDrugs(boolean notMakingDrugs) {
        this.notMakingDrugs = notMakingDrugs;
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

    public Date getSuspectDateOfBirth() {
        return suspectDateOfBirth;
    }

    public void setSuspectDateOfBirth(Date suspectDateOfBirth) {
        this.suspectDateOfBirth = suspectDateOfBirth;
    }
    
    @Override
    public String toString() {
        return String.valueOf(super.getCaseID());
    } 
}
