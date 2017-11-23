/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Incident;

/**
 *
 * @author Neha Varshney
 */
public class Incident {
   
    String address;
    String status;
    int zipCode;
    int incidentId;
    private static int counter =0;

    public Incident() {
        counter ++;
        incidentId = counter;
    }
    
    
    
    public enum IncidentType{
        
        Gun_Violence("GunViolence"),
        Substance_Abuse("Substance_Abuse"),
        Accident("Accident"),
        Fire_Incident("Fire_Incident");
        
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getIncidentId() {
        return incidentId;
    }
    
    @Override
    public String toString() {
        return address;
    }
    
  
}
