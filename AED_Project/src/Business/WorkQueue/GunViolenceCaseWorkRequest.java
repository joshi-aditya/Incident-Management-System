/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import java.util.Random;
/**
 *
 * @author joshiaditya
 */
public class GunViolenceCaseWorkRequest extends CaseWorkRequest{
    
    private String gunType;
    private int CaseID;
    
    public GunViolenceCaseWorkRequest(){
        Random random = new Random();
        CaseID = random.nextInt(99999999);
    }

    public int getCaseID() {
        return CaseID;
    }

    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }
    
    @Override
    public String toString() {
        return String.valueOf(CaseID);
    } 
    
}
