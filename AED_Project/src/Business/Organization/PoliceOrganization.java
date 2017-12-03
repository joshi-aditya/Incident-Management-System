/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.PoliceAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Neha Varshney
 */
public class PoliceOrganization extends Organization {

    public PoliceOrganization() {
        super(Type.PoliceOrganization.getValue());
    }
    
    private String name;
    private String address;
    private String zipcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
       roles= new HashSet<>();
        roles.add(new PoliceAdminRole() );
        return roles;
    }
    
}
