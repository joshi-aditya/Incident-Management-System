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
public class GunViolenceCaseWorkRequest extends CaseWorkRequest{
    
    private String gunType;
    private String motive;
    private boolean isGunLegal;
    private boolean isGunIllegal;
    private int incidentID;   
    private String suspectAddress;
    private boolean gunViolenceHistory;
    private boolean noGunViolenceHistory;
    private boolean associatedWithGang;
    private boolean notAssociatedWithGang;
    private String officerComments;
    private String gangName;
    private Date suspectDateOfBirth;
    
    public int getIncidentID() {
        return incidentID;
    }

    public void setIncidentID(int incidentID) {
        this.incidentID = incidentID;
    }
    
    public GunViolenceCaseWorkRequest(){
        super();
    }

    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public boolean isIsGunLegal() {
        return isGunLegal;
    }

    public void setIsGunLegal(boolean isGunLegal) {
        this.isGunLegal = isGunLegal;
    }

    public String getSuspectAddress() {
        return suspectAddress;
    }

    public void setSuspectAddress(String suspectAddress) {
        this.suspectAddress = suspectAddress;
    }

    public boolean isGunViolenceHistory() {
        return gunViolenceHistory;
    }

    public void setGunViolenceHistory(boolean gunViolenceHistory) {
        this.gunViolenceHistory = gunViolenceHistory;
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

    public String getGangName() {
        return gangName;
    }

    public void setGangName(String gangName) {
        this.gangName = gangName;
    }

    public boolean isIsGunIllegal() {
        return isGunIllegal;
    }

    public void setIsGunIllegal(boolean isGunIllegal) {
        this.isGunIllegal = isGunIllegal;
    }

    public boolean isNoGunViolenceHistory() {
        return noGunViolenceHistory;
    }

    public void setNoGunViolenceHistory(boolean noGunViolenceHistory) {
        this.noGunViolenceHistory = noGunViolenceHistory;
    }

    public boolean isNotAssociatedWithGang() {
        return notAssociatedWithGang;
    }

    public void setNotAssociatedWithGang(boolean notAssociatedWithGang) {
        this.notAssociatedWithGang = notAssociatedWithGang;
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
