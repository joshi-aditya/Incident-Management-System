/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Random;

/**
 *
 * @author Sneha
 */
public class HospitalWorkRequest extends WorkRequest {

    private String testResult;
    private int caseId;
    private int requestId;
    private String testsRequested;
    
    public HospitalWorkRequest(){
        Random random = new Random();
        requestId = random.nextInt(99999999);
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public int getRequestId() {
        return requestId;
    }
    
    public String getTestsRequested() {
        return testsRequested;
    }

    public void setTestsRequested(String testsRequested) {
        this.testsRequested = testsRequested;
    }

    @Override
    public String toString() {
        return testsRequested;
    }
}
