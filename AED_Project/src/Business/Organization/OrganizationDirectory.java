/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Neha Varshney
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.AmbulanceOrganization.getValue())){
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BPDOrganization.getValue())){
            organization = new BPDOrganization();
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Organization.Type.CivilCourtOrganization.getValue())){
            organization = new CivilCourtOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CriminalCourtOrganization.getValue())){
            organization = new CriminalCourtOrganization();
            organizationList.add(organization);
        }
        
        //add Fire
        //add DrugEnforcement
        
        return organization;
    }
    
}
