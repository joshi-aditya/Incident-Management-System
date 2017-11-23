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
    int pinCode;
    
    
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
    
    
  
}
