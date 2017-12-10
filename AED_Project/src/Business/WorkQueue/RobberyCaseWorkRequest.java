/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author joshiaditya
 */
public class RobberyCaseWorkRequest extends CaseWorkRequest{
    
    private String valueRobbed;
    private boolean isSuspectArmed = false;
    
    public RobberyCaseWorkRequest(){
        super();
    }

    public String getValueRobbed() {
        return valueRobbed;
    }

    public void setValueRobbed(String valueRobbed) {
        this.valueRobbed = valueRobbed;
    }

    public boolean isIsSuspectArmed() {
        return isSuspectArmed;
    }

    public void setIsSuspectArmed(boolean isSuspectArmed) {
        this.isSuspectArmed = isSuspectArmed;
    }
}
