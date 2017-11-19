/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.PoliceOfficerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Neha Varshney
 */
public class AmbulanceEnterprise extends Enterprise {
    
        public AmbulanceEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.AmbulanceEnterprise);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new PoliceOfficerRole());
        return roles;
    }
    
}
