/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Role.GovernmentAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sneha
 */
public class GovernmentEnterprise extends Enterprise {
    
     public GovernmentEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.GovernmentEnterprise);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
    
}
