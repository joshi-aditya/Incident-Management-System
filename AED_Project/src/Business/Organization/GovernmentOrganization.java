/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentAdminRole;
import Business.Role.Role;
import Business.Role.UserRole;
import java.util.HashSet;

/**
 *
 * @author Sneha
 */
public class GovernmentOrganization  extends Organization{
    
    
    public GovernmentOrganization() {
    super(Organization.Type.GovernmentOrganization.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new GovernmentAdminRole() );
        return roles;
    }
}
