/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Neha Varshney
 */
public class ConfigureASystem {
    
     public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
         System.err.println("");
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        
        //UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("uadmin", "uadmin",new UserAdminRole1());
        
        
        
        return system;
    }
}
