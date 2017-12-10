/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        
        Map<Integer, ArrayList<String>>TimingMap = new HashMap<Integer, ArrayList<String>>();
        system.setTimingMap(TimingMap);
        ArrayList<String >infoString = new ArrayList<>();
        system.setInfoString(infoString);
        return system;
    }
}
