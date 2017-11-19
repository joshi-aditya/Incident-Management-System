/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Neha Varshney
 */
public class DrugEnforcementOrganization extends Organization{
   
    public DrugEnforcementOrganization() {
    super(Organization.Type.DrugEnforcementOrganization.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        
        return null;
    }
    
    
}
