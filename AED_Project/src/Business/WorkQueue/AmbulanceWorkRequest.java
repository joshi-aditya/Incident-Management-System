/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Neha Varshney
 */
public class AmbulanceWorkRequest  extends WorkRequest{
    
    String incidentType;
    String address;
    private Date incidentOcuredDate;
    String zipCode;
    String message;
    int ambulanceCaseId;
    private static int counter =0;
    double latitude;
    double longitude;
    String status;
    boolean caseCreated = false;

    public AmbulanceWorkRequest() {
       counter ++;
       ambulanceCaseId = counter; 
       incidentOcuredDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    
    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public Date getIncidentOcuredDate() {
        return incidentOcuredDate;
    }

    public void setIncidentOcuredDate(Date incidentOcuredDate) {
        this.incidentOcuredDate = incidentOcuredDate;
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

    public int getAmbulanceCaseId() {
        return ambulanceCaseId;
    }

    public void setAmbulanceCaseId(int ambulanceCaseId) {
        this.ambulanceCaseId = ambulanceCaseId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCaseCreated() {
        return caseCreated;
    }

    public void setCaseCreated(boolean caseCreated) {
        this.caseCreated = caseCreated;
    }
    
    @Override
    public String toString() {
        return String.valueOf(ambulanceCaseId);
    }
    
}
