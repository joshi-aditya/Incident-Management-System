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
public class IncidentWorkRequest extends WorkRequest{
    
    IncidentType incidentType;
    String address;
    String zipCode;
    int incidentId;
    private static int counter =0;
    double latitude;
    double longitude;
    String status;
    boolean caseCreated = false;

    public IncidentWorkRequest() {
        counter ++;
        incidentId = counter;
    }
    
    public enum IncidentType{
        
        Gun_Violence("Gun Violence"),
        Substance_Abuse("Substance Abuse"),
        Robbery("Robbery");
        
        private String value;
        
        private IncidentType(String value){
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
        
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public IncidentType getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(IncidentType incidentType) {
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

    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        IncidentWorkRequest.counter = counter;
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

    public boolean isCaseCreated() {
        return caseCreated;
    }

    public void setCaseCreated(boolean caseCreated) {
        this.caseCreated = caseCreated;
    }
    
    @Override
    public String toString() {
        return String.valueOf(incidentId);
    }
}
