/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Sneha
 */
public class CaseWorkRequest extends WorkRequest {
//    
    private UserAccount incidentReportedBy;
    private Date incidentOcuredDate;
    private String suspectName;
    private String initialObservation;
    private String incidentType;
    private String address;
    private String zipCode;
    private int CaseID;
    private double latitute;
    private double longitude;
    //private String status;

    public CaseWorkRequest() {
        Random random = new Random();
        CaseID = random.nextInt(99999999);
    }
    
    public int getCaseID() {
        return CaseID;
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

    public String getInitialObservation() {
        return initialObservation;
    }

    public void setInitialObservation(String initialObservation) {
        this.initialObservation = initialObservation;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getLatitute() {
        return latitute;
    }

    public void setLatitute(double latitute) {
        this.latitute = latitute;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return String.valueOf(CaseID);
    }
}
