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
    
    String address;
    String zipCode;
    int incidentId;
    private static int counter =0;
    double latitude;
    double longitude;

    public IncidentWorkRequest() {
        counter ++;
        incidentId = counter;
    }
    
    public enum IncidentType{
        
        Gun_Violence("Gun Violence"),
        Substance_Abuse("Substance Abuse"),
        Accident("Accident"),
        Fire_Incident("Fire Incident");
        
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
    
    @Override
    public String toString() {
        return address;
    }
}
