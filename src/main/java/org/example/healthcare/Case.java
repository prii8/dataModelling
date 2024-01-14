package org.example.healthcare;

public class Case {
    private String CASE_NUMBER;
    private String CASE_TYPE;
    private String CASE_CODE;
    private String CASE_START_DATE;
    private String CASE_END_DATE;
    private String CASE_AUTH_TYPE;

    // getters and setters

    public String getCASE_NUMBER() {
        return CASE_NUMBER;
    }

    public void setCASE_NUMBER(String CASE_NUMBER) {
        this.CASE_NUMBER = CASE_NUMBER;
    }

    public String getCASE_TYPE() {
        return CASE_TYPE;
    }

    public void setCASE_TYPE(String CASE_TYPE) {
        this.CASE_TYPE = CASE_TYPE;
    }

    public String getCASE_CODE() {
        return CASE_CODE;
    }

    public void setCASE_CODE(String CASE_CODE) {
        this.CASE_CODE = CASE_CODE;
    }

    public String getCASE_START_DATE() {
        return CASE_START_DATE;
    }

    public void setCASE_START_DATE(String CASE_START_DATE) {
        this.CASE_START_DATE = CASE_START_DATE;
    }

    public String getCASE_END_DATE() {
        return CASE_END_DATE;
    }

    public void setCASE_END_DATE(String CASE_END_DATE) {
        this.CASE_END_DATE = CASE_END_DATE;
    }

    public String getCASE_AUTH_TYPE() {
        return CASE_AUTH_TYPE;
    }

    public void setCASE_AUTH_TYPE(String CASE_AUTH_TYPE) {
        this.CASE_AUTH_TYPE = CASE_AUTH_TYPE;
    }
}
