/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.UserRole;
import java.util.HashSet;

/**
 *
 * @author Sneha
 */
public class UserOrganization extends Organization {
    
    public UserOrganization() {
    super(Organization.Type.User.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new UserRole() );
        return roles;
    }
    
    
}
