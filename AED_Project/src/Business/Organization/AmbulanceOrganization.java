/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AmbulanceStaffRole;
import Business.Role.GovernmentAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Neha Varshney
 */
public class AmbulanceOrganization extends Organization {

    public AmbulanceOrganization() {
        super(Organization.Type.AmbulanceOrganization.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new AmbulanceStaffRole());
        return roles;
    }

}
