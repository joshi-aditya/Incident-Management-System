/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Neha Varshney
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        
        if (type == Enterprise.EnterpriseType.HospitalEnterprise){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.PoliceEnterprise){
            enterprise = new PoliceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else  if (type == Enterprise.EnterpriseType.GovernmentEnterprise){
            enterprise = new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }
    
    
}
