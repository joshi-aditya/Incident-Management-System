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
    private String motive;
    private boolean isGunLegal = false;
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

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public boolean isIsGunLegal() {
        return isGunLegal;
    }

    public void setIsGunLegal(boolean isGunLegal) {
        this.isGunLegal = isGunLegal;
    }
    
    @Override
    public String toString() {
        return String.valueOf(CaseID);
    } 
    
}
