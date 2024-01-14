package org.example.healthcare;

public class Service {
    private String CASE_NUMBER;
    private String SVC_ID;
    private String SVC_TYPE;
    private String SVC_CODE;
    private String SVC_FAC_ID;
    private String SVC_FAC_NAME;
    private String SVC_PHY_ID;
    private String SVC_PHY_NAME;

    // getters and setters

    public String getCASE_NUMBER() {
        return CASE_NUMBER;
    }

    public void setCASE_NUMBER(String CASE_NUMBER) {
        this.CASE_NUMBER = CASE_NUMBER;
    }

    public String getSVC_ID() {
        return SVC_ID;
    }

    public void setSVC_ID(String SVC_ID) {
        this.SVC_ID = SVC_ID;
    }

    public String getSVC_TYPE() {
        return SVC_TYPE;
    }

    public void setSVC_TYPE(String SVC_TYPE) {
        this.SVC_TYPE = SVC_TYPE;
    }

    public String getSVC_CODE() {
        return SVC_CODE;
    }

    public void setSVC_CODE(String SVC_CODE) {
        this.SVC_CODE = SVC_CODE;
    }

    public String getSVC_FAC_ID() {
        return SVC_FAC_ID;
    }

    public void setSVC_FAC_ID(String SVC_FAC_ID) {
        this.SVC_FAC_ID = SVC_FAC_ID;
    }

    public String getSVC_FAC_NAME() {
        return SVC_FAC_NAME;
    }

    public void setSVC_FAC_NAME(String SVC_FAC_NAME) {
        this.SVC_FAC_NAME = SVC_FAC_NAME;
    }

    public String getSVC_PHY_ID() {
        return SVC_PHY_ID;
    }

    public void setSVC_PHY_ID(String SVC_PHY_ID) {
        this.SVC_PHY_ID = SVC_PHY_ID;
    }

    public String getSVC_PHY_NAME() {
        return SVC_PHY_NAME;
    }

    public void setSVC_PHY_NAME(String SVC_PHY_NAME) {
        this.SVC_PHY_NAME = SVC_PHY_NAME;
    }
}
