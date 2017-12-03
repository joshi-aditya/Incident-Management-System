/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sneha
 */
public class HospitalOrganization extends Organization {

    public HospitalOrganization() {
        super(Organization.Type.HospitalOrganization.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new HospitalAdminRole());
        return roles;
    }

}
