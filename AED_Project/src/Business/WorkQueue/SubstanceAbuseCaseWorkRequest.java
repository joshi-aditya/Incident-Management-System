/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Random;
import java.util.Date;

/**
 *
 * @author joshiaditya
 */
public class SubstanceAbuseCaseWorkRequest extends CaseWorkRequest{
    
    private String testResult;
    private Date testResultDate;
   // private int CaseID;
    
    public SubstanceAbuseCaseWorkRequest(){
        super();
        //Random random = new Random();
        //CaseID = random.nextInt(99999999);
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Date getTestResultDate() {
        return testResultDate;
    }

    public void setTestResultDate(Date testResultDate) {
        this.testResultDate = testResultDate;
    }

    //public int getCaseID() {
      //  return CaseID;
    //}
    
    @Override
    public String toString() {
        return String.valueOf(super.getCaseID());
    } 
}
