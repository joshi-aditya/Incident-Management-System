/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author joshiaditya
 */
public class SubstanceAbuseCaseWorkRequest extends CaseWorkRequest{
    
    private String suspectAddress;
    private String drugsType;
    
    public SubstanceAbuseCaseWorkRequest(){
        super();
    }

    public String getSuspectAddress() {
        return suspectAddress;
    }

    public void setSuspectAddress(String suspectAddress) {
        this.suspectAddress = suspectAddress;
    }

    public String getDrugsType() {
        return drugsType;
    }

    public void setDrugsType(String drugsType) {
        this.drugsType = drugsType;
    }
    
}
