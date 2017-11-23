/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Incident;

import java.util.ArrayList;

/**
 *
 * @author Neha Varshney
 */
public class IncidentDirectory {
    
    private ArrayList<Incident> incidentDirectory;

    public IncidentDirectory() {
        
        incidentDirectory = new ArrayList<>() ;
    
    }

    public ArrayList<Incident> getIncidentDirectory() {
        return incidentDirectory;
    }
    
    public Incident AuthenticateIncident(Incident incident)
    {
        if(incident.getStatus().toLowerCase().equals("valid")){
            return incident;
        }
        
        return null ;
    }
    
    public Incident createIncident(String type, String address, int zipCode)
    {
        Incident incident = new Incident();
        incident.setAddress(address);
        incident.setZipCode(zipCode);
        incidentDirectory.add(incident);
        return incident;
        
    }
    
    
    
    
    
}
