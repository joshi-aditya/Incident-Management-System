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
        else if (type.getValue().equals(Organization.Type.PoliceOrganization.getValue())){
            organization = new PoliceOrganization();
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
        else if (type.getValue().equals(Organization.Type.User.getValue())){
            organization = new UserOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.GovernmentOrganization.getValue())){
            organization = new GovernmentOrganization();
            organizationList.add(organization);
        }
        
        //add Fire
        //add DrugEnforcement
        
        return organization;
    }
    
    public Organization createOrganization(Organization.Type type, String name, String address, String zipcode){
        
        Organization organization = null;
        
        if (type.getValue().equals(Organization.Type.PoliceOrganization.getValue())){
            PoliceOrganization po = new PoliceOrganization();
            po.setName(name);
            po.setAddress(address);
            po.setZipcode(zipcode);
            organizationList.add(po);
            organization = po;
        }
        return organization;
    }
    
}
