package org.example.healthcare;

public class Patient {
    private String CASE_NUMBER;
    private String PAT_ID;
    private String PAT_FIRST_NAME;
    private String PAT_MIDDLE_NAME;
    private String PAT_LAST_NAME;
    private String PAT_SEX;
    private String PAT_DOB;
    private String PAT_PLANE_TYPE;
    private String PAT_PLAN_NAME;

    // getters and setters

    public String getCASE_NUMBER() {
        return CASE_NUMBER;
    }

    public void setCASE_NUMBER(String CASE_NUMBER) {
        this.CASE_NUMBER = CASE_NUMBER;
    }

    public String getPAT_ID() {
        return PAT_ID;
    }

    public void setPAT_ID(String PAT_ID) {
        this.PAT_ID = PAT_ID;
    }

    public String getPAT_FIRST_NAME() {
        return PAT_FIRST_NAME;
    }

    public void setPAT_FIRST_NAME(String PAT_FIRST_NAME) {
        this.PAT_FIRST_NAME = PAT_FIRST_NAME;
    }

    public String getPAT_MIDDLE_NAME() {
        return PAT_MIDDLE_NAME;
    }

    public void setPAT_MIDDLE_NAME(String PAT_MIDDLE_NAME) {
        this.PAT_MIDDLE_NAME = PAT_MIDDLE_NAME;
    }

    public String getPAT_LAST_NAME() {
        return PAT_LAST_NAME;
    }

    public void setPAT_LAST_NAME(String PAT_LAST_NAME) {
        this.PAT_LAST_NAME = PAT_LAST_NAME;
    }

    public String getPAT_SEX() {
        return PAT_SEX;
    }

    public void setPAT_SEX(String PAT_SEX) {
        this.PAT_SEX = PAT_SEX;
    }

    public String getPAT_DOB() {
        return PAT_DOB;
    }

    public void setPAT_DOB(String PAT_DOB) {
        this.PAT_DOB = PAT_DOB;
    }

    public String getPAT_PLANE_TYPE() {
        return PAT_PLANE_TYPE;
    }

    public void setPAT_PLANE_TYPE(String PAT_PLANE_TYPE) {
        this.PAT_PLANE_TYPE = PAT_PLANE_TYPE;
    }

    public String getPAT_PLAN_NAME() {
        return PAT_PLAN_NAME;
    }

    public void setPAT_PLAN_NAME(String PAT_PLAN_NAME) {
        this.PAT_PLAN_NAME = PAT_PLAN_NAME;
    }
}
