/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.PoliceAdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Neha Varshney
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ArrayList locationList;
    Map<Integer,ArrayList<String>> TimingMap;
    private ArrayList<String>  infoString;
    
    public ArrayList getLocationList() { 
        return locationList;
    }

    public void setLocationList(ArrayList locationList) {
        this.locationList = locationList;
    }
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public Map<Integer, ArrayList<String>> getTimingMap() {
        return TimingMap;
    }

    public void setTimingMap(Map<Integer, ArrayList<String>> TimingMap) {
        this.TimingMap = TimingMap;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public static void setInstance(EcoSystem system) {
        business = system;
    }
    
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        roles.add(new PoliceAdminRole());
        //roles.add(new DistributorAdminRole());
        //roles.add(new CDCAdminRole());
        return roles;
    }

    public ArrayList<String> getInfoString() {
        return infoString;
    }

    public void setInfoString(ArrayList<String> infoString) {
        this.infoString = infoString;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

      //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            for (Network network : business.getNetworkList()) {
                 
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUserName().equals(username)){
                            return false;
                        }
                    }
                    
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                            if(ua.getUserName().equals(username)){
                                return false;
                            }
                        }
                    }
                }
            }
            
      //  }
        return true;
    }
}