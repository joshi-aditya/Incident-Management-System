/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.HospitalAdminRole;
import Business.Role.PoliceAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Neha Varshney
 */
public class HospitalEnterprise extends Enterprise {
    
    public HospitalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.HospitalEnterprise);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new HospitalAdminRole());
        return roles;
    }
    
}
